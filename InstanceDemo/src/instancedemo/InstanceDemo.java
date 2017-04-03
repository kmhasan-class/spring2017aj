/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancedemo;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class InstanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String obj1 = "Something";
        Integer obj2 = 135;
        
        ArrayList collection = new ArrayList();
        collection.add(obj1);
        collection.add(obj2);
        
        if (collection.get(1) instanceof String) {
            System.out.println(((String) collection.get(1)).toUpperCase());
        }
    }
    
}
