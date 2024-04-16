package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalopsitaController {

    ObservableList<String> calopsitas = FXCollections.observableArrayList();

    @FXML
    private TextField corFx;
    private TextField mutacaofx;
    private TextField idadeFx;


    public void sendCalopsita() {
        String cor = corFx.getText();
        calopsitas.add(cor);
    }

    public

    
}
