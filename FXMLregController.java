/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets2;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FXMLregController implements Initializable {

    @FXML
    private Button b1;
    @FXML
    private ToggleGroup g2;
    @FXML
    private RadioButton vet;
    @FXML
    private RadioButton owner;
    @FXML
    private RadioButton admin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button back88;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void availableAction(ActionEvent event) throws IOException, SQLException {
        
         if(owner.isSelected()&&event.getSource()==b1){
             Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();     

        String sql = "SELECT * FROM `owner`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        boolean valid = false;
        while(resultSet.next()){
            if(resultSet.getString(3).equals(username.getText()) && resultSet.getString(4).equals(password.getText())){
               valid = true;
               break; 
            }
        }
        if(valid){
            JOptionPane.showMessageDialog(null, "Login Successfully");
            Parent page144 = FXMLLoader.load(getClass().getResource("alldoctor.fxml"));
            Scene scene144 = new Scene(page144);
            Stage win144=(Stage)((Node)event.getSource()).getScene().getWindow();
            win144.setScene(scene144);
            win144.show();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please, Enter Correct Data");
            username.setText("");
            password.setText("");
        }
    }
      else if(vet.isSelected()&&event.getSource()==b1){
                   Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();     

        String sql = "SELECT * FROM `vet`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        boolean valid = false;
        while(resultSet.next()){
            if(resultSet.getString(4).equals(username.getText()) && resultSet.getString(5).equals(password.getText())){
               valid = true;
               break; 
            }
        }
        if(valid){
            if(resultSet.getString(7).equals("false")){
                JOptionPane.showMessageDialog(null, "You are Not Allowed !!");
                username.setText("");
                password.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Successfully");
                Parent page1111 = FXMLLoader.load(getClass().getResource("mission.fxml"));
                Scene scene1111 = new Scene(page1111);
                Stage win1111=(Stage)((Node)event.getSource()).getScene().getWindow();
                win1111.setScene(scene1111);
                win1111.show();
            }
        }
        
          else{
            JOptionPane.showMessageDialog(null, "Please, Enter Correct Data");
            username.setText("");
            password.setText("");
        }
     
    }
         else if(admin.isSelected()&&event.getSource()==b1){
             Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();     

        String sql = "SELECT * FROM `admin`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        boolean valid = false;
        while(resultSet.next()){
            if(resultSet.getString(3).equals(username.getText()) && resultSet.getString(4).equals(password.getText())){
               valid = true;
               break; 
            }
        }
        if(valid){
            JOptionPane.showMessageDialog(null, "Login Successfully");
            Parent page1112 = FXMLLoader.load(getClass().getResource("adminControl.fxml"));
            Scene scene1112 = new Scene(page1112);
            Stage win1112=(Stage)((Node)event.getSource()).getScene().getWindow();
            win1112.setScene(scene1112);
            win1112.show();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please, Enter Correct Data");
            username.setText("");
            password.setText("");
        }
       
    }
    
         }

    @FXML
    private void back88Action(ActionEvent event) throws IOException {
         Parent page88 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene88 = new Scene(page88);
            Stage win88=(Stage)((Node)event.getSource()).getScene().getWindow();
            win88.setScene(scene88);
            win88.show();
    }

    @FXML
    private void downAction(MouseEvent event) {
          b1.setScaleY(1);
        b1.setScaleX(1);
    }

    @FXML
    private void upAction(MouseEvent event) {
         b1.setScaleY(1.5);
        b1.setScaleX(1.5);
    }

    
    }
