package com.loading.aop.aspectjbase;

import org.aspectj.lang.annotation.*;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
@Aspect
public class Logging {
    /**
     * Following is the definition for a pointcut to select
     * all the methods available. So advice will be called
     * for all the methods.
     *
     * 和以下xml配置等价
     * <bean id="selectAll" class="com.loading.aop.aspectjbase.Logging">
     * </bean>
     */
    @Pointcut("execution(* com.loading.aop.aspectjbase.*.*(..))")
    private void selectAll() {}

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("selectAll()")
    public void beforeAdvice() {
        System.out.println("Going to setup student profile.");
    }

    /**
     * This is the method which I would like to execute
     * after a selected method selection.
     */
    @After("selectAll()")
    public void afterAdvice() {
        System.out.println("Student profile has been setup.");
    }

    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(value = "selectAll()", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning: " + retVal.toString());
    }

    /**
     * This is the method which I would like to execute
     * if there is an exception raised by any method.
     */
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}
