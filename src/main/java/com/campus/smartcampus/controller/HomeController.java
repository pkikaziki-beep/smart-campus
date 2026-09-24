package com.campus.smartcampus.controller;

import com.campus.smartcampus.repository.StudentRepository;
import com.campus.smartcampus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired private StudentRepository studentRepository;
    @Autowired private UserRepository userRepository;

    @GetMapping("/") public String home() { return "redirect:/login"; }
    @GetMapping("/login") public String loginPage() { return "login"; }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if(username.equals("admin") && password.equals("admin")){
            return "redirect:/dashboard";
        }
        model.addAttribute("error","Wrong password");
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("totalStudents", studentRepository.count());
        model.addAttribute("totalUsers", userRepository.count());
        return "dashboard";
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "students";
    }
}