module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa03javafx to javafx.fxml, javafx.graphics;
    exports poov.programa03javafx;
}
