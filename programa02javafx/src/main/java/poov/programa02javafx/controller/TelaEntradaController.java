package poov.programa02javafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaEntradaController {

    @FXML
    private Button botao;

    @FXML
    private TextField texto;

    @FXML
    void botaoClicado(ActionEvent event) {
        System.out.println("Botão clicado!");
        System.out.println("Texto: " + texto.getText());
    }

}
