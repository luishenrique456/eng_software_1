// 5. Leia duas notas, calcule a média e informe se o aluno foi aprovado ou reprovado. Considere aprovado média
// maior ou igual a 7.
import java.util.Scanner;
public class q5_notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota 1 : ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite sua nota 2 : ");
        float nota2 = sc.nextFloat();
        float media = (nota1 + nota2) / 2;
        if(media >= 7){
            System.out.print("Aprovado");
        }
        else{
            System.out.print("reprovado");
        }

        sc.close();
    }
    
}