package Atividade01;

/* Escreva um algoritmo para ler uma temperatura em graus Fahrenheit,
calcular e escrever o valor correspondente em graus Celsius.
 Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F */

import java.util.Scanner;

public class exercicioseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        double celsius = (Fahrenheit - 32) * 5/9;
        System.out.println(celsius);
    }
}
