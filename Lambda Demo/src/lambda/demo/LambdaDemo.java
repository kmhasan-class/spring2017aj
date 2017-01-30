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
        
        // approach 1: we can create separate comparator classes
        Collections.sort(coursesList, new CourseTitleComparator());
        
        // approach 2: use anonymous inner class
        Collections.sort(coursesList, new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getCourseTitle().compareTo(o2.getCourseTitle());
            }
        });
        
        // approach 3: use lambda expressions
        Collections.sort(coursesList, 
                (c1, c2) -> c1.getCourseCode().compareTo(c2.getCourseCode()));
        
        for (Course c : coursesList)
            System.out.println(c);
        
        Thread printerThread1 = new Thread(new PrinterThread());
        Thread printerThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i < 20; i++)
                    System.out.println(i);
            }
        });
        // write this 3rd thread using lambda expressions
        // print from 20 to 29
        Thread printerThread3 = new Thread
                (() -> {
                    for (int i = 20; i < 30; i++)
                        System.out.println(i);
                });
        printerThread1.start();
        printerThread2.start();
        printerThread3.start();
    }
    
}
