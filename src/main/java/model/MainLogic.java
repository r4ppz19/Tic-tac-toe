package model;

import javafx.scene.control.Button;

public class MainLogic {
    int one;
    int two;
    int three;
    int four;
    int five;
    int six;
    int seven;
    int eight;
    int nine;


    public static void switchCharacterBtn(Button button, PlayerWrapper player) {
        switch (PlayerWrapper.value) {
            case 1:
                button.setText("X");
                button.setDisable(true);
                PlayerWrapper.value = 2;
                break;
            case 2:
                button.setText("O");
                button.setDisable(true);
                PlayerWrapper.value = 1;
                break;
            default:
                break;
        }
    }
}
