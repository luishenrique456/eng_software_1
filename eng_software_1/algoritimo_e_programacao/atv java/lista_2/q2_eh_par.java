// 2)Crie uma função chamada ehPar que receba um número inteiro e retorne true caso o número seja par
// e false caso contrário. O programa deve informar ao usuário se o número digitado é par ou ímpar.
import java.util.Scanner;
public class q2_eh_par{
    public static boolean verificar_par(int numero1){
        if(numero1 % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero1 = sc.nextInt();
        System.out.print("se for true é par caso contrário é impar : "+verificar_par(numero1));

        sc.close();
    }
}