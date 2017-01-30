/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.demo;

/**
 *
 * @author kmhasan
 */
public class Course implements Comparable<Course> {
    private String courseCode;
    private String courseTitle;
    private double creditHours;

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

    @Override
    public int compareTo(Course b) {
        Course a = this;
        
        if (a.courseCode.compareTo(b.courseCode) < 0)
            return -1;
        else if (a.courseCode.compareTo(b.courseCode) > 0)
            return +1;
        else return 0;
    }
}



