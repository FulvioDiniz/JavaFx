module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa08Ajavafx to javafx.fxml, javafx.graphics;
    opens poov.programa08Ajavafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa08Ajavafx;
}
