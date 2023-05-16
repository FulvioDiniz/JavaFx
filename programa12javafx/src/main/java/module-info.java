module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa12javafx to javafx.fxml, javafx.graphics;
    opens poov.programa12javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa12javafx;
}
