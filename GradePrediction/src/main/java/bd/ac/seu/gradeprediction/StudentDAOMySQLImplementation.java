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
public class StudentDAOMySQLImplementation implements StudentDAO {

    private Connection connection;

    public StudentDAOMySQLImplementation() {
        connection = ConnectionSingleton.getConnection();
    }

    @Override
    public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        String query = "SELECT * FROM student";
        Statement statement;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int studentId = resultSet.getInt("studentId");
                String studentName = resultSet.getString("studentName");
                Student student = new Student(studentId, studentName);
                studentsList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAOMySQLImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }

        return studentsList;
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "SELECT * FROM student WHERE studentId = " + studentId;
        //String query = "SELECT * FROM student WHERE studentId = ?;";
        // Note to self: debug prepared statement for this method
        Statement statement;
        Student student = null;
        try {
            statement = connection.createStatement();
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                student = new Student(studentId, resultSet.getString("studentName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAOMySQLImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }

    @Override
    public void addStudent(Student student) {
        String query = "INSERT INTO student VALUES(?, ?);";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, "" + student.getStudentId());
            statement.setString(2, student.getStudentName());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAOMySQLImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
