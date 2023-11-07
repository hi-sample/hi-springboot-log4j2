package net.hifor.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IKin <br/>
 * @description 第一个springboot  <br/>
 * @date 2019/11/17 <br/>
 */
@RestController
public class HelloSpringbootController {

    private static final Logger logger = LogManager.getLogger(HelloSpringbootController.class);

    /**
     * 第一个方法
     *
     * @return
     */
    @GetMapping("/")
    public String hello() {
        String hello = "Hello Spring boot!";
        logger.info(hello);
        return hello;
    }
}
