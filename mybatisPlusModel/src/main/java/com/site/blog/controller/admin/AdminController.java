package com.site.blog.controller.admin;

import com.site.blog.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminUserService adminUserService;

    @GetMapping(value = "/v1/login")
    public String login() {
        return "adminLayui/login";
    }


    @GetMapping("/v1/welcome")
    public String welcome(){
        return "adminLayui/welcome";
    }

    @GetMapping("/v1/logout")
    public String logout(HttpSession session) {
        //session.invalidate();
        return "adminLayui/login";
    }


}
