package com.qiangssvip.web;

import com.qiangssvip.pojo.Hero;
import com.qiangssvip.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private HeroService heroService;

    @GetMapping("/add")
    public String add(){
        return "add";
    }

    @PostMapping("/addHero")
    public String addHero(Hero hero){
        heroService.inserrtHero(hero);
        return "redirect:/main";
    }

    @GetMapping("/main")
    public String main(Model model){
        // 取数据
        List<Hero> allHero = heroService.getAllHero();
        model.addAttribute("heroList",allHero);
        System.out.println(allHero);
        return "main";
    }

    @GetMapping("/edit/{id}")
    public String addHero(@PathVariable("id") Integer id, Model model){
        Hero hero = heroService.getHeroWithId(id);
        System.out.println(hero);
        model.addAttribute("hero",hero);
        return "add";
    }

    //员工修改；需要提交员工id；
    @PutMapping("/addHero")
    public String updateEmployee(Hero hero){
        heroService.upateHero(hero);
        return "redirect:/main";
    }

    @InitBinder
    public void InitBinder(WebDataBinder dataBinder)
    {
        dataBinder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            public void setAsText(String value) {
                try {
                    setValue(new SimpleDateFormat("yyyy-MM-dd").parse(value));
                } catch(ParseException e) {
                    setValue(null);
                }
            }
            public String getAsText() {
                return new SimpleDateFormat("yyyy-MM-dd").format((Date) getValue());
            }
        });
    }
}
