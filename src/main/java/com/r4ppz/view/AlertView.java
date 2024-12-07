package com.r4ppz.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AlertView {
    Image imageIcon = new Image(Objects.requireNonNull(getClass().getResource("/image/r4ppzIcon.png")).toExternalForm());

    // Player O win window pop up
    public void playerOWin() throws IOException {
        Stage alertStage1 = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/PlayerOWin.fxml")));
        Scene scene = new Scene(root);
        alertStage1.setScene(scene);
        alertStage1.setTitle(":o");
        alertStage1.setResizable(false);
        alertStage1.getIcons().add(imageIcon);
        alertStage1.initModality(Modality.APPLICATION_MODAL);
        alertStage1.showAndWait();
    }

    // Player X win window pop up
    public void playerXWin() throws IOException {
        Stage alertStage2 = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/PlayerXWin.fxml")));
        Scene scene = new Scene(root);
        alertStage2.setScene(scene);
        alertStage2.setTitle(":o");
        alertStage2.setResizable(false);
        alertStage2.getIcons().add(imageIcon);
        alertStage2.initModality(Modality.APPLICATION_MODAL);
        alertStage2.showAndWait();
    }

    // Draw window pop up
    public void draw() throws IOException {
        Stage alertStage3 = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/DrawView.fxml")));
        Scene scene = new Scene(root);
        alertStage3.setScene(scene);
        alertStage3.setTitle(":o");
        alertStage3.setResizable(false);
        alertStage3.getIcons().add(imageIcon);
        alertStage3.initModality(Modality.APPLICATION_MODAL);
        alertStage3.showAndWait();
    }
}
