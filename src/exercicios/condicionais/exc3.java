package exercicios.condicionais;
import java.util.Scanner;

public class exc3 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int A = sc.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        int B = sc.nextInt();

        if( A % B == 0 || B % A == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

    }
}
