package com.example;

public class img05droga {
    private String nome;
    private Double posologia;
    private boolean legalizada;

    public void createDroga(String nome, Double posologia, boolean legalizada) {
        this.nome = nome;
        this.posologia = posologia;
        this.legalizada = legalizada;
    }

    public double overdosar() {
        double posologiaMultiplicada = posologia * 3;
        return this.posologia = posologiaMultiplicada;
    };

    public void usar() {
        System.out.println("Você está usando a droga " + this.nome);
    };

    public boolean legalizar() {
        this.legalizada = !this.legalizada;;
        return this.legalizada;
    }
    
}

