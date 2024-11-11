package com.authorization.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringAuthorizationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthorizationServerApplication.class, args);
    }

    public void run(String... args) throws Exception{
        var env = new BCryptPasswordEncoder();
        System.out.println(env.encode("newpassword"));
    }

}
