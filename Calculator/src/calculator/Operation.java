/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
/**
 *
 * @author kmhasan
 */
public class Operation implements Operable {
    private String operationName;
    private static List<Operation> operationsList;
    private Operable operable;
    
    static {
        operationsList = new ArrayList<>();
        operationsList.add(new Operation("ADD", (number1, number2) -> number1 + number2));
        operationsList.add(new Operation("MULTIPLY", (number1, number2) -> number1 * number2));
        operationsList.add(new Operation("SUBTRACT", (number1, number2) -> number1 - number2));
        operationsList.add(new Operation("DIVIDE", (number1, number2) -> number1 / number2));
    }

    public Operation(String operationName, Operable operable) {
        this.operationName = operationName;
        this.operable = operable;
    }
    
    
    public static Operation getOperation(String operationName) {
        for (Operation operation : operationsList)
            if (operation.getOperationName().equals(operationName))
                return operation;
        return null;
    }

    @Override
    public int operate(int number1, int number2) {
        return operable.operate(number1, number2);
    }
    
    public String getOperationName() {
        return operationName;
    }
}
