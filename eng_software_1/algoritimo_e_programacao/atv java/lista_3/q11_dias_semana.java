//11) Faça um programa que leia um número de 1 a 7 e mostre o dia da semana correspondente (usando switch e case) 
import java.util.Scanner;
public class q11_dias_semana {

    public static String mostrar_semana(int dia){
        String resultado;
        switch(dia){
            case 1:
                resultado ="Domingo";
                break;
            case 2:
                resultado = "Segunda-feira";
                break;
            case 3:
                resultado = "Terça-feira";
                break;
            case 4:
                resultado = "Quarta-feira";
                break;
            case 5:
                resultado = "Quinta-feira";
                break;
            case 6:
                resultado = "Sexta-feira";
                break;
            case 7:
                resultado = "Sábado";
                break;
            default:
                resultado = "Valor inválido";
                
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um dia da semana (1 a 7) : ");
        int dia = sc.nextInt();
        System.out.print(mostrar_semana(dia));




        sc.close();
    }
}
