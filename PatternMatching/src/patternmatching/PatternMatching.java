/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternmatching;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kmhasan
 */
public class PatternMatching {

    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("Can't find the console!");
            System.exit(1);
        }
        String input = console.readLine("Enter a string: ");
        String patternString = "(\\+88)?01[1[5-9]]\\d{8}";
        
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.matches()) {
            System.out.println("We found a match! " + matcher.group());
            System.out.println("Starts at " + matcher.start());
            System.out.println("End at " + matcher.end());
        } else {
            System.out.println("No match found!");
        }
    }
    
}
