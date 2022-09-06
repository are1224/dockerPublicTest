package com.test.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class DockerTestController {

    @GetMapping("goDockerTest")
    public void goDockerTest(HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        response.getWriter().print("<!doctype html> \n" +
                "<head><title>docker test</title></head> \n "+
                "<body>Welcome To My Docker Test!!</body> \n" +
                "</html>");


    }

}
