package poov.programa09javafx.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.util.StringConverter;

public class TelaPrincipalController {

    @FXML
    private Label dataLabel;

    @FXML
    private DatePicker datePicker;

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @FXML
    void obterData(ActionEvent event) {
        LocalDate data = datePicker.getValue();
        dataLabel.setText(dateFormatter.format(data));
    }

    public void initialize() {
        datePicker.setConverter(
                new StringConverter<>() {
                    @Override
                    public String toString(LocalDate date) {
                        return (date != null) ? dateFormatter.format(date) : "";
                    }

                    @Override
                    public LocalDate fromString(String string) {
                        return (string != null && !string.isEmpty())
                                ? LocalDate.parse(string, dateFormatter)
                                : null;
                    }
                });
    }

}
