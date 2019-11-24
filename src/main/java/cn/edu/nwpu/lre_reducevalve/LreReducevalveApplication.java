package cn.edu.nwpu.lre_reducevalve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LreReducevalveApplication {

    public static void main(String[] args) {
        SpringApplication.run(LreReducevalveApplication.class, args);
    }

}
