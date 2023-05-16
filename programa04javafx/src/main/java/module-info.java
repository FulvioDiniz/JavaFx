module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.programa04javafx to javafx.fxml, javafx.graphics;
    opens poov.programa04javafx.controller to javafx.fxml, javafx.graphics;
    exports poov.programa04javafx;
}
