module com.r4ppz {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens controller to javafx.fxml;
    opens model to javafx.fxml;

    exports controller;
    exports model;
}
