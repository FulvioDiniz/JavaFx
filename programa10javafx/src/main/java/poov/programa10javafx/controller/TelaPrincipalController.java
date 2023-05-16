package poov.programa10javafx.controller;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.util.StringConverter;
import poov.programa10javafx.modelo.Vacina;

public class TelaPrincipalController {

    @FXML
    private ChoiceBox<Vacina> meuChoiceBox;

    @FXML
    private Label meuLabel;

    public void initialize() {
        meuChoiceBox.setConverter(new StringConverter<Vacina>() {

            @Override
            public String toString(Vacina object) {
                return object.getNome();
            }

            @Override
            public Vacina fromString(String string) {
                List<Vacina> vacinas = meuChoiceBox.getItems();
                for (Vacina vacina : vacinas) {
                    if (vacina.getNome().equals(string)) {
                        return vacina;
                    }
                }
                return null;
            }
        });

        List<Vacina> vacinas = new ArrayList<>();
        Vacina vacina = new Vacina(1L, "Pfizer", "Vacina doida 1");
        vacinas.add(vacina);
        vacina = new Vacina(2L, "Moderna", "Vacina doida 2");
        vacinas.add(vacina);
        vacina = new Vacina(3L, "AstraZeneca", "Vacina doida 3");
        vacinas.add(vacina);
        meuChoiceBox.getItems().addAll(vacinas);
        meuChoiceBox.setValue(vacinas.get(0));

        meuChoiceBox.setOnAction(this::getSelecao);
    }

    public void getSelecao(ActionEvent event) {
        Vacina vacina = meuChoiceBox.getValue();
        meuLabel.setText(vacina.getNome());
    }
}

