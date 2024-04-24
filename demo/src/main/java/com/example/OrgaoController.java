package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class OrgaoController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
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