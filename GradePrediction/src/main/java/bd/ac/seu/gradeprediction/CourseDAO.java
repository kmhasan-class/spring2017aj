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
public interface CourseDAO {
    public List<Course> getCourses();
    public Course getCourse(String courseCode);
    public void addCourse(Course course);
    public void updateCourse(Course course);
    public void deleteCourse(Course course);
}
