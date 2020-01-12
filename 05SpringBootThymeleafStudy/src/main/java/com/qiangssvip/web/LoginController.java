package com.qiangssvip.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    /*@RequestMapping("/login")
    public String login(){
        return "/login";
    }*/

    @PostMapping("/userLogin")
    public String userLogin(String username, String password, Model model){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            // 跳转到主页
            return "redirect:main.html";
        }else{
            // 还跳转到本页面
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }

    }
}
