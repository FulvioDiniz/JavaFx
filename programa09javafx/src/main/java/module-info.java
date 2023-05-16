module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa09javafx to javafx.fxml, javafx.graphics;
    opens poov.programa09javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa09javafx;
}
