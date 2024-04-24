package com.example;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.scene.Scene;

public class CalopsitaController {

    private static Scene scene;

    private Img01calopsita calopsita = new Img01calopsita();

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
    private Button botaoCantar;

    @FXML
    private Button botaoVoar;

    @FXML
    private Button botaoTemp;

    @FXML
    private Text tCampoResp;

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
        tCampoResp.setVisible(false);
        botaoVoar.setVisible(false);
        botaoCantar.setVisible(false);
        botaoTemp.setVisible(false);
    }

    public void sendCalopsita() {
        String cor = corFx.getText();
        String mutacao = mutacaoFx.getText();
        String idade = idadeFx.getText();
        calopsita.createCalopsita(cor, mutacao, idade);
        tCampoResp.setText(calopsita.toString());
        tCampoResp.setVisible(true);
        botaoVoar.setVisible(true);
        botaoCantar.setVisible(true);
        botaoTemp.setVisible(true);
    }
    
    @FXML
    public void botaoCantar(ActionEvent event) {
        String cantando = calopsita.cantar();
        tCampoResp.setText(calopsita.getMutacao() + cantando);
    }

    @FXML
    public void botaoVoar(ActionEvent event) {
        String cor = calopsita.getVoo();
        tCampoResp.setText("Calopsita "+ cor + " no céu");
    }

    @FXML
    public void botaoTemp(ActionEvent event) {
        String idade = calopsita.getIdade();
        tCampoResp.setText("com "+ idade +" anos. Ela é braba");
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
