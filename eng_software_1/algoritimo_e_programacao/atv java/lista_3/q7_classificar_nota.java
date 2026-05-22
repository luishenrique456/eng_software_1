//7) Faça um programa que leia uma nota e classifique em A, B ou C
import java.util.Scanner;
public class q7_classificar_nota {
    public static char classificar_nota(int nota){
        if(nota >= 0 && nota <= 4){
            return 'C';
        }
        else if(nota >= 5 && nota <= 6){
            return 'B';
        }
        else{
            return 'A';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota : ");
        int nota = sc.nextInt();
        System.out.print("Classificação : "+classificar_nota(nota));
        




        sc.close();
    }
}