package poov.programa13javafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleGroup;

public class TelaPrincipalController {

    @FXML
    private ToggleGroup grupo;

    @FXML
    private Label meuLabel;

    @FXML
    void menuSelecionado(ActionEvent event) {
        MenuItem menuItem = (MenuItem)event.getSource();
        meuLabel.setText(menuItem.getText() + " selecionado");
    }

}

