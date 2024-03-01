
/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
por mês, mais uma comissão também fixa para cada carro vendido e
 mais 5% do valor das vendas por ele efetuadas.
Escrever um algoritmo que leia o número de carros por ele vendidos,
o valor total de suas vendas, o salário fixo e o valor que ele
recebe por carro vendido. Calcule e escreva o salário final do vendedor.*/
import java.util.Scanner;

public class exerciciocinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("salário fixo: ");
        double salario_fixo = scanner.nextDouble();
        System.out.print("valor total de vendas: ");
        double valor_vendas = scanner.nextDouble();
        System.out.print("Quantidade de carros vendidos: ");
        double qtd_carros = scanner.nextDouble();
        System.out.print("porcentagem por carro vendido: ");
        double vlr_por_carro = scanner.nextDouble();
        double comissao_carro = qtd_carros * (vlr_por_carro/100);
        double comissao_venda = valor_vendas * (5d/100);
        double salario = salario_fixo + comissao_carro + comissao_venda;
        System.out.println(comissao_carro);
        System.out.println(comissao_venda);
        System.out.println("O salario é: " + salario);
    }
}
