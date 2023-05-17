package com.example.farm2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    Animal cow = new Animal("Gow Matta", 34.4,23.4,7);
    @FXML
    private Label welcomeText;
    public Button sampleButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(cow.printAnimal());
    }
}