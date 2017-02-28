package com.loading.customevent;

import org.springframework.context.ApplicationListener;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
