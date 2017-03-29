/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.manipulation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private VBox vbox;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Button button = new Button("Test");
        button.setOnMouseClicked(event -> {
            System.out.println("This button was added programmatically");
        });
        vbox.getChildren().add(button);
        vbox.getChildren().add(new Button("Another Button"));
    }    

    @FXML
    private void handleAddAction(ActionEvent event) {
        System.out.println("This button was created through FXML");
    }
    
}
