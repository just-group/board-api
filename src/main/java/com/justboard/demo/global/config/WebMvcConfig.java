package com.justboard.demo.global.config;

import com.justboard.demo.global.interceptor.StudyInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Value("${who:#{null}}")
    private String controllerPrefix;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new StudyInterceptor(controllerPrefix))
                .addPathPatterns("/posts", "/posts/**")
                .excludePathPatterns("/css/**", "/images/**", "/js/**");
    }
}
