package Atividade03;

public class CalculadoraMultiplicacao {
    public static void main(String[] args) {
        Calculadora f1 = new Calculadora(4,3);
        Calculadora f2 = new Calculadora(2,5);
        String resultado_subtracao = f1.subtracao(f2);
        System.out.println(resultado_subtracao);
        int meio = resultado_subtracao.length() /2;
        Calculadora f3 = new Calculadora(Integer.parseInt(resultado_subtracao.substring(0, meio)), Integer.parseInt(resultado_subtracao.substring(meio+1)));
        Calculadora f4 = new Calculadora(5, 2);
        String resultado_final = f3.multiplicacao(f4);
        System.out.println(resultado_final);
    }
}
