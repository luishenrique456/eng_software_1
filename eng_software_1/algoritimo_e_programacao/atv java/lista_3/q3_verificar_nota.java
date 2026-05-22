//3) Desenvolva um algoritmo que leia a nota de um aluno e mostre “Aprovado” caso a nota seja maior ou igual a 7
import java.util.Scanner;
public class q3_verificar_nota {
    public static String verificar_nota(int nota){
        if(nota >= 7){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota : ");
        int nota = sc.nextInt();
        System.out.print(verificar_nota(nota));


        sc.close();
    }
}
