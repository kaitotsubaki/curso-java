package exercicios.repetitivas;
import java.util.Scanner;

public class exc1w {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha de quatro dígitos: ");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha inválida.");
            System.out.print("Digite novamente: ");
            senha = sc.nextInt();
        }

        System.out.print("Acesso permitido.");
        sc.close();
    }
}
