package log4j.test;

import org.apache.log4j.Logger;
 
public class LoggerTest {
    // 각각의 Logger를 가져온다.
    static Logger logger1 = Logger.getLogger("process.work1");
    static Logger logger2 = Logger.getLogger("process.work2");
    static Logger logger3 = Logger.getLogger("process.work3");
     
    public static void main(String args[]) {
        // 로그 출력
        logger1.warn("Hello log4j.");
        logger2.error("Hello log4j.");
        logger3.error("Hello log4j.");
    }
}