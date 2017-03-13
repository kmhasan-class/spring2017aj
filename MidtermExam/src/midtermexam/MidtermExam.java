/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kmhasan
 */
public class MidtermExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Customer> customersList = new ArrayList<>();
        customersList.add(new Customer("John", "Doe", 88));
        customersList.add(new Customer("Rakibul", "Hasan", 33));
        customersList.add(new Customer("Ashiqur", "Rahman", 37));
        customersList.add(new Customer("Jane", "Doe", 66));
        
        List<Customer> seniorsList = customersList.stream()
                .filter(customer -> customer.getAge() > 65)
                .collect(Collectors.toList());
        
        System.out.println("All customers");
        customersList.forEach(System.out::println);
        
        System.out.println("Senior customers");
        seniorsList.forEach(System.out::println);
    }
    
}
