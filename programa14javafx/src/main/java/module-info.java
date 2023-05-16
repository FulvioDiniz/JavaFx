module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa14javafx to javafx.fxml, javafx.graphics;
    opens poov.programa14javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa14javafx;
}
