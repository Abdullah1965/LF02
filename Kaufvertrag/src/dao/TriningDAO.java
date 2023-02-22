package dao;

import businessObjects.Ware;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class TriningDAO {
    String CLASSNAME = "org.sqlite.JDBC";
    String CONNTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Vetragspather.db";
    Connection connection;

    public TriningDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    public Ware read(String warenNr) {
        Ware ware = null;
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNTIONSTRING);

            String sql = "SELECT * From ware where warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, warenNr);
            ResultSet resultSet = preparedStatement.executeQuery();


            resultSet.next();

            String warennr = resultSet.getString("warenNr");
            String bz = resultSet.getString("bezeichnung");
            String bs = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");

            ware = new Ware(bz,preis);
            ware.setWarenNr(warennr);
            ware.setBeschreibung(bs);

            if (besonderheiten != null){
                String[] besonderheitenArray = besonderheiten.split(";");
                for (String b:besonderheitenArray){
                    ware.getBesonderheitenListe().add(b);
                }
            }

            if (maengel != null) {
                String[] meangelArray = maengel.split(";");
                for (String b : meangelArray) {
                    ware.getMaengelListe().add(b);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getClass().getName()  + ": " + e.getMessage());
        }finally {
            try {
                preparedStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return ware;
    }

    public ArrayList<Ware> read(){
        ArrayList<Ware> wareArrayList = null;
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNTIONSTRING);
            String sql = "SELECT * From Ware";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            wareArrayList = new ArrayList<>();
            while (resultSet.next()){
                Ware ware = creatobject(resultSet);
                wareArrayList.add(ware);
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }finally {
            try {
                preparedStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return wareArrayList;
    }

    public Ware creatobject(ResultSet resultSet){
        Ware ware = null;
        try {
            String warennr = resultSet.getString("warenNr");
            String bz = resultSet.getString("bezeichnung");
            String bs = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");

            ware = new Ware(bz,preis);
            ware.setWarenNr(warennr);
            ware.setBeschreibung(bs);

            if (besonderheiten != null){
                String[] besonderheitenArray = besonderheiten.split(";");
                for (String b:besonderheitenArray){
                    ware.getBesonderheitenListe().add(b);
                }
            }

            if (maengel != null){
                String[] meangelArray = maengel.split(";");
                for (String b:meangelArray){
                    ware.getMaengelListe().add(b);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return ware;
    }

    public Ware create(Ware ware) throws Exception{
        connection = null;

        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNTIONSTRING);
            String sql  = "INSERT INTO ware Values (?,?,?,?,?,?)";


            String besonderheiten = " ";
            for (String b : ware.getBesonderheitenListe()) {
                besonderheiten += b + ";";
            }

            String maengel = " ";
            for (String b : ware.getMaengelListe()){
                maengel += b + ";";
            }
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ware.getWarenNr());
            preparedStatement.setString(2,ware.getBezeichnung());
            preparedStatement.setString(3,ware.getBeschreibung());
            preparedStatement.setDouble(4,ware.getPreis());
            preparedStatement.setString(5,besonderheiten);
            preparedStatement.setString(6,maengel);

            preparedStatement.executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return ware;
    }
    public void delete(String warenNr){
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNTIONSTRING);

            String sql = "DELETE From ware Where warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,warenNr);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            finally {
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void update(String warenNr,double preis,String bezeichung){
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNTIONSTRING);
            String sql = "UPDATE SET bezeichung = ?,Preis = ? Where warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,bezeichung);
            preparedStatement.setDouble(2,preis);
            preparedStatement.setString(3,warenNr);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
