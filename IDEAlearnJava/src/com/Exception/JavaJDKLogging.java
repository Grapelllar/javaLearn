package com.Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JavaJDKLogging {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory si running out...");
        logger.fine("ignored");
        logger.severe("process will be terminated");
    }
}
