//2) Faça um programa que leia a idade de uma pessoa e exiba “Maior de idade” caso tenha 18 anos ou mais.
import java.util.Scanner;
public class q2_verificar_idade {
    public static String verificar_idade(int idade){
        if(idade >= 18){
            return "Maior de idade";
        }
        else{
            return "Menor de idade";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = sc.nextInt();
        System.out.println(verificar_idade(idade));



        sc.close();
    }
}
