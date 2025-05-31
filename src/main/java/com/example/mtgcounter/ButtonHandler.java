package com.example.mtgcounter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ButtonHandler {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}