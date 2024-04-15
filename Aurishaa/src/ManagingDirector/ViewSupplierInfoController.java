/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;

import Classes.SupplierInformationTable;

import Users.ManagingDirector;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ViewSupplierInfoController implements Initializable {

    @FXML
    private TableView<SupplierInformationTable> supplierInfoTableView;
    @FXML
    private TableColumn<SupplierInformationTable, String> supplierNameTableColumn;
    @FXML
    private TableColumn<SupplierInformationTable, String> contactNumberTableColumn;
    private ManagingDirector managingDirector;

    public ManagingDirector getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }
    
                   ObservableList<SupplierInformationTable> supplierInfo = ManagingDirector.viewSupplierInformation();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

       supplierNameTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("contactPerson"));
       contactNumberTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("contactNumber"));    
       supplierInfoTableView.setItems(ManagingDirector.viewSupplierInformation());
       
               ObservableList<SupplierInformationTable> supplierInfo = ManagingDirector.viewSupplierInformation();

    }
    @FXML
    private void goToDashBoardOnButtonClick(ActionEvent event) {
        
        
    }
    
}
