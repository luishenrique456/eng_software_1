// 1) Crie uma função chamada somar que receba dois números inteiros como parâmetros e retorne a soma
// deles. O programa principal deve solicitar dois números ao usuário, chamar a função e exibir o
// resultado da soma.
import java.util.Scanner;
public class q1_somar{

    public static int somar(int numero1 , int numero2){
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero1 = sc.nextInt();
        System.out.print("Digite um número : ");
        int numero2 = sc.nextInt();

        System.out.print("Soma é "+somar(numero1,numero2));


        sc.close();
    }
}