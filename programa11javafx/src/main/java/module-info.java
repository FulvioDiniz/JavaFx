module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa11javafx to javafx.fxml, javafx.graphics;
    opens poov.programa11javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa11javafx;
}
