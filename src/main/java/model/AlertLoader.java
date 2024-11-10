package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AlertLoader {

    public void showAlert() throws IOException {
        Image imageIcon = new Image("/images/r4ppz icon.png");

        Stage alertStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/AlertView.fxml")));
        Scene scene = new Scene(root);
        alertStage.setScene(scene);
        alertStage.setTitle("Nice Game :)");
        alertStage.getIcons().add(imageIcon);
        alertStage.show();
    }
}
