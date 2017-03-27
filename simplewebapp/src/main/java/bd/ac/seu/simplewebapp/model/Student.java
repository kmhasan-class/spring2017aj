/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.simplewebapp.model;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author kmhasan
 */
@ManagedBean
@Entity
public class Student {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String studentName;

    public Student() {
        studentId = 1234;
        studentName = "Md. Hasan Tareque";
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void saveStudent(ActionEvent event) {
        System.out.println("We are calling the save method");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Student student = new Student(this.studentId, this.studentName);
        session.save(student);
        transaction.commit();
        session.close();
    }

    public List<Student> getStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> studentsList = session.createCriteria(Student.class).list();
        session.close();
        return studentsList;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
}
