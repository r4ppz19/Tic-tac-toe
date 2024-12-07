package com.r4ppz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        // Load the application icon
        Image imageIcon = new Image(Objects.requireNonNull(getClass().getResource("/image/r4ppzIcon.png")).toExternalForm());

        // Load the FXML layout for the main view
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/MainView.fxml")));

        // Create a scene with the loaded layout
        Scene scene = new Scene(root);

        // Load and apply CSS styles to the scene
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/css/SecondDesign.css")).toExternalForm());

        // Set the application icon and scene to the main stage
        mainStage.getIcons().add(imageIcon);
        mainStage.setTitle("r4ppz");
        mainStage.setScene(scene);
        mainStage.setResizable(false);
        mainStage.show(); // Display the main stage
    }
}
