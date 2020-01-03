package com.qiangssvip.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {

    /* 可以省略不写，加上@Slf4j注解即可 */
    // private static final Logger log = LoggerFactory.getLogger(MyController.class);

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
