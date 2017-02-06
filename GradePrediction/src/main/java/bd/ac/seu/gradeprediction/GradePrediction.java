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
        try {
            List<Student> studentsList = new ArrayList<>();
            List<Course> coursesList = new ArrayList<>();
            Map<Integer, Student> studentsMap = new HashMap<>();
            Map<String, Course> coursesMap = new HashMap<>();
            
            Connection connection = ConnectionSingleton.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM student;";
            
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("studentId");
                String name = resultSet.getString("studentName");
                Student student = new Student(id, name);
                studentsList.add(student);
                studentsMap.put(id, student);
            }

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
            long count = studentsList.get(0).getGradesList().stream().count();
            System.out.println(studentsList.get(0));
            System.out.println(count);
            
            // print a list of students who have failed at least 3 times
            // do it with streams
            
/*
            // Stream example
            List<Student> filteredList = studentsList.stream()
                    .filter(s -> s.getStudentName().length() > 15)
                    .filter(s -> s.getStudentId() > 14900)
                    //.sorted()
                    .collect(Collectors.toList());
            
            filteredList.forEach(System.out::println);
            
            long count = filteredList.stream().count();
            System.out.println(count + " entries");
*/
        } catch (SQLException ex) {
            //Logger.getLogger(GradePrediction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        new GradePrediction();
    }
}
