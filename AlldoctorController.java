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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AlldoctorController implements Initializable {

    @FXML
    private Button refresh;
    @FXML
    private Button app91;
    @FXML
    private TableView<doctor> table3;
    @FXML
    private TableColumn<doctor, String> doctorname;
    @FXML
    private TableColumn<doctor, String> day;
    @FXML
    private TableColumn<doctor, String> timeslot;
    @FXML
    private TableColumn<doctor, String> casenumber;
    @FXML
    private Button back990;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        doctorname.setCellValueFactory(new PropertyValueFactory<doctor,String>("doctor_name"));
       day.setCellValueFactory(new PropertyValueFactory<doctor,String>("day"));
       timeslot.setCellValueFactory(new PropertyValueFactory<doctor,String>("worktime"));
       casenumber.setCellValueFactory(new PropertyValueFactory<doctor,String>("casesnumber"));
       //casesnumber.setCellValueFactory(new PropertyValueFactory<doctor,String>("casesnumber"));
       //vetsmission.setItems(list2); 
    }    

    @FXML
    private void gotobookAction(ActionEvent event) throws IOException {
         Parent page12= FXMLLoader.load(getClass().getResource("Appointment.fxml"));
       Scene scene12 = new Scene(page12);
       Stage win12=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win12.setScene(scene12);
       win12.show();
    }

    @FXML
    private void refreshAction(ActionEvent event) throws SQLException {
        
	for ( int i = 0; i<table3.getItems().size(); i++) table3.getItems().clear();
        
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
     
        // Select
        String sql = "SELECT * FROM `vet`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            if(resultSet.getString(7).equals("true")){
                doctor per2 = new doctor(resultSet.getString(8),resultSet.getString(9), resultSet.getString(10), resultSet.getString(11));
                ObservableList<doctor> list3= table3.getItems();
                list3.add(per2);
                table3.setItems(list3);
            }
        }
    }

    @FXML
    private void back990Action(ActionEvent event) throws IOException {
         Parent page125= FXMLLoader.load(getClass().getResource("FXMLreg.fxml"));
       Scene scene125 = new Scene(page125);
       Stage win125=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       win125.setScene(scene125);
       win125.show();
    }

    @FXML
    private void refreshdownAction(MouseEvent event) {
        refresh.setScaleX(1);
        refresh.setScaleY(1);
    }

    @FXML
    private void refreshupAction(MouseEvent event) {
        refresh.setScaleX(1.25);
        refresh.setScaleY(1.25);
    }

    @FXML
    private void getdownAction(MouseEvent event) {
        app91.setScaleX(1);
        app91.setScaleY(1);
    }

    @FXML
    private void getupAction(MouseEvent event) {
         app91.setScaleX(1.25);
        app91.setScaleY(1.25);
    }
    
}
