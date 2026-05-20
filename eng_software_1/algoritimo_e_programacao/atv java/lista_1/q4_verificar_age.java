//  4. Leia a idade de uma pessoa e informe se ela é maior ou menor de idade.
import java.util.Scanner;
public class q4_verificar_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = sc.nextInt();
        if(idade >= 18){
            System.out.print("Maior de idade");
        }
        else{
            System.out.print("Menor de idade");
        }




        sc.close();
    }
}
