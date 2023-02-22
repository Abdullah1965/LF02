package dao;

import businessObjects.Vertragspartner;
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
     *
     * @param warenNr die Ausweisnummer
     * @return Der gewünschte Vertragspartner
     */

    public Ware read(String warenNr) {
        Ware ware = null;
        connection = null;
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
            String warennr = resultSet.getString("warenNr");
            String bz = resultSet.getString("bezeichnung");
            String bs = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");

            //Vertragspartner erstellen
            ware = new Ware(bz, preis);
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

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
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
                    System.out.println(e.getMessage());
                }
            }
        }
        return ware;
    }

    public ArrayList<Ware> read() {
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
                Ware ware = creatObject(resultSet);
                wareArrayList.add(ware);
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

    private Ware creatObject(ResultSet resultSet) {
        Ware ware = null;
        try {
            String warennr = resultSet.getString("warenNr");
            String bz = resultSet.getString("bezeichnung");
            String bs = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");

            //Vertragspartner erstellen
            ware = new Ware(bz, preis);
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ware;
    }


    public Ware create(Ware ware) throws Exception {

        connection = null;

        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "INSERT INTO ware VALUES (?,?,?,?,?,?)";


            String besonderheiten = " ";
            for (String b : ware.getBesonderheitenListe()) {
                besonderheiten += b + "; ";
            }


            String maengel = " ";
            for (String b : ware.getMaengelListe()) {
                maengel += b + "; ";
            }


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ware.getWarenNr());
            preparedStatement.setString(2, ware.getBezeichnung());
            preparedStatement.setString(3, ware.getBeschreibung());
            preparedStatement.setDouble(4, ware.getPreis());
            preparedStatement.setString(5, besonderheiten);
            preparedStatement.setString(6, maengel);

            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Doppelte ausweisnummer, Der vertragspartner mit der ausweisnummer " + ware.getWarenNr());
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
        return ware;
    }


    public void delete(String ausweisNr) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "DELETE FROM ware WHERE warenNR = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);
            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();
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
    }

    public void update(String warenNr, int preis, String beschreibung) {
        connection = null;
        PreparedStatement preparedStatement = null;
        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen
            String sql = "UPDATE ware SET beschreibung = ?,preis = ? WHERE warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, beschreibung);
            preparedStatement.setDouble(2, preis);
            preparedStatement.setString(3, warenNr);
            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();
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
    }
}
