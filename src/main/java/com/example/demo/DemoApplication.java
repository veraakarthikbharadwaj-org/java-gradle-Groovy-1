package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
 
public class Example1 {
    public Example1(String arg) throws IOException {    
        foo(arg);
    }
     
    public void foo(String arg) throws IOException {
        Runtime.getRuntime().exec(arg);
    }           
}
