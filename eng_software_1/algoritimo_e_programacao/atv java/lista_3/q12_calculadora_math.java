//12) Desenvolva um algoritmo que leia uma operação matemática e realize o cálculo entre dois números
import java.util.Scanner;
public class q12_calculadora_math {

    public static double somar( double numero1 ,double numero2){
        return numero1 + numero2;
    }

    public static double subtrair(double numero1 , double numero2){
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1 , double numero2){
        return numero1 * numero2;
    }
    public static double dividir(double numero1 , double numero2){
        return numero1 / numero2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        double numero1 = sc.nextDouble();
        System.out.print("Digite um número : ");
        double numero2 = sc.nextDouble();
        System.out.print("Digite um simbolo operação matematica (+,-,*,/) : ");
        char simbolo_operacao = sc.next().charAt(0);
        switch (simbolo_operacao) {
            case '+':
                System.out.print("somar é "+somar(numero1,numero2));
                break;
            case '-':
                System.out.print("subitração é "+subtrair(numero1, numero2));
                break;
            case '*':
                System.out.print("multiplicação é "+multiplicar(numero1, numero2));
                break;
            case '/':
                if(numero2 == 0){
                    System.out.print("Não pode dividir por 0 (zero)");
                }
                else{
                    System.out.print("divisão é "+dividir(numero1, numero2));
                }
                
        
            default:
                System.out.print("valor inválido");
                break;
        }



        sc.close();
    }
}
