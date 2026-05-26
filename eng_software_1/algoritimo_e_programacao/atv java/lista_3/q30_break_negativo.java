//30) Desenvolva um programa que leia números até encontrar um número negativo utilizando break.
import java.util.Scanner;
public class q30_break_negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Digite um número : ");
            numero = sc.nextInt();
        }
        while(numero > 0);
        if(0 > numero){
            System.out.printf("seu número é negativo %d",numero);
            System.out.print("\nprograma encerrado");
        }



        sc.close();
    }
}
