package Signleton;

import java.sql.Connection;
import java.sql.SQLException;

public class Application {
    public static void main(String[]args){
        DBManager dbManager = DBManager.getDbManager();
        System.out.println(dbManager);

        Connection connection = dbManager.getConnection();

        DBManager dbManager1 = DBManager.getDbManager();
        System.out.println(dbManager1);




    }
}
