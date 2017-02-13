/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.gradeprediction;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmhasan
 */
public class StudentDAOFileImplementation implements StudentDAO {

    public StudentDAOFileImplementation() {
    }

    @Override
    public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        try {
            RandomAccessFile input = new RandomAccessFile("students.txt", "r");
            String line;
            
            while ((line = input.readLine()) != null) {
                if (line.length() == 0)
                    continue;
                String tokens[] = line.split("\\;");
                Student student = new Student(Integer.parseInt(tokens[0]), tokens[1]);
                studentsList.add(student);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDAOFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentDAOFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentsList;
    }

    @Override
    public Student getStudent(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
