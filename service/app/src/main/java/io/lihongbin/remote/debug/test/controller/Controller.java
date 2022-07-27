package io.lihongbin.remote.debug.test.controller;

import io.lihongbin.model.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    public Controller() {
        System.out.println("init controller");
    }

    @GetMapping("/")
    public R hello() {
        System.out.println(LocalDateTime.now());
        return new R(200, "success", null);
    }

}
