/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.io.*;
import java.util.*;

/**
 *
 * @author kmhasan
 */
public class Calculator {

    public Calculator() {
        Scanner scanner = new Scanner(System.in);
        String operatorName;
        int number1;
        int number2;
        int result = 0;
        
        System.out.println("Enter the operation name and two integer operands");
        operatorName = scanner.next();
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        
        /*
        for (Operation operation : Operation.getOperationsList())
            if (operation.getOperationName().equals(operationName))
                result = Operation.operate(number1, number2);
        */
        result = Operation.getOperation(operatorName).operate(number1, number2);
        
        /*
        switch (operatorName) {
            case "ADD":
                result = number1 + number2;
                break;
            case "MULTIPLY":
                result = number1 * number2;
                break;
            default: break;
        }
        */
        System.out.printf("[%s %d %d = %d]\n", operatorName, number1, number2, result);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Calculator();
    }
    
}
