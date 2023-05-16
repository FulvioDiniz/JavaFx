package poov.programa08Bjavafx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

// O FXMLLoader é esquisito:
// -Se vc definir um método initialize() sem parâmetros no controller e não implementar a interface
// Initializable, então o FXMLLoader vai chamar automaticamente esse método.
// -Se vc definir um método initialize(URL url, ResourceBundle rb) com parâmetros no controller então o
// FXMLLoader não vai chamar automaticamente esse método a não ser que o controller implemente a interface
// Initializable.

// public class TelaPrincipalController implements Initializable {
public class TelaPrincipalController {

    @FXML
    private ToggleGroup comida;

    @FXML
    private Label comidaLabel;

    public void initialize() {
        comida.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> observable,
                    Toggle oldSelectedRadio, Toggle newSelectedRadio) {
                if (newSelectedRadio != null) {
                    RadioButton selectedRadioButton = (RadioButton) newSelectedRadio;
                    comidaLabel.setText("Comida escolhida: " + selectedRadioButton.getText());
                }
            }
        });
    }

}
