package exercicios.condicionais;
import java.util.Scanner;

public class exc2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }


        sc.close();
    }
}
