package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
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
        System.out.println("Tudo preenchido");
    }
    @FXML
    private void handleDrogasButtonClick(ActionEvent event) {
        System.out.println("Tudo preenchido");
    }
    @FXML
    private void handleOrgaoButtonClick(ActionEvent event) {
        System.out.println("Tudo preenchido");
    }
}