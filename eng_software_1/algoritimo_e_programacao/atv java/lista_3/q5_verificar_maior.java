//5) Crie um programa que leia dois números e informe qual deles é maior.
import java.util.Scanner;
public class q5_verificar_maior {
    public static int verificar_maior(int numero1 , int numero2){
        int maior = 0;
        if(numero1 > maior){
            maior = numero1;
        }
        if(numero2 > maior){
            maior = numero2;
        }
        return maior;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero1 = sc.nextInt();
        System.out.print("Digite um número : ");
        int numero2 = sc.nextInt();
        System.out.println("Maior número é "+verificar_maior(numero1, numero2));



        sc.close();
    }
    
}
