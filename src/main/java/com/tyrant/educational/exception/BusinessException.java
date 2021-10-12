package com.tyrant.educational.exception;

/**
 * @author:profiteur
 * @create 2021-10-12 22:58
 * @description 系统内部异常
 **/
public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = -994962710559017255L;

    public BusinessException(String message) {
        super(message);
    }
}
