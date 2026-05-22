//4)Faça um programa que leia um número inteiro e informe se ele é par ou ímpar.
import java.util.Scanner;
public class q4_verificar_par {
    public static String verificar_par(int numero){
        if(numero % 2 == 0){
            return "É par";
        }
        else{
            return "É impar";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero = sc.nextInt();
        System.out.print(verificar_par(numero));



        sc.close();
    }
    
}
