package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class DrogaController {

    @FXML
    private TextField nomeFx;

    @FXML
    private TextField posologiaFx;

    @FXML
    private TextField legalizacaoFx;

    @FXML
    private Button botaoOver;

    @FXML
    private Button botaoUser;

    @FXML
    private Button botaoLegal;

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

    @FXML
    public void botaoOver(ActionEvent event) {
        try {
            App.setRoot("main_screen");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void botaoUser(ActionEvent event) {
        try {
            App.setRoot("main_screen");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void botaoLegal(ActionEvent event) {
        try {
            App.setRoot("main_screen");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        botaoOver.setVisible(false);
        botaoUser.setVisible(false);
        botaoLegal.setVisible(false);
        // tCampoResp.setVisible(false);
    }

    public void sendDroga(){
        String nome = nomeFx.getText();
        Double posologia = Double.parseDouble(posologiaFx.getText());
        boolean legalizada = Boolean.parseBoolean(legalizacaoFx.getText());

        img05droga droga = new img05droga();
        droga.createDroga(nome, posologia, legalizada);
        botaoOver.setVisible(true);
        botaoUser.setVisible(true);
        botaoLegal.setVisible(true);
        // tCampoResp.setVisible(true);
        // tCampoResp.setText(calopsita.toString());

    }

    @FXML
    public void handleButtonDroga(ActionEvent event) {
        if (nomeFx.getText() != null && posologiaFx.getText() != null && legalizacaoFx != null) {
            System.out.println("Preencha todos os campos");
            this.sendDroga();
        }
    }
}
