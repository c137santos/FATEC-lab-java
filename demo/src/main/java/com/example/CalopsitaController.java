package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.IOException;

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
    private static TextField ResultadoFx;

    @FXML
    private Button meuBotao;

    public static void setResultadoInScene() {
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
    }
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (corFx != null && mutacaoFx != null && idadeFx != null) {
            System.out.println("Tudo preenchido");
            this.sendCalopsita();
        }
    }

}
