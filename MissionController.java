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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MissionController implements Initializable {

    @FXML
    private TableView<doctor> vetsmission;
    @FXML
    private TableColumn<doctor, String> doctorname;
    @FXML
    private TableColumn<doctor, String> day;
    @FXML
    private TableColumn<doctor, String> worktime;
    @FXML
    private TableColumn<doctor, String> casesnumber;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt3;
    @FXML
    private TextField txt4;
    @FXML
    private Button historybutton;
    @FXML
    private Button backll;
    @FXML
    private Button View;
    @FXML
    private Button bupdate1;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     doctorname.setCellValueFactory(new PropertyValueFactory<doctor,String>("doctor_name"));
       day.setCellValueFactory(new PropertyValueFactory<doctor,String>("day"));
       worktime.setCellValueFactory(new PropertyValueFactory<doctor,String>("worktime"));
       casesnumber.setCellValueFactory(new PropertyValueFactory<doctor,String>("casesnumber"));
       //casesnumber.setCellValueFactory(new PropertyValueFactory<doctor,String>("casesnumber"));
       //vetsmission.setItems(list2);   
   }    

    private void insertAction(ActionEvent event) throws SQLException {
        doctor per = new doctor(txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText());
         ObservableList<doctor> list2= vetsmission.getItems();
        list2.add(per);
        vetsmission.setItems(list2);
        
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        
        //Insert
        String sql="INSERT INTO vet (doctorname,day,timeslot,casenumber) values(\'"+txt1.getText()+"\',\'"+txt2.getText()+"\',\'"+txt3.getText()+"\',\'"+txt4.getText()+"\')";
        Statement statement=connection.createStatement();
        statement.executeUpdate(sql);
      
    }

    @FXML
    private void updateAction(ActionEvent event) throws SQLException {
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        if(!txt2.getText().equals("")){
            String sql="UPDATE `vet` SET `day`='"+txt2.getText()+"' WHERE `email`='"+txt1.getText()+"'";
            Statement st=connection.createStatement();
            st.executeUpdate(sql);
           
        }
         if(!txt3.getText().equals("")){
            String sql="UPDATE `vet` SET `timeslot`='"+txt3.getText()+"' WHERE `email`='"+txt1.getText()+"'";
            Statement st=connection.createStatement();
            st.executeUpdate(sql);
           
        }
          if(!txt4.getText().equals("")){
            String sql="UPDATE `vet` SET `casenumber`='"+txt4.getText()+"' WHERE `email`='"+txt1.getText()+"'";
            Statement st=connection.createStatement();
            st.executeUpdate(sql);
           
        }
          if(!txt2.getText().equals("")||!txt3.getText().equals("")||!txt4.getText().equals(""))
              JOptionPane.showMessageDialog(null,"Updated Successfully");
    }


    @FXML
    private void historyAction(ActionEvent event) throws IOException {
        Parent page222= FXMLLoader.load(getClass().getResource("petshistory.fxml"));
       Scene scene222 = new Scene(page222);
       Stage win222=(Stage)((Node)event.getSource()).getScene().getWindow();
       win222.setScene(scene222);
       win222.show();
    }

    @FXML
    private void backllAction(ActionEvent event) throws IOException {
        Parent page2223= FXMLLoader.load(getClass().getResource("FXMLreg.fxml"));
       Scene scene2223 = new Scene(page2223);
       Stage win2223=(Stage)((Node)event.getSource()).getScene().getWindow();
       win2223.setScene(scene2223);
       win2223.show();
    }

    @FXML
    private void refreshAction(ActionEvent event) throws SQLException {
        	for ( int i = 0; i<vetsmission.getItems().size(); i++) vetsmission.getItems().clear();
        
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
     
        // Select
        String sql = "SELECT * FROM `vet`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            if(resultSet.getString(7).equals("true")){
                doctor per2 = new doctor(resultSet.getString(8),resultSet.getString(9), resultSet.getString(10), resultSet.getString(11));
                ObservableList<doctor> list3= vetsmission.getItems();
                list3.add(per2);
                vetsmission.setItems(list3);
            }
        }
    }

    @FXML
    private void redown7Action(MouseEvent event) {
        View.setScaleX(1);
        View.setScaleY(1);
    }

    @FXML
    private void reup7Action(MouseEvent event) {
        View.setScaleX(1.25);
        View.setScaleY(1.25);
    }

    @FXML
    private void gdownAction(MouseEvent event) {
        historybutton.setScaleX(1);
        historybutton.setScaleY(1);
    }

    @FXML
    private void gupAction(MouseEvent event) {
        historybutton.setScaleX(1.25);
        historybutton.setScaleY(1.25);
    }

    @FXML
    private void down7Action(MouseEvent event) {
        bupdate1.setScaleX(1);
        bupdate1.setScaleY(1);
    }

    @FXML
    private void up7Action(MouseEvent event) {
        bupdate1.setScaleX(1.25);
        bupdate1.setScaleY(1.25);
    }
    
}
