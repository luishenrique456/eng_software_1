//26) Crie um algoritmo que leia números positivos até que o usuário digite um número negativo.
import java.util.Scanner;
public class q26_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.print("Digite um número : ");
            numero = sc.nextInt();
        }
        while(numero > 0);
        if(0 > numero){
            System.out.print("Programa encerrado");
        }




        sc.close();
    }
}
