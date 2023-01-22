package com.justboard.demo.global.config;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class BeanNameConfig implements BeanNameGenerator {

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        final String result;
        result = getFullBeanName((AnnotatedBeanDefinition) definition);
        return result;
    }

    private String getFullBeanName(final AnnotatedBeanDefinition definition) {
        return definition.getMetadata().getClassName();
    }
}
