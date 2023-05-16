module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa06javafx to javafx.fxml, javafx.graphics;
    opens poov.programa06javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa06javafx;
}
