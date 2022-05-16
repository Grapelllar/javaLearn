package com.Exception;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
public class JavaCommonsLogging {

    public static void main(String[] args) {
        Log log = LogFactory.getLog(JavaCommonsLogging.class);
        log.info("start...");
        log.warn("end.");
    }
}
