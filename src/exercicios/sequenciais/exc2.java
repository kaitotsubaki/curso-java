package exercicios.sequenciais;
import java.util.Scanner;

public class exc2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double potencia = 2;
        double pi = 3.14159;
        double raio_q = Math.pow(raio,potencia);

        double area = pi * raio_q;

        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}
