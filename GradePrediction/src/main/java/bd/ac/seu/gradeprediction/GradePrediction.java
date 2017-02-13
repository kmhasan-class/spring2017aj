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

            query = "SELECT * FROM course;";
            
            resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String courseCode = resultSet.getString("courseCode");
                String courseTitle = resultSet.getString("courseTitle");
                double credits = resultSet.getDouble("credits");
                Course course = new Course(courseCode, courseTitle, credits);
                coursesList.add(course);
                coursesMap.put(courseCode, course);
            }

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
            
        } catch (SQLException ex) {
            //Logger.getLogger(GradePrediction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        new GradePrediction();
    }
}
