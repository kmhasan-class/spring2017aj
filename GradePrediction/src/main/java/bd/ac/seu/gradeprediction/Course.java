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
public class Course {
    private String courseCode;
    private String courseTitle;
    private double creditHours;

    public Course() {
    }

    public Course(String courseCode, String courseTitle, double creditHours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCreditHours() {
        return creditHours;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseTitle=" + courseTitle + ", creditHours=" + creditHours + '}';
    }
    
}
