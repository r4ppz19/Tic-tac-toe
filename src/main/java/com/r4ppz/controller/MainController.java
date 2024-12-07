package com.r4ppz.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import com.r4ppz.model.MainLogic;
import com.r4ppz.model.PlayerModel;
import com.r4ppz.view.AlertView;

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

    private final PlayerModel playerWrapper = new PlayerModel(1);
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
                    System.out.println("X win\n");
                    new AlertView().playerXWin();
                } else {
                    System.out.print("O win\n");
                    new AlertView().playerOWin();
                }
                MainLogic.resetButtons(buttons);
            } else if (MainLogic.checkDraw(buttons)) {
                new AlertView().draw();
                MainLogic.resetButtons(buttons);
            }
        } catch (IOException e) {
            System.out.println("IO Exception whoo hoo!!!");
        }
    }
}