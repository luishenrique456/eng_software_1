//13) Crie um programa que leia dois números e informe se eles são iguais.
import java.util.Scanner;
public class q13_verificar_numero_igual {
    public static String verificar_igual(int numero1 , int numero2){
        if(numero1 == numero2){
            return "são iguais";
        }
        else{
            return "são diferentes";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero1 = sc.nextInt();
        System.out.print("Digite um número : ");
        int numero2 = sc.nextInt();
        System.out.print(verificar_igual(numero1,numero2));



        sc.close();
    }
}
