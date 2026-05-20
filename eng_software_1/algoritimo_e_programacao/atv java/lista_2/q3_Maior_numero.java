// 3)Crie uma função chamada maiorNumero que receba três números inteiros e retorne o maior deles. O
// programa principal deve solicitar os três valores e exibir o maior número encontrado
import java.util.Scanner;
public class q3_Maior_numero {

    public static int maiorNumero(int num1 , int num2 , int num3){
        int maior = 0;
        if(num1 > maior){
            maior = num1;
        }
        if(num2 > maior){
            maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }

        return maior;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero1 = sc.nextInt();
        System.out.print("Digite um número : ");
        int numero2 = sc.nextInt();
        System.out.print("Digite um número : ");
        int numero3 = sc.nextInt();
        System.out.println("Maior é "+maiorNumero(numero1,numero2,numero3));


        sc.close();
    }
}
