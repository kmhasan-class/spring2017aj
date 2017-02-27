/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.hibernatefx.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;
import javax.persistence.OneToMany;

/**
 *
 * @author kmhasan
 */
@Entity(name = "student")
public class Student {
    @Id
    private String studentId;
    private String studentName;
    @OneToMany
    private List<Phone> phonesList;
    
    public Student() {
        phonesList = new ArrayList<>();
    }

    public Student(String studentId, String studentName) {
        this();
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return studentName;
    }

    public List<Phone> getPhonesList() {
        return phonesList;
    }
}
