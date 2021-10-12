package com.tyrant.educational.aspect;

import com.alibaba.fastjson.JSONObject;
import com.ruyuan.little.project.common.dto.CommonResponse;
import com.tyrant.educational.constants.StringConstant;
import com.tyrant.educational.exception.BusinessException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author:profiteur
 * @create 2021-10-12 22:54
 * @description controller 层 日志拦截
 **/
@Aspect
@Component
public class ControllerAspect {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);

    /**
     * 切入点
     */
    @Pointcut("execution(* com.tyrant.educational.controller..*.*(..))")
    public void pointcut(){
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws BusinessException {
        // 签名信息
        Signature signature = joinPoint.getSignature();
        // 强转为方法信息
        MethodSignature methodSignature = (MethodSignature) signature;
        // 参数名称
        String[] parameterNames = methodSignature.getParameterNames();
        // 参数值
        Object[] parameterValues = joinPoint.getArgs();
        // 执行对象
        Object target = joinPoint.getTarget();
        logger.info("请求处理方法:[{}],请求参数名称:[{}],请求参数值:[{}]",
                target.getClass().getName() + StringConstant.DOT +  methodSignature.getMethod().getName(),
                JSONObject.toJSONString(parameterNames),JSONObject.toJSONString(parameterValues));
        try {
            // 开始时间
            long startTime = System.currentTimeMillis();
            // 执行方法
            Object  response = joinPoint.proceed();
            // 结束时间
            long endTime = System.currentTimeMillis();
            logger.info("请求处理时间差:{},响应结果:{}",endTime-startTime,JSONObject.toJSONString(response));
            return response;
        } catch (Throwable throwable) {
            logger.error("执行方法:{}失败，异常信息:{}", methodSignature.getMethod().getName(), throwable);
            if (throwable instanceof BusinessException) {
                // 业务异常
                return CommonResponse.fail();
            }
            // 非业务异常，封装一层异常
            throw new BusinessException("方法 " + methodSignature.getMethod().getName() + " 执行失败");

        }
    }
}
