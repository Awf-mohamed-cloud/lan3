package com.example.fayaz.fayaz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/contact")
    @ResponseBody
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println("===== NEW CONTACT FORM =====");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

        return "Form Submitted Successfully!";
    }
}
