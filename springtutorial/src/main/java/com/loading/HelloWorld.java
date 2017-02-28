package com.loading;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by wuyuxiang on 2017/2/24.
 */
public class HelloWorld implements InitializingBean, DisposableBean {
    private String message;
    private String extraMessage;

    public void init() {
        System.out.println(getClass().getSimpleName() + "." + "init invoke");
    }
    public void myDestroy() {
        System.out.println(getClass().getSimpleName() + "." + "myDestroy invoke");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getClass().getSimpleName() + "." + "afterPropertiesSet invoke");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println(getClass().getSimpleName() + "." + "destroy invoke");
    }

    public String getMessage() {
        return message + ";" + extraMessage;
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("HelloWorld.setMessage invoke");
    }

    public String getExtraMessage() {
        return extraMessage;
    }

    public void setExtraMessage(String extraMessage) {
        this.extraMessage = extraMessage;
    }

}
