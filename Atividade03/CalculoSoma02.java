package Atividade03;

public class CalculoSoma02 {
    public static void main(String []args){
        Calculadora f1 = new Calculadora(2,5);
        Calculadora f2 = new Calculadora(3, 7);
        String resultado = f1.soma(f2);
        Calculadora f3 = new Calculadora(3,2)
        System.out.println(resultado);

    }
}


/* f1 = 2/5
 * f2 = 3/7 
 * numerador = 2
 * denominador = 5
 * numeradorSegundoTermo = 3
 * denominadorSegundoTermo = 7
 * numeradorResultante = 29
 * denominadorResultante = 35
 * resultado = 29 / 35
 */