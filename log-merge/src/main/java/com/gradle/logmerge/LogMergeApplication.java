package com.gradle.logmerge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gradle"})
public class LogMergeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogMergeApplication.class, args);
    }

}
