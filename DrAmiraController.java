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
public class DrAmiraController implements Initializable {

    @FXML
    private Button dramiraapp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getapp2Action(ActionEvent event) throws IOException {
         Parent page9= FXMLLoader.load(getClass().getResource("Appointment.fxml"));
       Scene scene9 = new Scene(page9);
       Stage win9=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win9.setScene(scene9);
       win9.show();
    }
    
}
