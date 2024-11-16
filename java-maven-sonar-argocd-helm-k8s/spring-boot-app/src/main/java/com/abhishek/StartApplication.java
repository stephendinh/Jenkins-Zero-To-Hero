package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfully built a spring boot application using Maven");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    // Method with potential null pointer dereference
    public void riskyMethod(String input) {
        if (input.equals("test")) { // Potential null pointer dereference
            System.out.println("Input is test");
        }
    }

    // Method with high cyclomatic complexity
    public void complexMethod(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > b <= c");
            }
        } else {
            if (a > c) {
                System.out.println("b >= a > c");
            } else {
                System.out.println("b >= a <= c");
            }
        }
    }

    // Hardcoded password
    public void login() {
        String password = "hardcodedPassword"; // Hardcoded password
        System.out.println("Logging in with password: " + password);
    }
}
