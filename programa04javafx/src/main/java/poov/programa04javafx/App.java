package poov.programa04javafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Tela1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Programa 04");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/images/java.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}