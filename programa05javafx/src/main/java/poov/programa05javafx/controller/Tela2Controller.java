package poov.programa05javafx.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Tela2Controller {
    
    @FXML
    private Label message;

    public Tela2Controller() {
        System.out.println("Tela2Controller criado");
    }

    public void displayUsername(String username) throws IOException {
        message.setText("Bem-vindo, " + username + "!");
    }

}
