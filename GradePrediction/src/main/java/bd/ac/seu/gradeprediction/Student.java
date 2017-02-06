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
public class Student {
    private int studentId;
    private String studentName;
    private List<Grade> gradesList;
    
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        gradesList = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + '}';
    }
    
    public void print() {
        System.out.println(studentName);
    }

    public List<Grade> getGradesList() {
        return gradesList;
    }
}
