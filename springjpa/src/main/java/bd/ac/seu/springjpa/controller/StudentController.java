/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.springjpa.controller;

import bd.ac.seu.springjpa.model.Student;
import bd.ac.seu.springjpa.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author kmhasan
 */
@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    
    @RequestMapping(value = "/addstudent", method = RequestMethod.GET)
    public String addStudent(
            @RequestParam String studentId, 
            @RequestParam String studentName, 
            @RequestParam double cgpa) {
        Student student = new Student(studentId, studentName, cgpa);
        System.out.println(student);
        // we will add some code to save through the repository
        // https://spring.io/guides/gs/accessing-data-mysql/
        studentRepository.save(student);
        return "done";
    }
    
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public @ResponseBody Iterable<Student> listStudents() {
        Iterable<Student> studentsList = studentRepository.findAll();
        for (Student student: studentsList)
            System.out.println(student);
        return studentsList;
    }
}
