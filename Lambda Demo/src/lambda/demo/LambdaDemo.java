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
public class LambdaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();
        stringsList.add("Java");
        stringsList.add("C");
        stringsList.add("Python");
        stringsList.add("Ruby");
        stringsList.add("Basic");
        Collections.sort(stringsList);
        for (String s : stringsList)
            System.out.println(s);
        
        List<Course> coursesList = new ArrayList<>();
        coursesList.add(new Course("MATH1024", "Coordinate Geometry", 3.0));
        coursesList.add(new Course("CSE4048", "Advanced Java Lab", 1.0));
        coursesList.add(new Course("CSE4047", "Advanced Java", 3.0));
        coursesList.add(new Course("ENG1001", "Basic Composition", 0.0));
        //Collections.sort(coursesList);
        //Collections.sort(coursesList, new CreditHoursComparator());
        // Task 1: Sort the courses based on course title
        for (Course c : coursesList)
            System.out.println(c);
    }
    
}
