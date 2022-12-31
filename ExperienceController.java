/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets2;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
//import static pets2.RegisterController.firstname;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ExperienceController implements Initializable {

    @FXML
    private Button con;
    @FXML
    private TextField tt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void exAction(ActionEvent event) throws IOException, SQLException {
        /*int tt1=Integer.parseInt(tt.getText());
        if(tt1>2){
            Parent page116 = FXMLLoader.load(getClass().getResource("FXMLreg.fxml"));
       Scene scene116 = new Scene(page116);
       Stage win116=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win116.setScene(scene116);
       win116.show();
      /* Connectivity connectivity=new Connectivity();
    Connection connection=connectivity.getConnection();
    PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO vet VALUES(?,?,?,?,?,?)");
    preparedStatement.setString(1, RegisterController.firstname.getText());
    preparedStatement.setString(2, RegisterController.lastname.getText());
    preparedStatement.setString(3, RegisterController.username.getText());
    preparedStatement.setString(4, RegisterController.password.getText());
    preparedStatement.setString(5, RegisterController.email.getText());
    preparedStatement.setString(6, RegisterController.telephone.getText());
    preparedStatement.execute();
    preparedStatement.close();*/
      
            /*System.out.println(firstname.getText());
        }else{
           JOptionPane.showMessageDialog(null,"Experience years must be 3 or more");
        }*/
    }
    
}
