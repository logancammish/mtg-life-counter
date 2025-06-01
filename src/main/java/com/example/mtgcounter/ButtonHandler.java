package com.example.mtgcounter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class ButtonHandler {
    @FXML
    private Label leftHealth;
    @FXML
    private Label rightHealth;

    protected void increase(int change, boolean isLeft, boolean reset) {
        // Reset life to 20 if reset is true
        if (reset) {
            if (isLeft) {
                AppState.getInstance().set("leftHealth", 20);
                leftHealth.setText("20");
            } else {
                AppState.getInstance().set("rightHealth", 20);
                rightHealth.setText("20");
            }
            return;
        }
        // Adjust life total based on the change value
        if (isLeft) {
            int leftHealthValue = AppState.getInstance().get("leftHealth") != null ?
                    (int) AppState.getInstance().get("leftHealth") : 20;
            int newLeftHealthValue = leftHealthValue + change;
            AppState.getInstance().set("leftHealth", newLeftHealthValue);
            leftHealth.setText(Integer.toString(newLeftHealthValue));
        } else {
            int rightHealthValue = AppState.getInstance().get("rightHealth") != null ?
                    (int) AppState.getInstance().get("rightHealth") : 20;
            int newRightHealthValue = rightHealthValue + change;
            AppState.getInstance().set("rightHealth", newRightHealthValue);
            rightHealth.setText(Integer.toString(newRightHealthValue));
        }
    }

    @FXML
    protected void onLifeButtonClick(javafx.event.ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String[] data = clickedButton.getUserData().toString().split(",");
        int change = Integer.parseInt(data[0]);
        boolean isLeft = data[1].equals("left");
        increase(change, isLeft, (change == 1337));
    }
}