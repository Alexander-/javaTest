package com.example.demo.testAutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceC {
    public ServiceA serviceA;

    public ServiceB serviceB;

    public ServiceC() {}

    public ServiceC(ServiceA serviceA, ServiceB serviceB)
    {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    public ServiceC(ServiceA serviceA)
    {
        this.serviceA = serviceA;
    }


    int a = 1;
}
