module jprestes {
    requires javafx.controls;
    requires javafx.fxml;

    opens jprestes to javafx.fxml;
    exports jprestes;
}
