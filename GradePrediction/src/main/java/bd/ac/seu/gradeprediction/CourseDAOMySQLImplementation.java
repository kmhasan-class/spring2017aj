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
public class CourseDAOMySQLImplementation implements CourseDAO {

    private Connection connection;

    public CourseDAOMySQLImplementation() {
        connection = ConnectionSingleton.getConnection();
    }

    @Override
    public List<Course> getCourses() {
        List<Course> coursesList = new ArrayList<>();
        String query = "SELECT * FROM course;";
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String courseCode = resultSet.getString("courseCode");
                String courseTitle = resultSet.getString("courseTitle");
                double credits = resultSet.getDouble("credits");
                Course course = new Course(courseCode, courseTitle, credits);
                coursesList.add(course);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDAOMySQLImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coursesList;
    }

    @Override
    public Course getCourse(String courseCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCourse(Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCourse(Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCourse(Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
