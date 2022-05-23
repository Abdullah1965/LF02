package dao;

import businessObjects.Ware;

import java.sql.*;
import java.util.ArrayList;

import static java.lang.Class.forName;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Vetragspather.db";
    private Connection connection;
    public WareDAO() throws ClassNotFoundException {
        forName(CLASSNAME);
    }

    /**
     * Liest einen Vertragspartner auf Basis seiner Ausweisnummer
     * @param warenNr die Ausweisnummer
     * @return Der gewünschte Vertragspartner
     */

    public Ware read(String warenNr) {
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM ware WHERE warenNr = ?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, warenNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //ResultSet auswerten
           int warennr = resultSet.getInt("warenNr");
            String bz = resultSet.getString("bezeichnung");
            String bs = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");

            //Vertragspartner erstellen
            ware = new Ware(bz,preis);
            ware.setWarenNr(warennr);
            ware.setBeschreibung(bs);

            if (besonderheiten != null){
                String[] besonderheitenArray = besonderheiten.split(";");
                for (String b: besonderheitenArray){
                    ware.getBesonderheitenListe().add(b);
                }
            }

            if (maengel != null){
                String[] maengelArray = maengel.split(";");
                for (String maegel: maengelArray){
                   ware.getMaengelListe().add(maegel);
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
        return ware;
    }
    public ArrayList<Ware> read(){
        ArrayList<Ware> wareArrayList = null;
        connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM ware";
            preparedStatement = connection.prepareStatement(sql);



            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            wareArrayList = new ArrayList<>();

            //Zeiger auf den ersten Datensatz setzen
            while (resultSet.next()) {

                //ResultSet auswerten
                int warennr = resultSet.getInt("warenNr");
                String bz = resultSet.getString("bezeichnung");
                String bs = resultSet.getString("beschreibung");
                double preis = resultSet.getDouble("preis");
                String besonderheiten = resultSet.getString("besonderheiten");
                String maengel = resultSet.getString("maengel");

                //Vertragspartner erstellen
                Ware ware = new Ware(bz, preis);
                ware.setWarenNr(warennr);
                ware.setBeschreibung(bs);

                if (besonderheiten != null) {
                    String[] besonderheitenArray = besonderheiten.split(";");
                    for (String b : besonderheitenArray) {
                        ware.getBesonderheitenListe().add(b);
                    }
                }

                if (maengel != null) {
                    String[] maengelArray = maengel.split(";");
                    for (String maegel : maengelArray) {
                        ware.getMaengelListe().add(maegel);
                    }
                }
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
        return wareArrayList;
    }
}

    }
}