package log4j.test;

import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class LogProperty 
{
    static Logger logger = Logger.getLogger(LogProperty.class);
 
    public static void main(String[] args) 
    {
        int i=0;

        logger.debug("Hello log4j"+i++);
        logger.info("Hello log4j."+i++);
        logger.warn("Hello log4j."+i++);
        logger.error("Hello log4j.");
        logger.fatal("Hello log4j.");

        // System.out.print("this is "+i);
    }
}