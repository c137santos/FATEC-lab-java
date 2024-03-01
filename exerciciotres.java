/* Escreva um algoritmo para ler o salário mensal atual
  de um funcionário e o percentual de reajuste.
  Calcular e escrever o valor do novo salário. */
import java.util.Scanner;
public class exerciciotres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("salario mensal atual: ");
        double salario = scanner.nextInt();
        System.out.print("reajuste: ");
        double reajuste_porcentagem = scanner.nextInt();
        double valorAumento = salario * (reajuste_porcentagem / 100);
        double novoSalario = salario + valorAumento;
        System.out.println("O novo salario será: " + novoSalario);
    }
}
