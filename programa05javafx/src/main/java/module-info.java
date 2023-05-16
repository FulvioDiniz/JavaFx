module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa05javafx to javafx.fxml, javafx.graphics;
    opens poov.programa05javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa05javafx;
}
