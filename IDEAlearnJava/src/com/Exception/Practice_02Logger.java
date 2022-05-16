package com.Exception;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
public class Practice_02Logger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Math.class.getName());
        logger.info("Start process...");
//        try {
//            "".getBytes("invalidCharsetName");
//        }catch (UnsupportedEncodingException e){
//            logger.severe("error");
//        }
        logger.info("Process end.");
    }
}
