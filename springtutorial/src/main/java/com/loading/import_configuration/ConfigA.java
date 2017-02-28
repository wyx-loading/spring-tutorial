package com.loading.import_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
@Configuration
public class ConfigA {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public A a() {
        return new A();
    }

    class A {
        A() {
            System.out.println("Inside A constructor.");
        }
        public void init() {
            System.out.println("Inside A init.");
        }
        public void destroy() {
            System.out.println("Inside A destroy.");
        }
    }
}
