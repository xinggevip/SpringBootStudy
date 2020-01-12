package com.qiangssvip.web;

import com.qiangssvip.pojo.Hero;
import com.qiangssvip.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private HeroService heroService;

    @GetMapping("/main")
    public String main(Model model){
        // 取数据
        List<Hero> allHero = heroService.getAllHero();
        model.addAttribute("heroList",allHero);
        System.out.println(allHero);
        return "main";
    }
}
