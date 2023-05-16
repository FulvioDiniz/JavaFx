package poov.programa12javafx.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class TelaPrincipalController {

    @FXML
    private Label meuLabel;

    @FXML
    private ListView<String> minhaListView;

    private static String comidas[] = { "Pizza", "Pastel", "Hamburguer" };

    private String comidaAtual;

    public void initialize() {
        minhaListView.getItems().addAll(comidas);

        minhaListView.getSelectionModel()
            .selectedItemProperty()
            .addListener(new ChangeListener<String>() {

                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    comidaAtual = newValue;
                    meuLabel.setText(comidaAtual);
                }
            
        });
    }

}

