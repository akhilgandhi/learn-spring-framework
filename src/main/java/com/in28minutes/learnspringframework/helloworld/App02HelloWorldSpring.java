package com.in28minutes.learnspringframework.helloworld;

import com.in28minutes.learnspringframework.helloworld.Address;
import com.in28minutes.learnspringframework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        // Launch a spring application context - AnnotationConfigApplicationContext class
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // Configure the things that we want Spring to manage - @Configuration class
            System.out.println(context.getBean("name") + " " + context.getBean("age"));
            System.out.println(context.getBean("person") + " " + context.getBean("address2"));
            System.out.println(context.getBean(Address.class));
            System.out.println("Method Call " + context.getBean("person2MethodCall"));
            System.out.println("Parameters " + context.getBean("person3Parameters"));
        }
    }
}
