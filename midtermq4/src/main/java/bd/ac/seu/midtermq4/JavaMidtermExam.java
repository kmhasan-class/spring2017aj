/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.midtermq4;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class JavaMidtermExam {
    public int getSquaredSum(ArrayList<Integer> numbersList) {
        int sum = 0;
        for (Integer num : numbersList)
            sum = sum + num * num;
        return sum;
    }
}
