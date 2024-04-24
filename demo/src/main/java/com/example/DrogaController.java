package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class DrogaController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    public void handleButtonActionVoltar(ActionEvent event) {
        try {
            App.setRoot("main_screen");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
