module com.r4ppz {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.r4ppz.controller to javafx.fxml;
    opens com.r4ppz.view to javafx.fxml;

    exports com.r4ppz;
}