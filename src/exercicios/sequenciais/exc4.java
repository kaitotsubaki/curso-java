package exercicios.sequenciais;
import java.util.Scanner;

public class exc4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        double value;
        int number, hours;
        number = sc.nextInt();
        hours = sc.nextInt();
        value = sc.nextDouble();

        double salary = hours * value;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = %.2f%n", salary);



        sc.close();
    }
}
