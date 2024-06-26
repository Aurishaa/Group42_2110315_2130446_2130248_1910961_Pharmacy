
package SupplyChainManager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SupplyChainManager_DashboardController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void provideOrdersButtonMouseOnClicked(ActionEvent event)  throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Provide_Orders.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }


    @FXML
    private void viewStatusButtonMouseOnClicked(ActionEvent event)  throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("View_Status.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }


    @FXML
    private void budgetApproveButtonMouseOnClicked(ActionEvent event)  throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("BudgetApprovalRequest.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }


    @FXML
    private void approveProductButtonMouseOnClicked(ActionEvent event)  throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Approve_Product.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }


    @FXML
    private void InventoryButtonMouseOnClicked(ActionEvent event)  throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }


    @FXML
    private void viewSuppliersButtonMouseOnClicked(ActionEvent event)  throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("ViewSuppliers.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }


    @FXML
    private void manageProductsButtonMouseOnClicked(ActionEvent event)  throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("ManageOrders.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }


    @FXML
    private void backButtonMouseOnClicked(ActionEvent event)  throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Common/login.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    



    @FXML
    private void viewReportButtonMouseOnClicked(ActionEvent event) throws IOException {
    Parent mainSceneParent = FXMLLoader.load(getClass().getResource("ViewReport.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
