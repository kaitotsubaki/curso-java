package exercicios.condicionais;
import java.util.Scanner;

public class exc4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.print("Digite a hora final: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if(horaFinal > horaInicial){
            duracao = horaFinal - horaInicial;
        }else{
            duracao = 24 - horaInicial - horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " Hora(s).");


        sc.close();
    }
}
