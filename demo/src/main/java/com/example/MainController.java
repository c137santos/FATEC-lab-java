package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;

import javafx.event.ActionEvent;

public class MainController {

    @FXML
    private Button calopsitasButton;

    @FXML
    private Button drogasButton;

    @FXML
    private Button orgaoButton;

    @FXML
    private Text text;

    @FXML
    private void handleCalopsitasButtonClick(ActionEvent event) {
        try {
            App.setRoot("calopsita");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void handleDrogasButtonClick(ActionEvent event) {
        try {
            App.setRoot("droga");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleOrgaoButtonClick(ActionEvent event) {
        try {
            App.setRoot("orgao");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}