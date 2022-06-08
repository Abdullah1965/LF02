package dao;

import businessObjects.Adresse;
import businessObjects.Kunde;

import java.sql.*;

public class buecherDao {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Bibilothek/src/data/bucher.db";
    Connection connection;

    public buecherDao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }


}