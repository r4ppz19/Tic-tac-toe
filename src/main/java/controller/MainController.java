package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import model.MainLogic;
import model.PlayerWrapper;

public class MainController {
    public Button oneBtn;
    public Button twoBtn;
    public Button threeBtn;
    public Button fourBtn;
    public Button fiveBtn;
    public Button sixBtn;
    public Button sevenBtn;
    public Button eightBtn;
    public Button nineBtn;

    // Player 1 = X
    // Player 2 = O
    PlayerWrapper playerWrapper = new PlayerWrapper(1);


    public void one(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(oneBtn, playerWrapper);
    }

    public void two(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(twoBtn, playerWrapper);
    }

    public void four(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(fourBtn, playerWrapper);
    }

    public void five(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(fiveBtn, playerWrapper);
    }

    public void seven(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(sevenBtn, playerWrapper);
    }

    public void eight(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(eightBtn, playerWrapper);
    }

    public void three(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(threeBtn, playerWrapper);
    }

    public void six(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(sixBtn, playerWrapper);
    }

    public void nine(ActionEvent actionEvent) {
        MainLogic.switchCharacterBtn(nineBtn, playerWrapper);
    }
}
