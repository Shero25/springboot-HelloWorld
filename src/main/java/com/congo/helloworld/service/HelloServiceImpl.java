package com.congo.helloworld.service;

import com.congo.helloworld.repository.HelloRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

    private HelloRepository helloRepository;
   // @Override
    public String getText() {
        return "Hello world";
    }
}
