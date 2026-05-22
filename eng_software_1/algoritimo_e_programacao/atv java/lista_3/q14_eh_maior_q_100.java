//14) Faça um algoritmo que leia um número e informe se ele é maior que 100
import java.util.Scanner;
public class q14_eh_maior_q_100 {
    public static String verificar_maior_que_100(int numero){
        if(numero > 100){
            return "maior que 100";
        }
        else{
            return "não é maior que 100";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int numero = sc.nextInt();
        System.out.print(verificar_maior_que_100(numero));


        sc.close();
    }
}
