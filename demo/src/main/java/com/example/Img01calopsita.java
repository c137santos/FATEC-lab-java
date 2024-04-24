package com.example;

public class Img01calopsita {
    private String idade;
    private String cor;
    private String mutacao;

    public void createCalopsita(String cor, String mutacao, String idade) {
        this.cor = cor;
        this.mutacao = mutacao;
        this.idade = idade;
    }

    public String getMutacao() {
        return this.mutacao;
    }
    public String cantar() {
        return ", a calopsita, tá cantando!";
    }

    public boolean voar() {
        // Implementação do método voar
        return true;
    }

    public String tipo_racao() {
        // Implementação do método tipo_racao
        return "Ração especial para calopsitas";
    }
}