package com.h2t.study;

/**
 * 对外的门面接口
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/08/08 16:57
 */
public interface MyLogger {
    /**
     * 打印info
     *
     * @param logInfo
     * */
    void info(String logInfo);

    /**
    * 打印error
    *
    * @param logError
    * @return
    **/
    void error(String logError);
}
