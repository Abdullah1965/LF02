package dao;

import businessObjects.Adresse;
import businessObjects.Kunde;

import java.sql.*;
import java.util.ArrayList;

public class KundeDao {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Bibilothek/src/data/bucher.db";
    Connection connection;

    public KundeDao()throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    public Kunde read(String ausweisNr) {
        Kunde kunde = null;
        connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM Bibilothek WHERE Nr = ?";
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
            kunde = new Kunde(vorname, nachname);
            kunde.setAusweisNr(nr);
            kunde.setAdresse(new Adresse(strasse, hausNr, plz, ort));


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
        return kunde;
    }

    public ArrayList<Kunde> read() {

        ArrayList<Kunde> KundeArrayList = null;
        connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM Bibilothek";
            preparedStatement = connection.prepareStatement(sql);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            KundeArrayList = new ArrayList<>();

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

                Kunde vertragspartner = new Kunde(vorname, nachname);
                vertragspartner.setAusweisNr(nr);
                vertragspartner.setAdresse(new Adresse(strasse, hausNr, plz, ort));

                KundeArrayList.add(vertragspartner);

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
        return KundeArrayList;
    }
    public Kunde create(Kunde kunde) throws Exception {

        connection = null;

        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "INSERT INTO Bibilothek VALUES (?,?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kunde.getAusweisNr());
            preparedStatement.setString(2, kunde.getVorname());
            preparedStatement.setString(3, kunde.getNachname());
            preparedStatement.setString(4, kunde.getAdresse().getStrasse());
            preparedStatement.setString(5, kunde.getAdresse().getHausNr());
            preparedStatement.setString(6, kunde.getAdresse().getPlz());
            preparedStatement.setString(7, kunde.getAdresse().getOrt());


            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Doppelte ausweisnummer, Der vertragspartner mit der ausweisnummer " + kunde.getAusweisNr());
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
        return kunde;
    }


    public void delete(String ausweisNr) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "DELETE FROM Bibilothek WHERE ausweisNr = ?";
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
            String sql = "UPDATE Bibilothek SET strasse = ?,hausNr = ? WHERE ausweisNr = ?";
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



}
