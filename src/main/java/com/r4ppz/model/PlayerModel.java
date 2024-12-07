package com.r4ppz.model;

public class PlayerModel {
    private int currentPlayer;

    public PlayerModel(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}