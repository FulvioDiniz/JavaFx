package poov.programa04javafx.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

    public SceneController() {
        System.out.println("SceneController criado");
    }

    public void irParaTela1(ActionEvent event) throws IOException {
        mostrarNovaScene(event, "/fxml/Tela1.fxml");
    }

    public void irParaTela2(ActionEvent event) throws IOException {
        mostrarNovaScene(event, "/fxml/Tela2.fxml");
    }

    private void mostrarNovaScene(ActionEvent event, String sceneFile) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource(sceneFile));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
