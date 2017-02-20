/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.jsondemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kmhasan
 */
public class Main {
    public static void writingExample() {
        Student s1 = new Student("222", "J Doe", 2.3);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String output = gson.toJson(s1);
        
        try {
            RandomAccessFile outFile = new RandomAccessFile("student.txt", "rw");
            outFile.setLength(0);
            outFile.writeBytes(output);
            outFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // task for lab session
    // read from: http://172.17.4.254/~kmhasan/__WebServices/spring2017aj/schedule_section_json.php?semester=45
    // create a Java list out of it
    
    public static void readFromURL() {
        try {
            URL url = new URL("http://172.17.4.254/~kmhasan/__WebServices/spring2017aj/schedule_section_json.php?semester=45");
            InputStream inputStream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readingExample() {
        try {
            RandomAccessFile inFile = new RandomAccessFile("student.txt", "r");
            String line;
            String inputString = "";
            
            while ((line = inFile.readLine()) != null) {
                inputString += line;
            }
            
            Gson gson = new GsonBuilder().create();
            Student s1 = gson.fromJson(inputString, Student.class);
            System.out.println(s1.getStudentName());
            inFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String args[]) {
        //readingExample();
        readFromURL();
    }
}
