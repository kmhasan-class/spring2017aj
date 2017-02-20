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
public enum GradeEntry {
    A_PLUS          ("A+", 4.00),
    A               ("A" , 3.75),
    A_MINUS         ("A-", 3.50),
    B_PLUS          ("B+", 3.25),
    B               ("B" , 3.00),
    B_MINUS         ("B-" , 2.75),
    C_PLUS          ("C+" , 2.50),
    C               ("C" , 2.25),
    D               ("D" , 2.00),
    F               ("F" , 0.00),
    R               ("R" , 0.00),
    I               ("I" , 0.00);
    
    private String letterGrade;
    private static Map<String, GradeEntry> letterToGradeMap;
    private double numericGrade;

    static {
        letterToGradeMap = new HashMap<>();
        /*
        letterToGradeMap.put("A+", A_PLUS);
        letterToGradeMap.put("A", A);
        letterToGradeMap.put("A-", A_MINUS);
        */
        for (GradeEntry gradeEntry : GradeEntry.values())
            letterToGradeMap.put(gradeEntry.letterGrade, gradeEntry);
    }
    
    private GradeEntry(String letterGrade, double numericGrade) {
        this.letterGrade = letterGrade;
        this.numericGrade = numericGrade;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public double getNumericGrade() {
        return numericGrade;
    }
    
    public static GradeEntry getGradeEntry(String letterGrade) {
        return letterToGradeMap.get(letterGrade);
    }
}
