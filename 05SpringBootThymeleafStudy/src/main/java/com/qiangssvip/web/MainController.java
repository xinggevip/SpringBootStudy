package com.qiangssvip.web;

import com.qiangssvip.pojo.Hero;
import com.qiangssvip.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private HeroService heroService;

    @GetMapping("/main")
    public String main(){
        // 取数据
        List<Hero> allHero = heroService.getAllHero();
        System.out.println(allHero);
        return "main";
    }
}
