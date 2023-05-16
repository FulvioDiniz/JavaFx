module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa13javafx to javafx.fxml, javafx.graphics;
    opens poov.programa13javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa13javafx;
}
