package dao;

import java.sql.Connection;

import static java.lang.Class.forName;

public class DeleteDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Vetragspather.db";
    Connection connection;

    public DeleteDAO()throws ClassNotFoundException{
        forName(CLASSNAME);
    }
}
