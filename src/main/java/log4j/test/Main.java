package log4j.test;

import org.apache.log4j.Logger;

public class Main {

    protected static Logger logger = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
    
        //DEBUG < INFO < WARN < ERROR < FATAL
    
        logger.fatal("log4j:logger.fatal()");
    
        logger.error("log4j:logger.error()");
    
        logger.warn("log4j:logger.warn()");
    
        logger.info("log4j:logger.info()");
    
        logger.debug("log4j:logger.debug()");
    }
}


  