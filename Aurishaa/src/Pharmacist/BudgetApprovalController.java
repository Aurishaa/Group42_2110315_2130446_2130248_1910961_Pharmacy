/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Pharmacist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jupit
 */
public class BudgetApprovalController implements Initializable {

    @FXML
    private TextField departmentTextField;
    @FXML
    private TextField budgetTextField;
    @FXML
    private DatePicker dateOfRequestTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void submitButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void dateButtonOnMouseClick(ActionEvent event) {
    }
    
}
