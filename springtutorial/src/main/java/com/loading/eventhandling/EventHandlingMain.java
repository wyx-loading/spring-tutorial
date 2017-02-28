package com.loading.eventhandling;

import com.loading.HelloWorld;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
public class EventHandlingMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/loading/eventhandling/Beans.xml");
        //context.start();
        System.out.println("Context Started.");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println(obj.getMessage());
        context.stop();
    }
}
