package exercicios.condicionais;
import java.util.Scanner;

public class exc5 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        double cachorroQuente = 4.00;
        double xsalada = 4.50;
        double xbacon = 5.00;
        double torradaSimples = 2.00;
        double refri = 1.50;
        double total;


        System.out.print("Digite o código: ");
        int cod = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        int qtd = sc.nextInt();

        if(cod == 1){
            total = qtd * cachorroQuente;
           System.out.printf("Total: R$ %.2f%n", total);
        }else if(cod == 2){
            total = qtd * xsalada;
           System.out.printf("Total: R$ %.2f%n", total);
        }else if(cod == 3){
            total = qtd * xbacon;
           System.out.printf("Total: R$ %.2f%n", total);
        }else if(cod == 4){
            total = qtd * torradaSimples;
           System.out.printf("Total: R$ %.2f%n", total);
        }else if(cod == 5){
            total = qtd * refri;
           System.out.printf("Total: R$ %.2f%n", total);
        }else{
            System.out.print("Inválido! Digite o código de acordo com o que está na tabela.");
        }

        sc.close();
    }
}
