package com.example;


import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.scene.Scene;

public class CalopsitaController {

    ObservableList<String> calopsitas = FXCollections.observableArrayList();

    private static Scene scene;

    @FXML
    private TextField corFx;

    @FXML
    private TextField mutacaoFx;

    @FXML
    private TextField idadeFx;

    @FXML
    private Text ResultadoFx;

    @FXML
    private Button meuBotao;

    @FXML
    public void setResultadoInScene() {
        ResultadoFx.setText("Calopsita cadastrada com sucesso!");
    }

    public void sendCalopsita() {
        String cor = corFx.getText();
        calopsitas.add(cor);
        String mutacao = mutacaoFx.getText();
        calopsitas.add(mutacao);
        String idade = idadeFx.getText();
        calopsitas.add(idade);
        System.err.println(calopsitas);

        this.setResultadoInScene();
    }
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        System.out.println(corFx);
        System.out.println(mutacaoFx);
        System.out.println(idadeFx);
        if (corFx != null && mutacaoFx != null && idadeFx != null) {
            System.out.println("Tudo preenchido");
            this.sendCalopsita();
        }
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
