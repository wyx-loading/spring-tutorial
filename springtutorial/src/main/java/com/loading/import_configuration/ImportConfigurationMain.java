package com.loading.import_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.loading.import_configuration.ConfigA.A;
import com.loading.import_configuration.ConfigB.B;

/**
 * Created by wuyuxiang on 2017/2/27.
 */
public class ImportConfigurationMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);
        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
        A a2 = context.getBean(A.class);
    }
}
