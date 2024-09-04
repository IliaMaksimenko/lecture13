package org.example.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String studentList(Model model) {
        String user = SecurityContextHolder.getContext().getAuthentication().getName();
        if (user.equalsIgnoreCase("admin")) {
            return "redirect:/admin/list";
        }
        return "student_list";
    }

    @RequestMapping(value = "/style.css", method = RequestMethod.GET)
    public String styleCss() {
        return "style.css";
    }
}
