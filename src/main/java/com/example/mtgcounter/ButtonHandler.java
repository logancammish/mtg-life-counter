package com.example.mtgcounter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ButtonHandler {
    @FXML
    private Label leftHealth;
    @FXML
    private Label rightHealth;

    private void increaseLeft(int change) {
        int leftHealthValue = AppState.getInstance().get("leftHealth") != null ?
                (int) AppState.getInstance().get("leftHealth") : 20;
        int newLeftHealthValue = leftHealthValue + change;
        AppState.getInstance().set("leftHealth", newLeftHealthValue);
        leftHealth.setText(Integer.toString(newLeftHealthValue));
    }

    @FXML
    protected void onLeftButtonClickIncreaseOne() {
        increaseLeft(1);
    }

    @FXML
    protected void onLeftButtonClickIncreaseFive() {
        increaseLeft(5);
    }
}