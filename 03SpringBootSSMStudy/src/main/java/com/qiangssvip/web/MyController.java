package com.qiangssvip.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/hello")
    public String hello(){
        /**
         * debug级别既输出info又输出debug
         * info级别只输出info
         * */
        log.info("输出日志====info");
        log.debug("输出日志====debug");
        return "Hellow SpringBootSSM";
    }
}
