package javaweekly;

import javaweekly.log4j.AppService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AppService.logTester("service call");
        AppService.AppServiceHelper.logTester("service helper call");
    }
}
