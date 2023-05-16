module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa08Bjavafx to javafx.fxml, javafx.graphics;
    opens poov.programa08Bjavafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa08Bjavafx;
}
