package com.loading.import_configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Created by wuyuxiang on 2017/2/27.
 */
@Configurable
@Import(ConfigA.class)
public class ConfigB {
    @Bean
    public B b() {
        return new B();
    }

    class B {
        B() {
            System.out.println("Inside B constructor.");
        }
    }
}
