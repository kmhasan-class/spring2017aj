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
public interface GradeDAO {
    public List<Grade> getGrades(Student student);
    public List<Grade> getGrades(int studentId);
    public Grade getGrade(int studentId, String courseCode, int semesterId);
    
    // add the other relevant methods in this interface and implement them
}
