module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa01javafx to javafx.fxml, javafx.graphics;
    exports poov.programa01javafx;
}
