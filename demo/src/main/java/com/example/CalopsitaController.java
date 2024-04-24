package com.example;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.scene.Scene;

public class CalopsitaController {

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
    private Text tCantando;

    @FXML
    public void setResultadoInScene(String cor, String mutacao, String idade) {
        try {
            App.setRoot("instancia_calopsita");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void initialize() {
        tCantando.setVisible(false);
    }

    public void sendCalopsita() {
        String cor = corFx.getText();
        String mutacao = mutacaoFx.getText();
        String idade = idadeFx.getText();
        Img01calopsita calopsita = new Img01calopsita();
        calopsita.createCalopsita(cor, mutacao, idade);
        String cantando = calopsita.cantar();
        tCantando.setText(cantando);
        tCantando.setVisible(true);
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
