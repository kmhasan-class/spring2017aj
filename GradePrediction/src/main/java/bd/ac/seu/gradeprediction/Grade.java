/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.gradeprediction;

/**
 *
 * @author kmhasan
 */
public class Grade {
    private Course course;
    private int semesterId;
    private String grade;

    public Grade() {
    }

    public Grade(Course course, int semesterId, String grade) {
        this.course = course;
        this.semesterId = semesterId;
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Grade{" + "course=" + course + ", semesterId=" + semesterId + ", grade=" + grade + '}';
    }
}
