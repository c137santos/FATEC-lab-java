public class lp1 {
    public static void main(String []args){
        double P1 = 10;
        double E1 = 10;
        double E2 = 10;
        double API = 10;
        double X = 0;
        double SUB = 0;
        double primeiroResultado = primeiroParametro(P1, E1, E2);
        System.out.println(primeiroResultado);
        double segundoResultado = segundoParametro(API, P1, E1, E2);
        System.out.println(segundoResultado);
        double terceiroResultado = terceiroParametro(API, X, SUB);
        System.out.println(terceiroResultado);
        System.out.println(primeiroResultado + segundoResultado * terceiroResultado);
    }

    public static double primeiroParametro(double P1, double E1, double E2){
        double resultado = (P1*0.6+((E1+E2)/2)*0.4) * 0.5;
        return resultado;
    }

    public static double segundoParametro(double API, double P1, double E1, double E2){
        double expoente = Math.max(((P1*0.6+((E1+E2)/2) *0.4)-5.9), 0);
        double denominador = ((P1*0.6+((E1+E2)/2)*0.4)-5.9);
        double resultado = expoente/denominador;
        return resultado;
    };

    public static double terceiroParametro(double API, double X, double SUB){
        double resultado = (API*0.5)+X+ (SUB*0.2);
        return resultado;
    }
}