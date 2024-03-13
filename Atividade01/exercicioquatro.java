package Atividade01;
/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
 do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler
 o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. */
import java.util.Scanner;
public class exercicioquatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("custo de fabrica: ");
        double custo_fabrica = scanner.nextDouble();
        double porcentagem_distribuidor = custo_fabrica * (28d / 100);
        double porcentagem_impostos = custo_fabrica * (45d / 100);
        double custo_final = custo_fabrica + porcentagem_distribuidor + porcentagem_impostos;
        System.out.println(porcentagem_distribuidor);
        System.out.println(porcentagem_impostos);
        System.out.println("custo final é: " + custo_final);
    }
}