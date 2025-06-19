package section4;
import java.util.Scanner;

public class exc5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double valor1, valor2;
        int num1, num2;
        sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();

        sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        double valortotal = (num1 * valor1) + (num2 * valor2);

        System.out.printf("VALOR A PAGAR: %.2f%n", valortotal);





        sc.close();
    }
}
