package poov.programa06javafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/TelaPrincipal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Programa 06");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/images/java.png")));
        
        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        });

        stage.show();
    }

    public void logout(Stage stage) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Você está prestes a sair do programa.");
        alert.setContentText("Deseja realmente sair?");

        if (alert.showAndWait().get() == ButtonType.OK)  {
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}