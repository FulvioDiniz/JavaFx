module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa07javafx to javafx.fxml, javafx.graphics;
    opens poov.programa07javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa07javafx;
}
