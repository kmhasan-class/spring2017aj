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
    private double cgpa;
    private double creditsCompleted;
    private double creditsAttempted;
    private boolean cgpaComputed;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        gradesList = new ArrayList<>();
        cgpaComputed = false;
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

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName);
    }

    public void computeCgpa() {
        cgpa = 0.0;
        creditsCompleted = 0.0;
        creditsAttempted = 0.0;
        double cumulativeGp = 0.0;

        boolean ignoredGrades[] = new boolean[gradesList.size()];
        /*
        for (Grade grade : gradesList) {
            creditsAttempted += grade.getCourse().getCreditHours();
            cumulativeGp += grade.getCourse().getCreditHours() * grade.toNumericGrade();
        }
        */
        for (int i = 0; i < gradesList.size(); i++) {
            Grade g1 = gradesList.get(i);
            double bestGp = g1.toNumericGrade();
            double credits = g1.getCourse().getCreditHours();
            
            for (int j = i + 1; j < gradesList.size(); j++) {
                if (ignoredGrades[j])
                    continue;
                Grade g2 = gradesList.get(j);
                if (g1.getCourse().getCourseCode().equals(g2.getCourse().getCourseCode())) {
                    bestGp = Math.max(bestGp, g2.toNumericGrade());
                    ignoredGrades[j] = true;
                }
            }
            
            ignoredGrades[i] = true;
        }
        // finish this one off
        if (creditsAttempted > 0) {
            cgpa = cumulativeGp / creditsAttempted;
        }
    }

    public double getCgpa() {
        if (!cgpaComputed) {
            computeCgpa();
            cgpaComputed = true;
        }
        return cgpa;
    }

    public double getCreditsCompleted() {
        if (!cgpaComputed) {
            computeCgpa();
            cgpaComputed = true;
        }
        return creditsCompleted;
    }

    public double getCreditsAttempted() {
        if (!cgpaComputed) {
            computeCgpa();
            cgpaComputed = true;
        }
        return creditsAttempted;
    }
}
