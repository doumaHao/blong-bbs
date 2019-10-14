package com.douma.blong.bbs.web.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class WebController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/index1")
    public String index2() {
        return "index";
    }

}
