package com.r4ppz.model;

import javafx.scene.control.Button;

public class MainLogic {
    private static final String PLAYER_X = "X";
    private static final String PLAYER_O = "O";

    public static void switchCharacterBtn(Button button, PlayerModel playerWrapper) {
        if (button.getText().isEmpty()) {
            if (playerWrapper.getCurrentPlayer() == 1) {
                button.setText(PLAYER_X);
                playerWrapper.setCurrentPlayer(2);
            } else {
                button.setText(PLAYER_O);
                playerWrapper.setCurrentPlayer(1);
            }
        }
    }

    public static boolean checkWin(Button[] buttons) {
        // Check rows, columns, and diagonals for a win
        return (checkLine(buttons[0], buttons[1], buttons[2]) ||
                checkLine(buttons[3], buttons[4], buttons[5]) ||
                checkLine(buttons[6], buttons[7], buttons[8]) ||
                checkLine(buttons[0], buttons[3], buttons[6]) ||
                checkLine(buttons[1], buttons[4], buttons[7]) ||
                checkLine(buttons[2], buttons[5], buttons[8]) ||
                checkLine(buttons[0], buttons[4], buttons[8]) ||
                checkLine(buttons[2], buttons[4], buttons[6]));
    }

    private static boolean checkLine(Button b1, Button b2, Button b3) {
        // Check if the first button is not empty
        boolean isFirstButtonNotEmpty = !b1.getText().isEmpty();
        
        // Check if the text of the first button is equal to the text of the second button
        boolean isFirstEqualToSecond = b1.getText().equals(b2.getText());
        
        // Check if the text of the second button is equal to the text of the third button
        boolean isSecondEqualToThird = b2.getText().equals(b3.getText());
        
        // Return true if all conditions are met, otherwise return false
        return isFirstButtonNotEmpty && isFirstEqualToSecond && isSecondEqualToThird;
    }

    public static boolean checkDraw(Button[] buttons) {
        for (Button button : buttons) {
            if (button.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static void resetButtons(Button[] buttons) {
        for (Button button : buttons) {
            button.setText("");
        }
    }
}