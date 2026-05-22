// 8) Desenvolva um algoritmo que leia a idade de uma pessoa e classifique como criança, adolescente, adulto ou
// // idoso.
// Criança: 0 a 11 anos
// Adolescente: 12 a 17 anos
// Adulto: 18 a 59 anos
// Idoso: 60 anos ou mais
import java.util.Scanner;
public class q8_classificar_idade {

    public static String classificar_idade(int idade){
        if(idade >= 0 && idade <= 11){
            return "crianças";
        }
        else if(idade >= 12 && idade <= 17){
            return "Adolescente";
        }
        else if(idade >= 18 && idade <= 59){
            return "Adulto";
        }
        else{
            return "Idoso";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = sc.nextInt();
        System.out.print("Você é "+classificar_idade(idade));



        sc.close();
    }
}
