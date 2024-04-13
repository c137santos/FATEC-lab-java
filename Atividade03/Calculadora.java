package Atividade03;

public class Calculadora {

    private int numerador;
    private int denominador;
    private int numeradorResultante;
    private int denominadorResultante;

    public Calculadora(int numeradorPrimeiroTermo, int denominadorSegundoTermo) {
        this.numerador = numeradorPrimeiroTermo;
        this.denominador = denominadorSegundoTermo;
    }

    public String soma(Calculadora segundaFracao){
        int numeradorSegundoTermo = segundaFracao.numerador;
        int denominadorSegundoTermo = segundaFracao.denominador;

        if (denominador == denominadorSegundoTermo){
            numeradorResultante = numerador + numeradorSegundoTermo;
            denominadorResultante = denominador;
        } else {
            numeradorResultante = (numerador * denominadorSegundoTermo) + (numeradorSegundoTermo * denominador);
            denominadorResultante = denominador * denominadorSegundoTermo;
        }
        return numeradorResultante + "/" + denominadorResultante;
    }

    public String subtracao(Calculadora segundaFracao){
        int numeradorSegundoTermo = segundaFracao.numerador;
        int denominadorSegundoTermo = segundaFracao.denominador;
        
        if (denominador == denominadorSegundoTermo) {
            return (numerador - numeradorSegundoTermo)  + "/" + denominador;
        }
        
        
        int mmc;


        if (denominador > denominadorSegundoTermo) {
            mmc = denominador;
        } else {
            mmc = denominadorSegundoTermo;
        }

        while ((mmc % denominador) != 0 || (mmc % denominadorSegundoTermo != 0)) {
            mmc++;
        }
        return (numerador * denominadorSegundoTermo) - (numeradorSegundoTermo * denominador) + "/" + mmc;

    }

    public String multiplicacao(Calculadora segundaFracao){
        int numeradorSegundoTermo = segundaFracao.numerador;
        int denominadorSegundoTermo = segundaFracao.denominador;

        return numerador*numeradorSegundoTermo + " / " + denominador*denominadorSegundoTermo;
    }

    public String divisao(Calculadora segundaFracao){
        int numeradorSegundoTermo = segundaFracao.numerador;
        int denominadorSegundoTermo = segundaFracao.denominador;
        return numerador * denominadorSegundoTermo + " / " + numeradorSegundoTermo * denominador;
    }

};