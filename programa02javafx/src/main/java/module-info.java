module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa02javafx to javafx.fxml, javafx.graphics;
    opens poov.programa02javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa02javafx;
}
