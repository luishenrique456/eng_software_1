//1) Crie um programa em Java que leia um número inteiro e informe se ele é positivo
import java.util.Scanner;
public class q1_eh_pos {
    public static String informa_positivo( int numero){
        if(numero > 0){
            return "É positivo";
        }
        else{
            return "É negativo";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero = sc.nextInt();
        System.out.println(informa_positivo(numero));



        sc.close();
    }
}