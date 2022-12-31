/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets2;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {
      @FXML
    private Button btngeg;

    @FXML
    private Button btnlog;
   Connection con;
    String x1;
    String x2;
       ResultSet rs;
       Button register1;
       TextField firstname;TextField lastname;TextField username;TextField email, telephone;
       PasswordField password;
       RadioButton admin;
       RadioButton owner;
       RadioButton doctor;
    @FXML
    private void logAction(ActionEvent event) throws IOException {
      Parent page2 = FXMLLoader.load(getClass().getResource("FXMLreg.fxml"));
       Scene scene = new Scene(page2);
       Stage win=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win.setScene(scene);
       win.show();
    }
    
    
    @FXML
    private void regAction(ActionEvent event) throws IOException{
       Parent page3 = FXMLLoader.load(getClass().getResource("register.fxml"));
       Scene scene2 = new Scene(page3);
       Stage win2=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win2.setScene(scene2);
       win2.show();
    }
    
   /* public void forRegister(){ 
      
           PreparedStatement stm;
        try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             System.out.println("connect");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
                PreparedStatement preparedStatement=con.prepareStatement("INSERT INTO OWNER VALUES(?,?,?,?,?,?)");
                preparedStatement.setString(1, firstname.getText());
                preparedStatement.setString(2, lastname.getText());
                preparedStatement.setString(3, username.getText());
                preparedStatement.setString(4, password.getText());
                preparedStatement.setString(5, email.getText());
                preparedStatement.setString(6, telephone.getText());
                preparedStatement.execute();
                preparedStatement.close();
//               
         String sql="INSERT INTO  `owner` VALUES ('"+firstname.getText()+"','"+lastname.getText()+"','"+username.getText()+"','"+password.getText()+"','"+email.getText()+"','"+telephone.getText()+"')";
   //        System.out.print("hhh");
     //       stm = con.prepareStatement(sql);
            

    /*           rs = stm.executeQuery();
              
        
            if(rs.next()){
                
               
                
            }else{
                System.out.println("not Valid");
                }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
      
          */
    
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void down4Action(MouseEvent event) {
        btngeg.setScaleY(1);
        btngeg.setScaleX(1);
    }

    @FXML
    private void up4Action(MouseEvent event) {
      btngeg .setScaleY(1.25);
      btngeg.setScaleX(1.25);
    }

    @FXML
    private void down3Action(MouseEvent event) {
        btnlog.setScaleY(1);
        btnlog.setScaleX(1);
    }

    @FXML
    private void up3Action(MouseEvent event) {
        btnlog.setScaleY(1.25);
        btnlog.setScaleX(1.25);
    }
    
}
