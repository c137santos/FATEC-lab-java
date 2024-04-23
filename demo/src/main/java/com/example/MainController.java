package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

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
    public void initialize() {
        calopsitasButton.setOnAction(event -> handleCalopsitasButtonClick());
        drogasButton.setOnAction(event -> handleDrogasButtonClick());
        orgaoButton.setOnAction(event -> handleOrgaoButtonClick());
    }

    private void handleCalopsitasButtonClick() {
        // Código para lidar com o clique no botão "Calopsitas"
    }

    private void handleDrogasButtonClick() {
        // Código para lidar com o clique no botão "Drogas"
    }

    private void handleOrgaoButtonClick() {
        // Código para lidar com o clique no botão "Órgão"
    }
}