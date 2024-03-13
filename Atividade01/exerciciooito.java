package Atividade01;
/* Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). */

import java.util.Scanner;

public class exerciciooito {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("numero: ");
        double num = scanner.nextDouble();
        if (num >= 0){
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
