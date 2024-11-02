package model;

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
        Image imageIcon = new Image("/images/r4ppz icon.png");

        // Load the FXML layout for the main view
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/MainView.fxml")));

        // Create a scene with the loaded layout
        Scene scene = new Scene(root);

        // Load and apply CSS styles to the scene
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/css/MainDesign.css")).toExternalForm());

        // Set the application icon and scene to the main stage
        mainStage.getIcons().add(imageIcon);
        mainStage.setScene(scene);
        mainStage.show(); // Display the main stage
    }
}
