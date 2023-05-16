package poov.programa05javafx.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Tela1Controller {
    
    @FXML
    private TextField usernameTextField;

    public Tela1Controller() {
        System.out.println("Tela1Controller criado");
    }

    public void login(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Tela2.fxml"));
        Parent root = loader.load();
        Tela2Controller tela2Controller = loader.getController();

        String username = usernameTextField.getText();
        if (username.isEmpty()) {
            username = "João Ninguém";
        }

        tela2Controller.displayUsername(username);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
