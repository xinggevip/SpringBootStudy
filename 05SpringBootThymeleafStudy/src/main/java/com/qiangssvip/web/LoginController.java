package com.qiangssvip.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    /*@RequestMapping("/login")
    public String login(){
        return "/login";
    }*/

    @PostMapping("/userLogin")
    public String userLogin(String username, String password, Model model, HttpSession session){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("user",username);
            // 跳转到主页
            return "redirect:main";
        }else{
            // 还跳转到本页面
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }

    }
}
