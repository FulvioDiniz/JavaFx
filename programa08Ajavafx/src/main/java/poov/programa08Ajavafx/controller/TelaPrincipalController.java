package poov.programa08Ajavafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class TelaPrincipalController {
    
    @FXML
    private ToggleGroup comida;

    @FXML
    private Label comidaLabel;

    @FXML
    private RadioButton rButtonHamburguer;

    @FXML
    private RadioButton rButtonPastel;

    @FXML
    private RadioButton rButtonPizza;

    @FXML
    void comidaAlterada(ActionEvent event) {
        if (rButtonHamburguer.isSelected()) {
            // comidaLabel.setText("Comida escolhida: Hamburguer");
            comidaLabel.setText("Comida escolhida: " + rButtonHamburguer.getText());
        } else if (rButtonPastel.isSelected()) {
            comidaLabel.setText("Comida escolhida: Pastel");
        } else if (rButtonPizza.isSelected()) {
            comidaLabel.setText("Comida escolhida: Pizza");
        }
    }

}
