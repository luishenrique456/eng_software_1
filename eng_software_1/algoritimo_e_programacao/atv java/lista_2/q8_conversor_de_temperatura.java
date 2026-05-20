// 8)Crie uma função chamada celsiusParaFahrenheit e outra chamada fahrenheitParaCelsius. As
// funções devem receber um valor do tipo double e retornar a conversão correspondente. O programa
// deve permitir ao usuário escolher o tipo de conversão, solicitar a temperatura e exibir o resultado
import java.util.Scanner;
public class q8_conversor_de_temperatura {
    public static double celsiusParaFahrenheit(double temperatura_celsius ){
        double temperatura_fahrenheit = (temperatura_celsius * 9/5)+32;
        return temperatura_fahrenheit;
    }

    public static double fahrenheitParaCelsius(double temperatura_fahrenheit){
        double temperatura_celsius = ((temperatura_fahrenheit - 32)/9)*5;
        return temperatura_celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMenu\nopção 1 Celsius para Fahrenheit\nopção 2 Fahrenheit para Celsius\nDigite uma opção 1 ou 2 : ");
        char opcao = sc.next().charAt(0);

        if(opcao == '1'){
            System.out.print("Digite temperatura em Celsius : ");
            double temperatura_celsius = sc.nextDouble();
            System.out.print("Sua temperatura Celsius para Fahreheit : "+celsiusParaFahrenheit(temperatura_celsius)+"ºF");
        }

        if(opcao == '2'){
            System.out.print("Digite temperatura em Fahrenheit : ");
            double temperatura_fahrenheit = sc.nextDouble();
            System.out.print("Sua temperatura Fahreheit para Celsius : "+fahrenheitParaCelsius(temperatura_fahrenheit)+"ºC");
        }



        sc.close();
    }
}