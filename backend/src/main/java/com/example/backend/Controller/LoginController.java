package com.example.backend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // login.html 페이지로 이동
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin"; // 로그인 성공 후 관리자 페이지로 이동
    }
}