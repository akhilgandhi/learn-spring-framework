package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Akhil";
    }

    @Bean
    public int age() {
        return 30;
    }

    @Bean
    public Person person() {
        return new Person("Akhil", 30);
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age());
    }

    @Bean
    public Person person3Parameters(String name, int age) {
        return new Person(name, age);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Becker Street", "London");
    }
}
