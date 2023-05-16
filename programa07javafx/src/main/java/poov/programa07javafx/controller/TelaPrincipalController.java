package poov.programa07javafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TelaPrincipalController {
    
    @FXML
    private CheckBox acesaCheckBox;

    @FXML
    private ImageView imageView;

    private static Image acesa = new Image(TelaPrincipalController.class.getResourceAsStream("/images/lampada_acesa.png"));
    private static Image apagada = new Image(TelaPrincipalController.class.getResourceAsStream("/images/lampada_apagada.png"));
    
    @FXML
    public void mudou(ActionEvent event) {
        if (acesaCheckBox.isSelected()) {
            imageView.setImage(acesa);
        } else {
            imageView.setImage(apagada);
        }
    }

}
