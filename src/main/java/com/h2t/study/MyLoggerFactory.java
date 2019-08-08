package com.h2t.study;

import org.slf4j.LoggerFactory;

import java.util.Enumeration;

/**
 * 获取MyLoggerFactory
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/08/08 17:00
 */
public class MyLoggerFactory {
    private final String className = "com.h2t.log.MyLogger";
    /**
     * 获取实现了MyLogger的类
     * */
    public MyLogger getMyLogger() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
      MyLogger myLogger = (MyLogger) Class.forName(className).newInstance();
      return myLogger;
    }
}
