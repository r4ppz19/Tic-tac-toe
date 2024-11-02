package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[]args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/MainView.fxml")));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/css/MainDesign.css")).toExternalForm());
        mainStage.setScene(scene);
        mainStage.show();
    }
}
