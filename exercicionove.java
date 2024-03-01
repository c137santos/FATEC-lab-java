import java.util.Scanner;

public class exercicionove {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("numero de maçãs: ");
        double num = scanner.nextDouble();
        if (num >= 12 ){
            System.out.println("R$" + num*1d);
        } else {
            System.out.println("R$" + num*1.3);
        }
    }
}
