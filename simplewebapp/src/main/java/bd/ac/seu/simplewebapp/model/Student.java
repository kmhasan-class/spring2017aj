/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.simplewebapp.model;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author kmhasan
 */
@ManagedBean
public class Student {
    private String studentId;
    private String studentName;

    public Student() {
        studentName = "Md. Hasan Tareque";
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
