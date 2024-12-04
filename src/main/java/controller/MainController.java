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

    @FXML
    public void handleButtonAction(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getSource();
        MainLogic.switchCharacterBtn(clickedButton, playerWrapper);

        try {
            System.out.println("Checking for a win");
            if (MainLogic.checkWin(buttons)) {
                System.out.println("Someone won");
                if (playerWrapper.getCurrentPlayer() == 2) {
                    System.out.println("X win\n\n");
                    new AlertLoader().playerXWin();
                } else {
                    System.out.print("O win\n\n");
                    new AlertLoader().playerOWin();
                }
                MainLogic.resetButtons(buttons);
            } else if (MainLogic.checkDraw(buttons)) {
                new AlertLoader().draw();
                MainLogic.resetButtons(buttons);
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}