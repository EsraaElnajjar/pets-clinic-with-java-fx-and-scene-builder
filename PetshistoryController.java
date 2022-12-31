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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class PetshistoryController implements Initializable {

    @FXML
    private TableView<petClass> table4;
    @FXML
    private TableColumn<petClass, String> animalname;
    @FXML
    private TableColumn<petClass, String> doctorname;
    @FXML
    private TableColumn<petClass, String> app2date;
    @FXML
    private TableColumn<petClass, String> app2time;
    @FXML
    private Button refresh2;
    @FXML
    private Button back99;

    /**
     * Initializes the controller class.
     */
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        animalname.setCellValueFactory(new PropertyValueFactory<petClass,String>("animalname"));
       doctorname.setCellValueFactory(new PropertyValueFactory<petClass,String>("doctorname"));
       app2date.setCellValueFactory(new PropertyValueFactory<petClass,String>("appdate"));
       app2time.setCellValueFactory(new PropertyValueFactory<petClass,String>("apptime"));
       //casesnumber.setCellValueFactory(new PropertyValueFactory<doctor,String>("casesnumber"));
       //vetsmission.setItems(list2); 
    }

    @FXML
    private void refresh2Action(ActionEvent event) throws SQLException {
        for ( int i = 0; i<table4.getItems().size(); i++) table4.getItems().clear();
        
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
     
        // Select
        String sql = "SELECT * FROM `pet`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            petClass per4 = new petClass(resultSet.getString(1),resultSet.getString(5),resultSet.getString(6), resultSet.getString(7));
            ObservableList<petClass> list4= table4.getItems();
            list4.add(per4);
            table4.setItems(list4);
            
        }
    }

    @FXML
    private void back99Action(ActionEvent event) throws IOException {
        Parent page99= FXMLLoader.load(getClass().getResource("mission.fxml"));
       Scene scene99 = new Scene(page99);
       Stage win99=(Stage)((Node)event.getSource()).getScene().getWindow();
       win99.setScene(scene99);
       win99.show();
    }

    @FXML
    private void bdownAction(MouseEvent event) {
        back99.setScaleX(1);
        back99.setScaleY(1);
    }

    @FXML
    private void bupAction(MouseEvent event) {
        back99.setScaleX(1.25);
        back99.setScaleY(1.25);
    }

    @FXML
    private void dddownAction(MouseEvent event) {
        refresh2.setScaleX(1);
        refresh2.setScaleY(1);
    }

    @FXML
    private void uuupAction(MouseEvent event) {
        refresh2.setScaleX(1.25);
        refresh2.setScaleY(1.25);
    }
    
}
