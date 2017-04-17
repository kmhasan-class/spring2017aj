/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.springjpa.controller;

import bd.ac.seu.springjpa.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author kmhasan
 */
@Controller
public class StudentController {
    @RequestMapping(value = "/addstudent", method = RequestMethod.GET)
    public String addStudent(
            @RequestParam String studentId, 
            @RequestParam String studentName, 
            @RequestParam double cgpa) {
        Student student = new Student(studentId, studentName, cgpa);
        // we will add some code to save through the repository
        // https://spring.io/guides/gs/accessing-data-mysql/
        return "done";
    }
}
