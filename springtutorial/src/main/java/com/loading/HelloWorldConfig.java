package com.loading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wuyuxiang on 2017/2/27.
 */
@Configuration
public class HelloWorldConfig {
    /**
     * 这里带有@Bean注解的方法，和以下xml配置等价
     * <bean id="helloJavaWorld" class="com.loading.HelloWorld"/>
     * @return
     */
    @Bean
    public HelloWorld helloJavaWorld() {
        return new HelloWorld();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloJavaWorld = (HelloWorld) context.getBean("helloJavaWorld");
        helloJavaWorld.setMessage("Hello JavaWorld!");
        System.out.println(helloJavaWorld.getMessage());
    }
}
