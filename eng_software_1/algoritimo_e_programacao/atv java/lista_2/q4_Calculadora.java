// 4) Crie as funções somar, subtrair, multiplicar e dividir. Cada função deve receber dois números do tipo
// double. O programa deve apresentar um menu, permitir ao usuário escolher a operação, chamar a
// função correspondente e exibir o resultado
import java.util.Scanner;
public class q4_Calculadora {
    public static double somar(double numero1 , double numero2){
        return numero1 + numero2;
    }
    public static double subtrair(double numero1 , double numero2){
        return numero1 - numero2;
    }
    public static double multiplicar(double numero1 , double numero2){
        return numero1 * numero2;
    }
    public static String dividir( double numero1 , double numero2){
        if(numero2 == 0){
            return "Não pode dividir por 0";
        }
        else{
            double resultado_divisao = numero1 / numero2;
            return String.format("Divisão é %.2f",resultado_divisao);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        double numero1 = sc.nextDouble();
        
        System.out.print("Digite um número : ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite uma operação ( + , - , * , / ) : ");
        char operacao = sc.next().charAt(0);
        if(operacao == '+'){
            System.out.print("Soma é "+somar(numero1,numero2));
        }
        if(operacao == '-'){
            System.out.print("Subtração é "+subtrair(numero1, numero2));
        }
        if(operacao == '*'){
            System.out.print("multiplicação é "+multiplicar(numero1, numero2));
        }
        if(operacao == '/'){
            System.out.print(dividir(numero1, numero2));
        }



        sc.close();
        
    }
}