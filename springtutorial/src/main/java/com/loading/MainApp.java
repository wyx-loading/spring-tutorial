package com.loading;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static void main( String[] args ) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("context init ok");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println(obj.getMessage());
        HelloWorld helloIndia = (HelloWorld) context.getBean("helloIndia");
        System.out.println(helloIndia.getMessage());
        context.registerShutdownHook();
    }
}
