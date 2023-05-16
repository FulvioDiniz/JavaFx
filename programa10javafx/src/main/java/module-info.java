module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa10javafx to javafx.fxml, javafx.graphics;
    opens poov.programa10javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa10javafx;
}
