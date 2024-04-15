package Atividade03;

public class CalculoSoma01 {
    public static void main(String []args){
        Calculadora f1 = new Calculadora(2,5);
        Calculadora f2 = new Calculadora(3, 7);
        String resultado = f1.soma(f2);
        System.out.println(resultado);

    }
}
