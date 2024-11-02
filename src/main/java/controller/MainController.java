package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.MainLogic;
import model.PlayerWrapper;

public class MainController {
    @FXML
    public Button oneBtn;
    @FXML
    public Button twoBtn;
    @FXML
    public Button threeBtn;
    @FXML
    public Button fourBtn;
    @FXML
    public Button fiveBtn;
    @FXML
    public Button sixBtn;
    @FXML
    public Button sevenBtn;
    @FXML
    public Button eightBtn;
    @FXML
    public Button nineBtn;

    private PlayerWrapper playerWrapper = new PlayerWrapper(1);
    private Button[] buttons;

    public void initialize() {
        buttons = new Button[]{oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn};
    }

    public void handleButtonAction(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getSource();
        MainLogic.switchCharacterBtn(clickedButton, playerWrapper);

        if (MainLogic.checkWin(buttons)) {
            showAlert("Player " + (playerWrapper.getCurrentPlayer() == 1 ? "O" : "X") + " wins!");
            MainLogic.resetButtons(buttons);
        } else if (MainLogic.checkDraw(buttons)) {
            showAlert("It's a draw!");
            MainLogic.resetButtons(buttons);
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void one(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
    @FXML
    public void two(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
    @FXML
    public void three(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
    @FXML
    public void four(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
    @FXML
    public void five(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
    @FXML
    public void six(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
    @FXML
    public void seven(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
    @FXML
    public void eight(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
    @FXML
    public void nine(ActionEvent actionEvent) { handleButtonAction(actionEvent); }
}