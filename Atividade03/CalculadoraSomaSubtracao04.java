package Atividade03;

public class CalculadoraSomaSubtracao04 {

    public static void main(String[] args) {
        Calculadora f1 = new Calculadora(2,1);
        Calculadora f2 = new Calculadora(1,3);
        String resultado_soma = f1.soma(f2);
        System.out.println(resultado_soma);
        int meio = resultado_soma.length() /2;
        Calculadora f3 = new Calculadora(Integer.parseInt(resultado_soma.substring(0, meio)), Integer.parseInt(resultado_soma.substring(meio+1)));
        Calculadora f4 = new Calculadora(5, 4);
        String resultado_final = f3.subtracao(f4);
        System.out.println(resultado_final);
    }
}
