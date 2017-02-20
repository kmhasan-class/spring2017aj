/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.gradeprediction;

import java.sql.*;
import java.util.*;
import java.util.stream.*;

/**
 *
 * @author kmhasan
 */
public class GradePrediction {

    public GradePrediction() {
        StudentDAO studentDAO = new StudentDAOMySQLImplementation();
        CourseDAO courseDAO = new CourseDAOMySQLImplementation();
        GradeDAO gradeDAO;

        String query;
        ResultSet resultSet;

        List<Student> studentsList = new ArrayList<>();
        List<Course> coursesList = new ArrayList<>();
        Map<Integer, Student> studentsMap = new HashMap<>();
        Map<String, Course> coursesMap = new HashMap<>();

        studentsList = studentDAO.getStudents();
        studentsList.forEach(student -> studentsMap.put(student.getStudentId(), student));

        coursesList = courseDAO.getCourses();
        coursesList.forEach(course -> coursesMap.put(course.getCourseCode(), course));

        gradeDAO = new GradeDAOMySQLImplementation(coursesMap);

        for (Student student : studentsList) {
            List<Grade> gradesList = gradeDAO.getGrades(student);
            student.getGradesList().clear();
            student.getGradesList().addAll(gradesList);
        }

        GradeEntry g = GradeEntry.getGradeEntry("B+");
        System.out.println(g);
    }

    public static void main(String args[]) {
        new GradePrediction();
    }
}
