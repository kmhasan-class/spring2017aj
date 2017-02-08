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

    public double toNumericGrade() {
        double value = 0.0;
        
        switch (grade) {
            case "A+": value = 4.00; break;
            case "A" : value = 3.75; break;
            case "A-": value = 3.50; break;
            case "B+": value = 3.25; break;
            case "B" : value = 3.00; break;
            case "B-": value = 2.75; break;
            case "C+": value = 2.50; break;
            case "C" : value = 2.25; break;
            case "D" : value = 2.00; break;
            case "F" : value = 0.00; break;
            default  : value = 0.00; break;
        }
        
        return value;
    }
    
    @Override
    public String toString() {
        return "Grade{" + "course=" + course + ", semesterId=" + semesterId + ", grade=" + grade + '}';
    }
}
