package com.loading.injectingcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuyuxiang on 2017/2/24.
 */
public class JavaCollectionMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/loading/injectingcollection/Beans.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
