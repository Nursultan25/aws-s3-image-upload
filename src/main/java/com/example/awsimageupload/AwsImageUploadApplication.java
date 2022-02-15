package com.example.awsimageupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.awsimageupload.filestore"})
public class AwsImageUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsImageUploadApplication.class, args);
    }

}
