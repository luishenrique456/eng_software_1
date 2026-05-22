//9) Crie um programa que leia o IMC de uma pessoa e informe a classificação correspondente
// Baixo peso: menor que 18,5
// Peso normal: 18,5 a 24,9
// Sobrepeso: 25,0 a 29,9
// Obesidade grau I: 30,0 a 34,9
// Obesidade grau II: 35,0 a 39,9
// Obesidade grau III: 40,0 ou mais
import java.util.Scanner;
public class q9_calcular_imc {
    
    public static String classificar_imc(double imc){
        if(imc <= 18.5){
            return "Peso normal";
        }
        else if(imc >= 18.5 && imc <= 24.9 ){
            return "Sobrepeso";
        }
        else if(imc >= 25.0 && imc <= 29.9){
            return "Obesidae grau 1";
        }
        else if(imc >= 30.0 && imc <= 34.9){
            return "obesidade grau 2";
        }
        else{
            return "obesidade grau 3";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu IMC : ");
        double imc = sc.nextDouble();
        System.out.println("Classificação do IMC : "+classificar_imc(imc));






        sc.close();
    }
}