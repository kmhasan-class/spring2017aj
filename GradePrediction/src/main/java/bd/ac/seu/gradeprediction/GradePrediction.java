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
        
        String query;
        ResultSet resultSet;
        
        try {
            List<Student> studentsList = new ArrayList<>();
            List<Course> coursesList = new ArrayList<>();
            Map<Integer, Student> studentsMap = new HashMap<>();
            Map<String, Course> coursesMap = new HashMap<>();

            Connection connection = ConnectionSingleton.getConnection();

            Statement statement = connection.createStatement();
            
            studentsList = studentDAO.getStudents();
            studentsList.forEach(student -> studentsMap.put(student.getStudentId(), student));

            coursesList = courseDAO.getCourses();
            coursesList.forEach(course -> coursesMap.put(course.getCourseCode(), course));
            
            studentsList.forEach(System.out::println);
            
            /*
            // Create a DAO for the grades
            query = "SELECT * FROM grades;";
            
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String courseCode = resultSet.getString("courseCode");
                int studentId = resultSet.getInt("studentId");
                int semesterId = resultSet.getInt("semesterId");
                String grade = resultSet.getString("grade");
                
                Student student = studentsMap.get(studentId);
                Course course = coursesMap.get(courseCode);
                Grade gradeObject = new Grade(course, semesterId, grade);
                student.getGradesList().add(gradeObject);
            }
            
            for (Student student : studentsList)
                System.out.println(student.getCgpa());
            
            for (Student student : studentsList)
                student.computeCgpa();

            // print a list of students who have failed at least 3 times
            // do it with streams
            */
        } catch (SQLException ex) {
            //Logger.getLogger(GradePrediction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        new GradePrediction();
    }
}
