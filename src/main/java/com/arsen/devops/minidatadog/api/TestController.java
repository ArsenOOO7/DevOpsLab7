package com.arsen.devops.minidatadog.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/good")
    public String good() {
        log.info("Good endpoint");
        return "Good!";
    }

    @GetMapping("/bad")
    public String bad() {
        log.error("Bad endpoint");
        return "Bad!";
    }
}
