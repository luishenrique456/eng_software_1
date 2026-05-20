// 6. Leia três números inteiros e mostre qual é o maior deles.
import java.util.Scanner;
public class q6_maior_3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        System.out.print("Digite um número : ");
        int numero1 =sc.nextInt();
        System.out.print("Digite um número : ");
        int numero2 =sc.nextInt();
        System.out.print("Digite um número : ");
        int numero3 =sc.nextInt();
        if(numero1 > maior){
            maior = numero1;
        }
        if(numero2 > maior){
            maior = numero2;
        }
        if(numero3 > maior){
            maior = numero3;
        }
        System.out.print("Maior é "+maior);

        sc.close();
    }
}
