import java.sql.*;
import java.util.ArrayList;

public class LebensmittelDAO {
    private String CLASSNAME = "org.sqlite.JDBC";
    private String CONNECTIONSTRING = "jdbc:sqlite:Modul_Lebensmittel/src/Data/Waren.db";
    Connection connection;

    public LebensmittelDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    public Lebensmittel read(int ID) {
        Lebensmittel lebensmittel = null;
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * Form Lebensmittel where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int id = resultSet.getInt("ID");
            String name = resultSet.getString("name");
            double gewicht = resultSet.getDouble("Gewicht in Gramm");
            double preis = resultSet.getDouble("preis");
            String milch = resultSet.getString("Milch");
            String nuesse = resultSet.getString("Nuesse");

            lebensmittel = new Lebensmittel(id, name, preis);
            lebensmittel.setGewicht(gewicht);


            if (nuesse != null) {
                String[] nuesseArray = nuesse.split(";");
                for (String b : nuesseArray) {
                    lebensmittel.getNuesse().add(b);
                }
            }
            if (milch != null) {
                String[] milchArray = milch.split(";");
                for (String b : milchArray) {
                    lebensmittel.getMilch().add(b);
                }
            }

        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.getStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }
        return lebensmittel;
    }

    public ArrayList<Lebensmittel> read() {
        ArrayList<Lebensmittel> lebensmittelArrayList = null;
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * Form Lebensmittel";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                double gewicht = resultSet.getDouble("Gewicht in Gramm");
                double preis = resultSet.getDouble("preis");
                String milch = resultSet.getString("Milch");
                String nuesse = resultSet.getString("Nuesse");

                Lebensmittel lebensmittel = new Lebensmittel(id, name, preis);
                lebensmittel.setGewicht(gewicht);
                if (nuesse != null) {
                    String[] nuesseArray = nuesse.split(";");
                    for (String b : nuesseArray) {
                        lebensmittel.getNuesse().add(b);
                    }
                }
                if (milch != null) {
                    String[] milchArray = milch.split(";");
                    for (String b : milchArray) {
                        lebensmittel.getMilch().add(b);
                    }
                }
                lebensmittelArrayList.add(lebensmittel);
            }
        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.getStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }
        return lebensmittelArrayList;
    }

    public void Delete(int ID) {
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE Form Lebensmittel where = ?";
            preparedStatement.setInt(1, ID);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.getStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }
    }

    public void Update(Lebensmittel lebensmittel) {
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String nuesseArray = " ";
            for (String b : lebensmittel.getNuesse()) {
                nuesseArray += b + ";";
            }

            String milchArray = " ";
            for (String b : lebensmittel.getMilch()) {
                milchArray += b + ";";
            }
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "UPDATE Lebensmittel SET name = ?,gewicht = ?,preis = ?,Nuesse = ?,Milch = ? where id = ?";
            preparedStatement.setInt(6, lebensmittel.getID());
            preparedStatement.setString(1, lebensmittel.getName());
            preparedStatement.setDouble(2, lebensmittel.getGewicht());
            preparedStatement.setDouble(3, lebensmittel.getPreis());
            preparedStatement.setString(4, nuesseArray);
            preparedStatement.setString(5, milchArray);
        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.getStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }
    }

    public Lebensmittel create(Lebensmittel lebensmittel) {
        connection = null;
        PreparedStatement preparedStatement = null;
        try {

            String nuesseArray = " ";
            for (String b : lebensmittel.getNuesse()) {
                nuesseArray += b + ";";
            }

            String milchArray = " ";
            for (String b : lebensmittel.getMilch()) {
                milchArray += b + ";";
            }

            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "INSERT INTO Lebensmittel(Name,Gewicht in Gramm,preis,nuesse,milch) Values(name = ?,Gewicht in Gramm = ?,preis = ?,nuesse = ?,milch = ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lebensmittel.getName());
            preparedStatement.setDouble(2, lebensmittel.getGewicht());
            preparedStatement.setDouble(3, lebensmittel.getPreis());
            preparedStatement.setString(4, nuesseArray);
            preparedStatement.setString(5, milchArray);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.getStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }
        return lebensmittel;
    }
}
