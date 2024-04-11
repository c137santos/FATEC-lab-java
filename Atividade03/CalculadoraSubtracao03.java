package Atividade03;

public class CalculadoraSubtracao03 {

    public static void main(String []args){
        Calculadora f1 = new Calculadora(10,3);
        Calculadora f2 = new Calculadora(4, 3);
        String resultado = f1.subtracao(f2);
        System.out.println(resultado);
    };
}