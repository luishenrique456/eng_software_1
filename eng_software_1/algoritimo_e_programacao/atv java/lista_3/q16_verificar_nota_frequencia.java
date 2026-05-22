//16) Faça um programa que informe se um aluno foi aprovado considerando nota e frequência.
import java.util.Scanner;
public class q16_verificar_nota_frequencia {
    public static double calcular_media(double nota1 , double nota2){
        double media = (nota1+nota2)/2;
        return media;
    }

    public static String verificar_aprovacao(double media , int frequencia){
        if((media >= 7)&&(frequencia >= 40 && frequencia <=100)){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota : ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Digite sua nota : ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Digite sua frequencia : ");
        int frequencia = sc.nextInt();

        double media = calcular_media(nota1, nota2);

        System.out.print(verificar_aprovacao(media, frequencia));





        sc.close();
    }
}
