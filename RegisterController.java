/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets2;

import java.awt.Color;
import java.io.IOException;
import pets2.Connectivity;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import pets2.FXMLDocumentController;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class RegisterController implements Initializable {

    @FXML
    private RadioButton owner;
    @FXML
    private RadioButton doctor;    
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
     private TextField email;
    @FXML
       private TextField username;
    @FXML
       private TextField telephone;
    @FXML
       private PasswordField password;
    @FXML
    private Button register;
     String x1;
    String x2;
//       ResultSet rs;
//Connection con;
    @FXML
    private ToggleGroup g1;
    @FXML
    private TextField extext;
    @FXML
    private Button backregister;
    @FXML
    private RadioButton admin1;
    @FXML
    private TextField day;
    @FXML
    private TextField timeslot;
    @FXML
    private TextField casesnumber;
    @FXML
    private Label lab99;
    @FXML
    private Label lol1;
    @FXML
    private Label lol2;
    @FXML
    private Label lol3;
    @FXML
    private Label lol4;
    @FXML
    private Label lol5;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void ActionRegister(ActionEvent event)throws Exception {
       if(!email.getText().matches("[a-zA-Z]+[0-9]*@[A-Za-z]{3,}.[A-Za-z]+"))
           lab99.setText("*Enter a Valid Email");
       if(firstname.getText().equals(""))
           lol1.setText("*Required");
       if(lastname.getText().equals(""))
           lol2.setText("*Required"); 
       
       
       if(username.getText().equals(""))
           lol3.setText("*Required");
       //else lol3.setText("");

       if(telephone.getText().equals(""))
           lol5.setText("*Required");
       //else lol5.setText("");

       if(password.getText().equals(""))
           lol4.setText("*Required");
       //else lol4.setText("");
    
       if(email.getText().matches("[a-zA-Z]+[0-9]*@[A-Za-z]{3,}.[A-Za-z]+") && !firstname.getText().equals("") && !lastname.getText().equals("") && !username.getText().equals("") && !password.getText().equals("") && !telephone.getText().equals("")){ 
           lol1.setText("");
           lol2.setText("");
           lol3.setText("");
           lol4.setText("");
           lol5.setText("");
           lab99.setText("");
     
       if(owner.isSelected()&&event.getSource()==register){
       Connectivity connectivity=new Connectivity();
    Connection connection=connectivity.getConnection();
           try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO OWNER VALUES(?,?,?,?,?,?)")) {
               preparedStatement.setString(1, firstname.getText());
               preparedStatement.setString(2, lastname.getText());
               preparedStatement.setString(3, username.getText());
               preparedStatement.setString(4, password.getText());
               preparedStatement.setString(5, email.getText());
               preparedStatement.setString(6, telephone.getText());
               preparedStatement.execute();
           }
                   Parent page14 = FXMLLoader.load(getClass().getResource("FXMLreg.fxml"));
       Scene scene14 = new Scene(page14);
       Stage win14=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win14.setScene(scene14);
       win14.show();
       }
       else if(doctor.isSelected()&&event.getSource()!=register) extext.setVisible(true);
       
       else if(doctor.isSelected()&&event.getSource()==register){
       
       int tt1=Integer.parseInt(extext.getText());
        

         Connectivity connectivity=new Connectivity();
    Connection connection=connectivity.getConnection();
           try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO vet VALUES(?,?,?,?,?,?,?,?,?,?,?)")) {
               preparedStatement.setString(1, firstname.getText());
               preparedStatement.setString(2, lastname.getText());
               preparedStatement.setString(3, username.getText());
               preparedStatement.setString(4, password.getText());
               preparedStatement.setString(5, email.getText());
               preparedStatement.setString(6, telephone.getText());
               String fullname = firstname.getText() + lastname.getText();
               preparedStatement.setString(8, fullname);
               preparedStatement.setString(9, day.getText());
               preparedStatement.setString(10, timeslot.getText());
               preparedStatement.setString(11, casesnumber.getText());
                 if(tt1>2) preparedStatement.setString(7, "true");
                 else{
                     JOptionPane.showMessageDialog(null,"Experience years must be 3 or more");
                     preparedStatement.setString(7, "false");
                 }
               preparedStatement.execute();
           }
     Parent page116 = FXMLLoader.load(getClass().getResource("FXMLreg.fxml"));
       Scene scene116 = new Scene(page116);
       Stage win116=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win116.setScene(scene116);
       win116.show();
    }
    else if(admin1.isSelected()&&event.getSource()==register){   
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO admin VALUES(?,?,?,?,?,?)")) {
            preparedStatement.setString(1, firstname.getText());
            preparedStatement.setString(2, lastname.getText());
            preparedStatement.setString(3, username.getText());
            preparedStatement.setString(4, password.getText());
            preparedStatement.setString(5, email.getText());
            preparedStatement.setString(6, telephone.getText());
            preparedStatement.execute();
        }
        Parent page146 = FXMLLoader.load(getClass().getResource("adminControl.fxml"));
        Scene scene146 = new Scene(page146);
        Stage win146=(Stage)((Node)event.getSource()).getScene().getWindow();
        win146.setScene(scene146);
        win146.show();
    }
}}
    

    @FXML
    private void group(ActionEvent event) {
       extext.setVisible(true); 
       day.setVisible(true);
       timeslot.setVisible(true);
      casesnumber.setVisible(true);
    }

    @FXML
    private void group2(ActionEvent event) {
        extext.setVisible(false);
         day.setVisible(false);
       timeslot.setVisible(false);
      casesnumber.setVisible(false);
    }

    @FXML
    private void backregisterAction(ActionEvent event) throws IOException {
        Parent page117 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       Scene scene117 = new Scene(page117);
       Stage win117=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win117.setScene(scene117);
       win117.show();
    }

    @FXML
    private void group3(ActionEvent event) {
          extext.setVisible(false);
         day.setVisible(false);
       timeslot.setVisible(false);
      casesnumber.setVisible(false);
      
    }

    @FXML
    private void emailregular(ActionEvent event) {
        
    }

    @FXML
    private void registerdownAction(MouseEvent event) {
        register.setScaleX(1);
        register.setScaleY(1);
    }

    @FXML
    private void registerupAction(MouseEvent event) {
        register.setScaleX(1.25);
        register.setScaleY(1.25);
    }

    @FXML
    private void backdownregAction(MouseEvent event) {
        backregister.setScaleX(1);
        backregister.setScaleY(1);
    }

    @FXML
    private void backupregAction(MouseEvent event) {
        backregister.setScaleX(1.25);
        backregister.setScaleY(1.25);
    }

    


}
