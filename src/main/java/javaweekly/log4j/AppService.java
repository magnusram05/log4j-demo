package javaweekly.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppService {
    private static Logger logger = LogManager.getLogger(AppService.class);
    public static void logTester(String msg){
        logger.error("Logging from LogTest: {}", msg);
    }

    public static class AppServiceHelper {
        private static Logger logger = LogManager.getLogger(AppServiceHelper.class);
        public static void logTester(String msg){
            logger.error("Logging from helper: {}", msg);
        }
    }
}
