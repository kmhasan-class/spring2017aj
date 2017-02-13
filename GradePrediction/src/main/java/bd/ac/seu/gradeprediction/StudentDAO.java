/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.gradeprediction;
import java.util.*;

/**
 *
 * @author kmhasan
 */
public interface StudentDAO {
    public List<Student> getStudents();
    public Student getStudent(int studentId);
    public void addStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
