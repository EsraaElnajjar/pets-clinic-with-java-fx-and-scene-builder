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
public class AdminControlController implements Initializable {

    @FXML
    private Button deletevet;
    @FXML
    private TextField tfdelete;
    @FXML
    private Button back000;
    @FXML
    private Button addvet1;
    @FXML
    private TableView<AllData> table44;
    @FXML
    private TableColumn<AllData, String> f44;
    @FXML
    private TableColumn<AllData, String> l44;
    @FXML
    private TableColumn<AllData, String> e44;
    @FXML
    private TableColumn<AllData, String> u44;
    @FXML
    private TableColumn<AllData, String> p44;
    @FXML
    private TableColumn<AllData, String> t44;
    @FXML
    private TableColumn<AllData, String> a44;
    @FXML
    private TableColumn<AllData, String> d44;
    @FXML
    private TableColumn<AllData, String> day44;
    @FXML
    private TableColumn<AllData, String> time44;
    @FXML
    private TableColumn<AllData, String> noc44;
    @FXML
    private Button refresh44;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        f44.setCellValueFactory(new PropertyValueFactory<AllData,String>("firstname"));
       l44.setCellValueFactory(new PropertyValueFactory<AllData,String>("lastname"));
       e44.setCellValueFactory(new PropertyValueFactory<AllData,String>("email"));
       u44.setCellValueFactory(new PropertyValueFactory<AllData,String>("username"));
       p44.setCellValueFactory(new PropertyValueFactory<AllData,String>("password"));
       t44.setCellValueFactory(new PropertyValueFactory<AllData,String>("telephone"));
       a44.setCellValueFactory(new PropertyValueFactory<AllData,String>("approved"));
       d44.setCellValueFactory(new PropertyValueFactory<AllData,String>("doctorname"));
       day44.setCellValueFactory(new PropertyValueFactory<AllData,String>("day"));
       time44.setCellValueFactory(new PropertyValueFactory<AllData,String>("timeslot"));
       noc44.setCellValueFactory(new PropertyValueFactory<AllData,String>("casenumber"));
       
    }    

    @FXML
    private void deletevetAction(ActionEvent event) throws SQLException {
         Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        
        //Insert
        String sql="UPDATE `vet` SET `approved`='false' WHERE `email`='"+tfdelete.getText()+"'";
        Statement statement=connection.createStatement();
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Deleted Successfully");
    }

    @FXML
    private void back000Action(ActionEvent event) throws IOException {
        Parent page44= FXMLLoader.load(getClass().getResource("FXMLreg.fxml"));
       Scene scene44 = new Scene(page44);
       Stage win44=(Stage)((Node)event.getSource()).getScene().getWindow();
       win44.setScene(scene44);
       win44.show();
    }

    @FXML
    private void addvetAction(ActionEvent event) throws IOException {
       Parent page441= FXMLLoader.load(getClass().getResource("addNewDoctorByAdmin.fxml"));
       Scene scene441 = new Scene(page441);
       Stage win441=(Stage)((Node)event.getSource()).getScene().getWindow();
       win441.setScene(scene441);
       win441.show();
    }

    @FXML
    private void refresh44Action(ActionEvent event) throws SQLException {
        
	for ( int i = 0; i<table44.getItems().size(); i++) table44.getItems().clear();
        
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
     
        // Select
        String sql = "SELECT * FROM `vet`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            if(!resultSet.getString(2).equals("111")){
                AllData per2 = new AllData(resultSet.getString(1),resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11));
                ObservableList<AllData> list3= table44.getItems();
                list3.add(per2);
                table44.setItems(list3);
            }
        }
    }

    @FXML
    private void ddownAction(MouseEvent event) {
        deletevet.setScaleX(1);
        deletevet.setScaleY(1);
    }

    @FXML
    private void uupAction(MouseEvent event) {
        deletevet.setScaleX(1.25);
        deletevet.setScaleY(1.25);
    }

    @FXML
    private void downAction(MouseEvent event) {
        addvet1.setScaleX(1);
        addvet1.setScaleY(1);
    }

    @FXML
    private void upAction(MouseEvent event) {
        addvet1.setScaleX(1.25);
        addvet1.setScaleY(1.25);
    }

    @FXML
    private void redownAction(MouseEvent event) {
        refresh44.setScaleX(1);
        refresh44.setScaleY(1);
    }

    @FXML
    private void reupAction(MouseEvent event) {
        refresh44.setScaleX(1.25);
        refresh44.setScaleY(1.25);
    }
    
    
}
