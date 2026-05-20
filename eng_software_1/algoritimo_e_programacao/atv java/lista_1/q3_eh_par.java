//  3. Leia um número inteiro e informe se ele é par ou ímpar.
import java.util.Scanner;

public class q3_eh_par {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite número : ");
    int numero = sc.nextInt();

    if(numero % 2 == 0){
        System.out.print("É par");
    }
    else{
        System.out.print("É impar");
    }





    sc.close(); 
    }
    
}
