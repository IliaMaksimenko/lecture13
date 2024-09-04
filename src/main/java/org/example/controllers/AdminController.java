package org.example.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.example.entities.Classroom;
import org.example.entities.Students;
import org.example.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    StudentsService studentsService;

    @RequestMapping(value = "/list")
    public String adminList(Model model) {
        model.addAttribute("user", "admin");
        model.addAttribute("students", studentsService.getAllStudents());
        return "student_list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addStudent(Model model) {
        return "add_student";
    }

    @RequestMapping(value="/update", method = RequestMethod.GET)
    public String updateStudentList(HttpServletRequest request, Model model){
        studentsService.addStudent(new Students(
                (int)(Math.random()*100),
                request.getParameter("name"),
                request.getParameter("surname"),
                Integer.parseInt(request.getParameter("age")),
                request.getParameter("email"),
                new Classroom(
                        (int)(Math.random()*100),
                        request.getParameter("classroom"),
                        null
                )
        ));
        return "redirect:/admin/list";
    }


}
