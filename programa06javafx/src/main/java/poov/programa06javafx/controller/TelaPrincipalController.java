package poov.programa06javafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaPrincipalController {
    
    @FXML
    private Button logoutButton;

    @FXML
    private AnchorPane scenePane;

    private Stage stage;

    @FXML
    public void logout(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Você está prestes a sair do programa.");
        alert.setContentText("Deseja realmente sair?");

        if (alert.showAndWait().get() == ButtonType.OK)  {
            stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
        }
    }
}
