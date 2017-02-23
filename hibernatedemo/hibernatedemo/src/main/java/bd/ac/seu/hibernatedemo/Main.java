/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.hibernatedemo;

import bd.ac.seu.hibernatedemo.model.Student;
import bd.ac.seu.hibernatedemo.util.SessionFactorySingleton;
import org.hibernate.Session;
import java.util.*;
/**
 *
 * @author kmhasan
 */
public class Main {

    public static void main(String args[]) {
        Session session = SessionFactorySingleton.getSessionFactory().openSession();

        session.beginTransaction();
        /*
        // writing to the database
        Student student = new Student("54433", "Jane Doe");
        session.save(student);
        */
        List<Student> studentsList = session.createCriteria(Student.class).list();
        studentsList.forEach(Student::print);
        session.getTransaction().commit();

        session.close();
        
        SessionFactorySingleton.getSessionFactory().close();
    }
}
