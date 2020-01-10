package com.itlike.web;


import com.itlike.pojo.Hero;
import com.itlike.service.HeroService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@Slf4j
public class MyController {

    @Autowired
    private HeroService heroService;

    //private static final Logger log = LoggerFactory.getLogger(MyController.class);
    @RequestMapping("/hello")
    public String hello(Model model){
        //System.out.println("hello info");
        //log.info("hello info  log-info------------");
        log.debug("hello info log-debug");
        log.debug("hello info log-debug");
        log.debug("hello info log-debug");
        List<Hero> allHero = heroService.getAllHero();
        System.out.println(allHero);
        model.addAttribute("name","测试内容");

        return "myhello";
    }
}
