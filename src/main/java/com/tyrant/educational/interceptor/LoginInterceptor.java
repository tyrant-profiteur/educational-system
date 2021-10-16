package com.tyrant.educational.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.ruyuan.little.project.common.dto.CommonResponse;
import com.tyrant.educational.constants.StringConstantPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author: profiteur
 * @create: 2021-10-16 15:32
 * @Description: 登录拦截
 **/
public class LoginInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public  boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断请求中是否包含手机号，先从请求体中获取
        String phoneNumber = request.getParameter("phoneNumber");
        if (StringUtils.isEmpty(phoneNumber)){
            // 再从请求头中获取
            phoneNumber = request.getHeader("phoneNumber");
            if (StringUtils.isEmpty(phoneNumber)){
                logger.info("请求接口： {} 中不包含手机号",request.getRequestURI());
                //获取 OutputStream 输出流
                try (OutputStream outputStream = response.getOutputStream()) {
                    //通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
                    response.setHeader("content-type", "application/json");
                    //将字符转换成字节数组，指定以UTF-8编码进行转换
                    byte[] dataByteArr =
                            JSONObject.toJSONString(CommonResponse.fail()).getBytes(StringConstantPool.UTF8);
                    //使用OutputStream流向客户端输出字节数组
                    outputStream.write(dataByteArr);
                } catch (IOException e) {
                    logger.error("LoginInterceptor exception",e);
                }
                return false;
            }
        }
        logger.debug("LoginInterceptor.preHandle()");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.debug("LoginInterceptor.postHandle()");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.debug("LoginInterceptor.afterCompletion()");
    }
}
