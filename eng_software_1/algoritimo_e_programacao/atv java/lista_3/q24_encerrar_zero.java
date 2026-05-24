//24) Desenvolva um programa que leia números até que seja digitado 0
import java.util.Scanner;
public class q24_encerrar_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero = sc.nextInt();
        while(numero != 0){
            System.out.print("Digite um número : ");
            numero = sc.nextInt();
        }
        if(numero == 0){
            System.out.print("programa encerrado");
        }


        sc.close();
    }
}
