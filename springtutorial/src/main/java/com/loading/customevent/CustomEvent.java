package com.loading.customevent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    @Override
    public String toString() {
        return "My Custom Event";
    }
}
