// 1. Leia dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.
import java.util.Scanner;
public class q1_operacoes_math{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite um número : ");
	    int numero1 = sc.nextInt();
	    System.out.print("Digite um número : ");
	    int numero2 = sc.nextInt();
	    
	    int soma = numero1 + numero2;
	    int subtracao = numero1 - numero2;
	    int multiplicacao = numero1 * numero2;
	    
	    System.out.println("soma é "+soma);
	    System.out.println("subtração é "+subtracao);
	    System.out.println("multiplicação é "+multiplicacao);
	    
	    if(numero2 == 0){
	        System.out.print("Não pode dividir por 0");
	    }
	    else{
	        float divisao = numero1 / numero2;
	        System.out.print("Divisão é "+divisao);
	    }
		sc.close();
	}
}
