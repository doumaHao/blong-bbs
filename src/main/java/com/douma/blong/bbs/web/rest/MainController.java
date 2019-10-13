    package com.douma.blong.bbs.web.rest;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class MainController {

        @GetMapping("/ok")
        public String ok() {
            return "ok";
        }

    }
