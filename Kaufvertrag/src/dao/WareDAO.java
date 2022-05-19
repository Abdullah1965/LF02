package dao;

import businessObjects.Ware;

import java.sql.*;

import static java.lang.Class.forName;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Vetragspather.db";

    public WareDAO() throws ClassNotFoundException {
        forName(CLASSNAME);
    }

    /**
     * Liest einen Vertragspartner auf Basis seiner Ausweisnummer
     * @param bezeichnung die Ausweisnummer
     * @return Der gewünschte Vertragspartner
     */

    public Ware read(String bezeichnung) {
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspartner WHERE bezeichnung = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bezeichnung);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //ResultSet auswerten
            String bz = resultSet.getString("bezeichnung");
            String bs = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");

            //Vertragspartner erstellen
            ware = new Ware(bz,preis);
            ware.setBeschreibung(bs);
            ware.getBesonderheitenListe().add(besonderheiten);
            ware.getMaengelListe().add(maengel);
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
}
