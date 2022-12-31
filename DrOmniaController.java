/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DrOmniaController implements Initializable {

    @FXML
    private Button dromniaapp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getapp3Action(ActionEvent event) throws IOException {
         Parent page10= FXMLLoader.load(getClass().getResource("Appointment.fxml"));
       Scene scene10 = new Scene(page10);
       Stage win10=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win10.setScene(scene10);
       win10.show();
    }
    
}
