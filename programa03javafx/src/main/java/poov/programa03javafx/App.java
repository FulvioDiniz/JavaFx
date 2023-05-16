package poov.programa03javafx;

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
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Tela.fxml"));
        Scene scene = new Scene(root);
        String css = getClass().getResource("/css/application.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Programa 03");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/images/java.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}