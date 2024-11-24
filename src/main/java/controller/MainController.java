package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.AlertLoader;
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

    private final PlayerWrapper playerWrapper = new PlayerWrapper(1);
    private Button[] buttons;

    public void initialize() {
        buttons = new Button[]{oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn};
    }

    public void handleButtonAction(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getSource();
        MainLogic.switchCharacterBtn(clickedButton, playerWrapper);

        try {
            System.out.println("Checking for a win");
            if (MainLogic.checkWin(buttons)) {
                System.out.println("Someone won");
                if (playerWrapper.getCurrentPlayer() == 2) {
                    System.out.println("X win");
                    new AlertLoader().playerXWin();
                } else {
                    System.out.printf("O win");
                    new AlertLoader().playerOWin();
                }
                MainLogic.resetButtons(buttons);
            } else if (MainLogic.checkDraw(buttons)) {
                new AlertLoader().draw();
                MainLogic.resetButtons(buttons);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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