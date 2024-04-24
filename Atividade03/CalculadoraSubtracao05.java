package Atividade03;

public class CalculadoraSubtracao05 {
    public static void main(String []args){
        Calculadora f1 = new Calculadora(4,3);
        Calculadora f2 = new Calculadora(2, 7);
        String resultado = f1.subtracao(f2);
        System.out.println(resultado);
    };
}
