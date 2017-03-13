/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.midtermq4;

import bd.ac.seu.midterm4.model.Sculpture;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmhasan
 */
public class Main {

    public void readJson() {
        Gson gson = new GsonBuilder().create();
        try {
            URL url = new URL("http://my.seu.ac.bd/~kmhasan/sculptures.json");
            InputStream inputStream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            
            String jsonString = "";
            String line;
            while ((line = bufferedReader.readLine()) != null)
                jsonString += line.trim();
            System.out.println("JSON input = [" + jsonString + "]");
            
            Type sculpturesListType = new TypeToken<List<Sculpture>>(){}.getType();
            List<Sculpture> sculpturesList = gson.fromJson(jsonString, sculpturesListType);
            
            sculpturesList.forEach(System.out::println);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Main() {
        //readJson();
        JavaMidtermExam obj = new JavaMidtermExam();
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(4);
        numbersList.add(3);
        numbersList.add(2);
        int sum = obj.getSquaredSum(numbersList);
        System.out.println(sum);
    }
    
    public static void main(String args[]) {
        new Main();
    }
}
