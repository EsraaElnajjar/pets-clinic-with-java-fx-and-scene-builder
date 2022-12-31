/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets2;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AppointmentController implements Initializable {

    @FXML
    private TextField animalname;
    @FXML
    private TextField animaltype;
    @FXML
    private TextField animalage;
    @FXML
    private TextField doctorname;
    @FXML
    private TextField appdate;
    @FXML
    private TextField apptime;
    @FXML
    private Button book;
    @FXML
    private TextField ownername;
    @FXML
    private Button back101;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bookAction(ActionEvent event) throws SQLException {
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        
        //Insert
        String sql="INSERT INTO pet values(\'"+animalname.getText()+"\',\'"+ownername.getText()+"\',\'"+animaltype.getText()+"\',\'"+animalage.getText()+"\',\'"+doctorname.getText()+"\',\'"+appdate.getText()+"\',\'"+apptime.getText()+"\')";
        Statement statement=connection.createStatement();
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Booked successfully");
    }

    @FXML
    private void back101Action(ActionEvent event) throws IOException {
         Parent page333= FXMLLoader.load(getClass().getResource("alldoctor.fxml"));
       Scene scene333 = new Scene(page333);
       Stage win333=(Stage)((Node)event.getSource()).getScene().getWindow();
       win333.setScene(scene333);
       win333.show();
    }

    @FXML
    private void down5Action(MouseEvent event) {
        book.setScaleY(1);
        book.setScaleX(1);
    }

    @FXML
    private void up5Action(MouseEvent event) {
        book.setScaleY(1.25);
        book.setScaleX(1.25);
    }
    
}
