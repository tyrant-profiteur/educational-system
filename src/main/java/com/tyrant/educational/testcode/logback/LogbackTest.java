package com.tyrant.educational.testcode.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author:profiteur
 * @create 2021-10-10 22:14
 * @description
 **/
public class LogbackTest {
    private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);
    public static void main(String[] args){
        logger.trace("trace log");
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");

        try {
            throw new IllegalStateException("throw a new exception");
        } catch (Exception e){
            logger.error(e.getMessage(),e);
        }
     }
}
