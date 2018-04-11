package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;
public class App 
{
	final static Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        Calculator calc = new Calculator();
        LOGGER.debug(calc.add(1, 2));
        LOGGER.debug(calc.subtract(4, 3));
        LOGGER.debug(calc.multiply(10, 10));
        LOGGER.debug(calc.divide(100, 10));
    }
}
