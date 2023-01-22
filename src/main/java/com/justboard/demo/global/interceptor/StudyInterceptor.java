package com.justboard.demo.global.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
public class StudyInterceptor implements HandlerInterceptor {
    private String controllerPrefix;

    public StudyInterceptor(String controllerPrefix) {
        this.controllerPrefix = controllerPrefix;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (controllerPrefix != null) {
            String originRequestUri = request.getRequestURI();
            String originController = originRequestUri.split("/")[1];
            String redirectController = controllerPrefix + "/" + originController;

            response.sendRedirect(originRequestUri.replace(originController, redirectController));
        }

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
