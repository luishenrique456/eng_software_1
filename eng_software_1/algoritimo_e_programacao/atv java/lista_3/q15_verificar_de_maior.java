//15) Desenvolva um programa que compare duas idades e informe qual é menor.
import java.util.Scanner;
public class q15_verificar_de_maior {
    public static String verificar_de_maior(int idade){
        if(idade >= 18){
            return "De maior";
        }
        else{
            return "De menor";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = sc.nextInt();
        System.out.print(verificar_de_maior(idade));




        sc.close();
    }
}