package com.mywebysite.mywebsite_springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/hongseob")
    @ResponseBody
    public String index() {
        return "안녕하세요 hongseob에 오신것을 환영합니다";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
