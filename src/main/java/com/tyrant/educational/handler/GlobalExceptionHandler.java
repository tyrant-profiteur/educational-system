package com.tyrant.educational.handler;

import com.ruyuan.little.project.common.dto.CommonResponse;
import com.tyrant.educational.constants.StringConstantPool;
import com.tyrant.educational.enums.BusinessErrorCodeEnum;
import com.tyrant.educational.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author:profiteur
 * @create 2021-10-13 22:06
 * @description 全局异常处理类
 **/
@ControllerAdvice
@ResponseBody
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理系统内部异常
     *
     * @param e 异常
     * @return 失败响应
     */
    @ExceptionHandler(value = Exception.class)
    public CommonResponse handleException(Exception e) {
        logger.error("系统异常处理信息:{}", e);
        return CommonResponse.fail();
    }

    /**
     * 处理系统业务异常
     *
     * @param e 业务异常
     * @return 失败响应
     */
    @ExceptionHandler(value = BusinessException.class)
    public CommonResponse handleBusinessException(BusinessException e) {
        logger.error("系统异常错误信息:{}", e);
        return CommonResponse.fail();
    }

    /**
     * 统一处理请求参数校验(实体对象传参-form)
     *
     * @param e 表单错误
     * @return 失败响应
     */
    @ExceptionHandler(value = BindException.class)
    public CommonResponse validExceptionHandler(BindException e) {
        StringBuffer message = new StringBuffer();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            message.append(fieldError.getField()).append(fieldError.getDefaultMessage()).append(StringConstantPool.COMMA);
        }
        logger.error("参数校验失败:{}", message.toString());
        CommonResponse<String> commonResponse = new CommonResponse();
        commonResponse.setCode(BusinessErrorCodeEnum.PARAMETER_VALIDATED_FAILED.getCode());
        commonResponse.setMessage(BusinessErrorCodeEnum.PARAMETER_VALIDATED_FAILED.getMsg());
        commonResponse.setData(message.toString());
        return commonResponse;
    }

    /**
     * 统一处理请求参数校验(json)
     *
     * @param e 参数错误异常
     * @return 失败响应
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResponse handlerMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        StringBuilder message = new StringBuilder();
        for (FieldError error : e.getBindingResult().getFieldErrors()) {
            message.append(error.getField()).append(error.getDefaultMessage()).append(StringConstantPool.COMMA);
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        logger.error("请求参数校验:{}", message.toString());
        CommonResponse<String> commonResponse = new CommonResponse<>();
        commonResponse.setCode(BusinessErrorCodeEnum.PARAMETER_VALIDATED_FAILED.getCode());
        commonResponse.setMessage(BusinessErrorCodeEnum.PARAMETER_VALIDATED_FAILED.getMsg());
        commonResponse.setData(message.toString());
        return commonResponse;
    }
}
