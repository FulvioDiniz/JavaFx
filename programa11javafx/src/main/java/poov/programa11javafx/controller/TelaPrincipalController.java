package poov.programa11javafx.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class TelaPrincipalController {

    @FXML
    private Label temperaturaLabel;

    @FXML
    private Slider temperaturaSlider;

    private int temperatura;

    public void initialize() {

        temperatura = (int) temperaturaSlider.getValue();
        temperaturaLabel.setText(temperatura + " °C");

        temperaturaSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                temperatura = (int) temperaturaSlider.getValue();
                temperaturaLabel.setText(temperatura + " °C");
            }

        });
    }

}

