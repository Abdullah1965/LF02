package dao;

import java.sql.*;

public class VertragsDAO {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:Kaufvertrag/src/data/Vetragspather.db");
            System.out.println("Database is Opened");


            displayDatabase(connection,"vertragspather");

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }finally {
            if (connection != null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    private static void displayDatabase(Connection connection, String tableName) throws SQLException {
        String sql = "SELECT * from " + tableName;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println("-----" + tableName + "-----");
        resultSet.next();
            System.out.println("AusweisNr " + resultSet.getString("ausweisNr"));
            System.out.println("vorName " + resultSet.getString("vorname"));
            System.out.println(resultSet.getString("nachname"));
            System.out.println(resultSet.getString("strasse") + resultSet.getString("hausNr") + resultSet.getString("plz") + resultSet.getString("ort"));

        System.out.println("-------------------------");
    }
}
