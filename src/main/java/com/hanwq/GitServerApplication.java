package com.hanwq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Description: ddconfigservergit
 * Created by hanwq on 2019/5/17 14:14
 */
@EnableConfigServer
@SpringBootApplication
public class GitServerApplication {
//http://localhost:1201/config-client/master
    public static void main(String[] args){
        new SpringApplicationBuilder(GitServerApplication.class).web(true).run(args);
    }
}
