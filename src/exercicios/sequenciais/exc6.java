package exercicios.sequenciais;
import java.util.Scanner;

public class exc6 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double tri, cir, tra, qua, ret;

        tri = (A * C )/2;
        cir = 3.14159 * (C * C);
        tra = ((A + B) * C )/2;
        qua = B * B;
        ret = A * B;

        System.out.printf("TRIANGULO: %.3f%n", tri);
            System.out.printf("CIRCULO: %.3f%n", cir);
        System.out.printf("TRAPEZIO: %.3f%n", tra);
        System.out.printf("QUADRADO: %.3f%n", qua);
        System.out.printf("RETANGULO: %.3f%n", ret);

        sc.close();
    }
}
