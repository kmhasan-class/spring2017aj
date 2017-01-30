/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.demo;

import java.util.*;
/**
 *
 * @author kmhasan
 */
public class CourseTitleComparator implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        return o1.getCourseTitle().compareTo(o2.getCourseTitle());
    }
    
}
