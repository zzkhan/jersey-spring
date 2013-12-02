package com.zkbizz.ddm.rest;


import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class MyApplication extends ResourceConfig {
    public MyApplication() {
        System.out.println("MyApplication doing shit........");
        register(RequestContextFilter.class);
        register(new MyApplicationBinder());
        packages("com.zkbizz.ddm.resource;com.zkbizz.ddm.web.filters");
    }
}
