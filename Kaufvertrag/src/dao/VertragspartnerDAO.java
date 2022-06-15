package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import java.sql.*;

import static java.lang.Class.forName;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import java.sql.*;
import java.util.ArrayList;

public class VertragspartnerDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Vetragspather.db";
    Connection connection;

    public VertragspartnerDAO() throws ClassNotFoundException {
        forName(CLASSNAME);
    }

    /**
     * Liest einen Vertragspartner auf Basis seiner Ausweisnummer
     *
     * @param ausweisNr die Ausweisnummer
     * @return Der gewünschte Vertragspartner
     */

    public Vertragspartner read(String ausweisNr) {
        Vertragspartner vertragspartner = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspather WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //ResultSet auswerten
            String nr = resultSet.getString("ausweisNr");
            String vorname = resultSet.getString("vorname");
            String nachname = resultSet.getString("nachname");
            String strasse = resultSet.getString("strasse");
            String hausNr = resultSet.getString("hausNr");
            String plz = resultSet.getString("plz");
            String ort = resultSet.getString("ort");

            //Vertragspartner erstellen
            vertragspartner = new Vertragspartner(vorname, nachname);
            vertragspartner.setAusweisNr(nr);
            vertragspartner.setAdresse(new Adresse(strasse, hausNr, plz, ort));


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
        return vertragspartner;
    }

    public ArrayList<Vertragspartner> read() {

        ArrayList<Vertragspartner> vertragspartnerArrayList = null;
        connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspather";
            preparedStatement = connection.prepareStatement(sql);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            vertragspartnerArrayList = new ArrayList<>();

            //Zeiger auf den ersten Datensatz setzen
            while (resultSet.next()) {

                //ResultSet auswerten

                String nr = resultSet.getString("ausweisNr");
                String vorname = resultSet.getString("vorname");
                String nachname = resultSet.getString("nachname");
                String strasse = resultSet.getString("strasse");
                String hausNr = resultSet.getString("hausNr");
                String plz = resultSet.getString("plz");
                String ort = resultSet.getString("ort");

                Vertragspartner vertragspartner = new Vertragspartner(vorname, nachname);
                vertragspartner.setAusweisNr(nr);
                vertragspartner.setAdresse(new Adresse(strasse, hausNr, plz, ort));

                vertragspartnerArrayList.add(vertragspartner);

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
        return vertragspartnerArrayList;
    }

    public Vertragspartner create(Vertragspartner vertragspartner) throws Exception {

        connection = null;

        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "INSERT INTO vertragspather VALUES (?,?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, vertragspartner.getAusweisNr());
            preparedStatement.setString(2, vertragspartner.getVorname());
            preparedStatement.setString(3, vertragspartner.getNachname());
            preparedStatement.setString(4, vertragspartner.getAdresse().getStrasse());
            preparedStatement.setString(5, vertragspartner.getAdresse().getHausNr());
            preparedStatement.setString(6, vertragspartner.getAdresse().getPlz());
            preparedStatement.setString(7, vertragspartner.getAdresse().getOrt());


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
        return vertragspartner;
    }


    public void delete(String ausweisNr) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "DELETE FROM vertragspather WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);
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

    public void update(String ausweisNr, String strasse, String hausNr) {
        connection = null;
        PreparedStatement preparedStatement = null;
        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "UPDATE vertragspather SET strasse = ?,hausNr = ? WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, strasse );
            preparedStatement.setString(2, hausNr);
            preparedStatement.setString(3, ausweisNr);
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


    private Vertragspartner createObject(ResultSet resultSet) throws SQLException {
        //ResultSet auswerten
        String nr = resultSet.getString("ausweisNr");
        String vorname = resultSet.getString("vorname");
        String nachname = resultSet.getString("nachname");
        String strasse = resultSet.getString("strasse");
        String hausNr = resultSet.getString("hausNr");
        String plz = resultSet.getString("plz");
        String ort = resultSet.getString("ort");



        //Vertragspartner erstellen

        Vertragspartner vertragspartner = new Vertragspartner(vorname, nachname);

        vertragspartner.setAusweisNr(nr);

        Adresse adresse = new Adresse(strasse, hausNr, plz, ort);

        vertragspartner.setAdresse(adresse);



        return vertragspartner;

    }

}
