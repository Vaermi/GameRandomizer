package com.vaermi.gamerandomizer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GameRandomizerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Vaermis Application!");
    }
}