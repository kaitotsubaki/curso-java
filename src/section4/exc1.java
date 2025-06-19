package section4;
import java.util.Scanner;

public class exc1 {
    public static void main (String [] args){

        /* Exercícios sobre Estrutura Sequencial (entrada, processamento, saída) */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
