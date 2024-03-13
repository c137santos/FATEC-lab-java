package Atividade01;
/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.  */

public class exercicioum {
    public static void main(String[] args) {
        int resultado = calculadorIdadeEmDias(0, 0, 15);
        System.out.println("Idade em dias: " + resultado);
    }
    
    public static int calculadorIdadeEmDias (int anos, int meses, int dias) {
        int anosEmDias = anos * 365;
        int mesesEmDias = meses * 30;
        return anosEmDias + mesesEmDias + dias;
    }
}

