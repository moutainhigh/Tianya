package com.watimer.study.security.security.handler;

import com.watimer.study.security.common.util.ResultUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Watimer
 * @Description 用户未登录处理类
 * @date 2020/1/11
 */
@Component
public class UserAuthenticationEntryPointHandler implements AuthenticationEntryPoint {

    /**
     * 用户未登录返回结果
     * @Author Watimer
     * @CreateTime 2020/1/11
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception){
        ResultUtil.responseJson(response,ResultUtil.resultCode(401,"未登录"));
    }
}
