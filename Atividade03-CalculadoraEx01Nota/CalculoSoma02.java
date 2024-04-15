package Atividade03;

public class CalculoSoma02 {
    public static void main(String []args){
        Calculadora f1 = new Calculadora(4,3);
        Calculadora f2 = new Calculadora(2, 5);
        String resultado = f1.soma(f2);
        System.out.println(resultado);
        int meio = resultado.length() / 2;
        Calculadora f3 = new Calculadora(Integer.parseInt(resultado.substring(0, meio)), Integer.parseInt(resultado.substring(meio+1)));
        Calculadora f4 = new Calculadora(3, 2);
        String resultado_final = f4.soma(f3);
        System.out.println(resultado_final);

    };
}
