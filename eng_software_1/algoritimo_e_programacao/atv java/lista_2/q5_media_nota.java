// 5) Crie uma função chamada calcularMedia que receba duas notas do tipo double e retorne a média. O
// programa deve informar a média e mostrar se o aluno foi aprovado ou reprovado, considerando
// aprovação com média maior ou igual a 7.
import java.util.Scanner;
public class q5_media_nota {
    public static String calcularMedia(double nota1 , double nota2){
        double media = (nota1 + nota2) / 2;
        if(media >= 7){
            return String.format("Aprovado ; sua média é : %.2f ",media);
        }
        else{
            return String.format("Reprovado ; sua média é : %.2f ",media);
        }
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite primeira nota : ");
    double nota1 = sc.nextDouble();
    System.out.print("Digite segunda nota : ");
    double nota2 = sc.nextDouble();
    System.out.print(calcularMedia(nota1, nota2));



    sc.close();
    }
}