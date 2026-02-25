package com.cesde.cityscooter.services;

import org.springframework.stereotype.Service;

@Service
public class HelloPublicServiceImpl implements HelloWorldService {
    @Override
    public String createSalute(){
        return "Hello World";
    }

}
