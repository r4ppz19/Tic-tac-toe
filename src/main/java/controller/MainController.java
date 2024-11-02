package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

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

    int player = 1;

    public void one(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                oneBtn.setText("X");
                player = 2;
                oneBtn.setDisable(true);
                break;
            case 2:
                oneBtn.setText("O");
                player = 1;
                oneBtn.setDisable(true);
                break;
            default:
                break;
        }
    }

    public void two(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                twoBtn.setText("X");
                player = 2;
                twoBtn.setDisable(true);
                break;
            case 2:
                twoBtn.setText("O");
                player = 1;
                twoBtn.setDisable(true);
                break;
            default:
                break;
        }

    }

    public void four(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                fourBtn.setText("X");
                player = 2;
                fourBtn.setDisable(true);
                break;
            case 2:
                fourBtn.setText("O");
                player = 1;
                fourBtn.setDisable(true);
                break;
            default:
                break;
        }

    }

    public void five(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                fiveBtn.setText("X");
                player = 2;
                fiveBtn.setDisable(true);
                break;
            case 2:
                fiveBtn.setText("O");
                player = 1;
                fiveBtn.setDisable(true);
                break;
            default:
                break;
        }
    }

    public void seven(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                sevenBtn.setText("X");
                player = 2;
                sevenBtn.setDisable(true);
                break;
            case 2:
                sevenBtn.setText("O");
                player = 1;
                sevenBtn.setDisable(true);
                break;
            default:
                break;
        }
    }

    public void eight(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                eightBtn.setText("X");
                player = 2;
                eightBtn.setDisable(true);
                break;
            case 2:
                eightBtn.setText("O");
                player = 1;
                eightBtn.setDisable(true);
                break;
            default:
                break;
        }
    }

    public void three(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                threeBtn.setText("X");
                player = 2;
                threeBtn.setDisable(true);
                break;
            case 2:
                threeBtn.setText("O");
                player = 1;
                threeBtn.setDisable(true);
                break;
            default:
                break;
        }
    }

    public void six(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                sixBtn.setText("X");
                player = 2;
                sixBtn.setDisable(true);
                break;
            case 2:
                sixBtn.setText("O");
                player = 1;
                sixBtn.setDisable(true);
                break;
            default:
                break;
        }
    }

    public void nine(ActionEvent actionEvent) {
        switch (player) {
            case 1:
                nineBtn.setText("X");
                player = 2;
                nineBtn.setDisable(true);
                break;
            case 2:
                nineBtn.setText("O");
                player = 1;
                nineBtn.setDisable(true);
                break;
            default:
                break;
        }
    }
}
