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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AddNewDoctorByAdminController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private TextField t3;
    @FXML
    private TextField t5;
    @FXML
    private TextField t9;
    @FXML
    private TextField t7;
    @FXML
    private TextField t11;
    @FXML
    private TextField t2;
    @FXML
    private TextField t4;
    @FXML
    private TextField t6;
    @FXML
    private TextField t8;
    @FXML
    private TextField t10;
    @FXML
    private Button ok;
    @FXML
    private Button backtoadd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void okAction(ActionEvent event) throws SQLException {
        Connectivity connectivity=new Connectivity();
    Connection connection=connectivity.getConnection();
           try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO vet VALUES(?,?,?,?,?,?,?,?,?,?,?)")) {
               preparedStatement.setString(1, t1.getText());
               preparedStatement.setString(2, t2.getText());
               preparedStatement.setString(3, t3.getText());
               preparedStatement.setString(4, t4.getText());
               preparedStatement.setString(5, t5.getText());
               preparedStatement.setString(6, t6.getText());
               preparedStatement.setString(7, t7.getText());
               preparedStatement.setString(8, t8.getText());
               preparedStatement.setString(9, t9.getText());
               preparedStatement.setString(10, t10.getText());
               preparedStatement.setString(11, t11.getText());
               preparedStatement.execute();
           }
    }

    @FXML
    private void backtoaddAction(ActionEvent event) throws IOException {
         Parent page1255= FXMLLoader.load(getClass().getResource("adminControl.fxml"));
       Scene scene1255 = new Scene(page1255);
       Stage win1255=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win1255.setScene(scene1255);
       win1255.show();
    }

    @FXML
    private void down5Action(MouseEvent event) {
         ok.setScaleY(1);
        ok.setScaleX(1);
    }

    @FXML
    private void up5Action(MouseEvent event) {
         ok.setScaleY(1.25);
        ok.setScaleX(1.25);
    }

    @FXML
    private void down6Action(MouseEvent event) {
         backtoadd.setScaleY(1);
        backtoadd.setScaleX(1);
    }

    @FXML
    private void up6Action(MouseEvent event) {
         backtoadd.setScaleY(1.25);
        backtoadd.setScaleX(1.25);
    }
    
}
