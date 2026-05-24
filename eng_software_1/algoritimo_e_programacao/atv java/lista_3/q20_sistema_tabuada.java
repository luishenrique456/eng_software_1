//20) Crie um algoritmo que mostre a tabuada de um número digitado pelo usuário.
import java.util.Scanner;
public class q20_sistema_tabuada {

    public static void exibir_tabuada(int numero){
        for(int i = 0; i <= 10;i++){
            System.out.print("\n"+numero+" * "+i+" = "+numero*i+"\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero = sc.nextInt();
        exibir_tabuada(numero);




        sc.close();
    }
}