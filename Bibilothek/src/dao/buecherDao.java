package dao;

import businessObjects.Buecher;

import java.sql.*;
import java.util.ArrayList;

public class buecherDao {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Bibilothek/src/data/bucher.db";
    Connection connection;

    public buecherDao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }


    public Buecher read(String Nr) {
        Buecher buecher = null;
        connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM buecher WHERE Nr = ?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, Nr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //ResultSet auswerten
            String warennr = resultSet.getString("Nr");
            String title = resultSet.getString("Title");
            String author = resultSet.getString("Author");
            int pages = resultSet.getInt("Pages");
            double preis = resultSet.getDouble("preis");
            String category = resultSet.getString("Category");
            String language = resultSet.getString("Language");

            //Vertragspartner erstellen
            buecher = new Buecher(warennr,title,preis);
            buecher.setAuthor(author);
            buecher.setPages(pages);
            buecher.setLanguage(language);


            if (category != null){
                String[] maengelArray = category.split(";");
                for (String s: maengelArray){
                    buecher.getCategory().add(s);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return buecher;
    }

    public ArrayList<Buecher> read(){
        ArrayList<Buecher> buecherArrayList = null;
        connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM buecher";
            preparedStatement = connection.prepareStatement(sql);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            buecherArrayList = new ArrayList<>();

            //Zeiger auf den ersten Datensatz setzen
            while (resultSet.next()) {
                Buecher buecher = creatObject(resultSet);
                buecherArrayList.add(buecher);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return buecherArrayList;
    }

    private Buecher creatObject(ResultSet resultSet) throws SQLException {
        Buecher buecher = null;
        try {
            String warennr = resultSet.getString("Nr");
            String title = resultSet.getString("Title");
            String author = resultSet.getString("Author");
            int pages = resultSet.getInt("Pages");
            double preis = resultSet.getDouble("preis");
            String category = resultSet.getString("Category");
            String language = resultSet.getString("Language");

            //Vertragspartner erstellen
            buecher = new Buecher(warennr,title,preis);
            buecher.setAuthor(author);
            buecher.setPages(pages);
            buecher.setLanguage(language);


            if (category != null){
                String[] maengelArray = category.split(";");
                for (String s: maengelArray){
                    buecher.getCategory().add(s);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return buecher;
    }

    public Buecher create(Buecher buecher) throws Exception {

        connection = null;

        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "INSERT INTO buecher VALUES (?,?,?,?,?,?,?)";


            String category = " ";
            for (String b : buecher.getCategory()){
                category += b + "; ";
            }

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,buecher.getNr());
            preparedStatement.setString(2,buecher.getTitel());
            preparedStatement.setString(3,buecher.getAuthor());
            preparedStatement.setInt(4,buecher.getPages());
            preparedStatement.setDouble(5,buecher.getPrice());
            preparedStatement.setString(6,category);
            preparedStatement.setString(7,buecher.getLanguage());

            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new Exception();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return buecher;
    }


    public void delete(String Nr) {
        connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "DELETE FROM buecher WHERE Nr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, Nr);
            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(String Nr, double preis, String title, String category) {
        connection = null;
        PreparedStatement preparedStatement = null;
        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "UPDATE buecher SET Title = ?,Price = ?,Category = ? WHERE Nr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, title );
            preparedStatement.setDouble(2, preis);
            preparedStatement.setString(3, category);
            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}