package Chain_Of_Responsibility;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {
    public static void main(String[]args){
        Logger logger = Logger.getLogger(Example.class.getName());
        logger.setLevel(Level.WARNING);

        logger.log(Level.INFO,"This is Info");
        logger.log(Level.WARNING,"This is warn");
        logger.log(Level.FINE,"This is fine");
        logger.log(Level.SEVERE,"This is Server");

    }
}
