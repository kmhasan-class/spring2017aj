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
public class CreditHoursComparator implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        if (o1.getCreditHours() < o2.getCreditHours())
            return -1;
        else if (o1.getCreditHours() > o2.getCreditHours())
            return +1;
        else return 0;
    }
    
}
