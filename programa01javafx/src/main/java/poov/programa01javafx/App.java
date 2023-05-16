package poov.programa01javafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        
        Scene scene = new Scene(root, Color.BLACK);
        
        // Image icon = new Image(App.class.getClassLoader().getResourceAsStream("java.png"));
        Image icon = new Image("java.png");
        stage.getIcons().add(icon);

        stage.setTitle("Primeiro Programa JavaFX");
        stage.setWidth(400);
        stage.setHeight(400);
        stage.setResizable(false);
        // stage.setX(50);
        // stage.setY(50);
        
        // stage.setFullScreen(true);
        // stage.setFullScreenExitHint("Pressione q para sair da tela cheia");
        // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}