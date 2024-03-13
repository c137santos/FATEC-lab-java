package Atividade01;
import java.util.Scanner;

public class exerciciodez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nota1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("nota2: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println(media);
        if (media >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
