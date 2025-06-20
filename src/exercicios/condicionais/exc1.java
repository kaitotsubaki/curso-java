package exercicios.condicionais;
import java.util.Scanner;

public class exc1 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if(numero >= 0){
            System.out.println("POSITIVO");
        }else{
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}

