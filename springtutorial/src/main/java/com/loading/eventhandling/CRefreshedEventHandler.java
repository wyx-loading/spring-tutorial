package com.loading.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
public class CRefreshedEventHandler implements ApplicationListener<ContextRefreshedEvent> {
    private final String name;
    public CRefreshedEventHandler(String name) {
        this.name = name;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println(String.format("[%s]", name) + "ContextRefreshedEvent Received.");
    }
}
