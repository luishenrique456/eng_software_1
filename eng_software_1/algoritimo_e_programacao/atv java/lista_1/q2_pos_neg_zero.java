// 2. Leia um número inteiro e informe se ele é positivo, negativo ou zero.
import java.util.Scanner;
public class q2_pos_neg_zero{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite um número : ");
		int numero = sc.nextInt();
		if(0 > numero){
			System.out.print("seu número é negativo "+numero);
		}
		else if(numero == 0){
			System.out.print("Seu número é zero : "+numero);
		}
		else{
			System.out.print("Seu número é positivo : "+numero);
		}




		sc.close();
	}
}
