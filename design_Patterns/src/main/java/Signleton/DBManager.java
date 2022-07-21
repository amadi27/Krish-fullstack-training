package Signleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static volatile DBManager dbManager;
    private static volatile Connection connection;

    private DBManager(){
        if(dbManager != null){
            throw new RuntimeException("use getDBManager method.");
        }
    }
    //do not use"syncronized" for the static -then it will all the things
    public static DBManager getDbManager(){
        if(dbManager== null) {
            //double checking singleton
            synchronized (DBManager.class) {
                if(dbManager== null) {
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }

    public Connection getConnection()  {
        if(connection == null){
            synchronized (DBManager.class){
                if(connection == null){
                    try{
                    String url ="jdbc:derby:memory:sample:create=true";

                        connection = DriverManager.getConnection(url);
                    } catch (Exception e) {
                       // e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }

}
