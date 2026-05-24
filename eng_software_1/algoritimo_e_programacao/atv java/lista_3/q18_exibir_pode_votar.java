//18 ) Desenvolva um programa que informe se uma pessoa pode votar
// Dos 0 aos 15 anos : não pode votar
// Dos 16 aos 17 anos: voto facultativo
// Dos 18 aos 70 anos: voto obrigatório
// Após os 70 anos: voto facultativo
import java.util.Scanner;
public class q18_exibir_pode_votar {
    public static String informar_votar(int idade){
        if(idade >=0 && idade<=15){
            return "não pode votar";
        }
        else if(idade >= 16 && idade <= 17){
            return "voto facultativo";
        }
        else if(idade >= 18 && idade <= 70){
            return "voto obrigatório";
        }
        else{
            return "voto facultativo";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = sc.nextInt();
        System.out.print(informar_votar(idade));




        sc.close();
    }
}