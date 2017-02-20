/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.gradeprediction;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmhasan
 */
public class GradeDAOMySQLImplementation implements GradeDAO {

    private Connection connection;
    Map<String, Course> coursesMap;
    
    public GradeDAOMySQLImplementation(Map<String, Course> coursesMap) {
        connection = ConnectionSingleton.getConnection();
        this.coursesMap = coursesMap;
    }

    @Override
    public List<Grade> getGrades(Student student) {
        return getGrades(student.getStudentId());
    }

    @Override
    public List<Grade> getGrades(int studentId) {
        String query = "select grades.courseCode, course.courseTitle, course.credits, grades.semesterId, grades.grade from grades, course where course.courseCode = grades.courseCode and studentId = '" + studentId + "';";
        List<Grade> gradesList = new ArrayList<>();
        
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String courseCode = resultSet.getString("courseCode");
                String courseTitle = resultSet.getString("courseTitle");
                double credits = resultSet.getDouble("credits");
                int semesterId = resultSet.getInt("semesterId");
                String letterGrade = resultSet.getString("grade");
                
                //Grade grade = new Grade(new Course(courseCode, courseTitle, credits), semesterId, letterGrade);
                Grade grade = new Grade(coursesMap.get(courseCode), semesterId, letterGrade);
                gradesList.add(grade);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GradeDAOMySQLImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gradesList;
    }

    @Override
    public Grade getGrade(int studentId, String courseCode, int semesterId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
