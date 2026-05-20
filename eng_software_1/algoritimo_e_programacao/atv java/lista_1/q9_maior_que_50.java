// 9. Solicite ao usuário um número maior que 50. Repita a leitura até que a condição seja atendida.
import java.util.Scanner;
public class q9_maior_que_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
	    
	    do{
	        System.out.print("Digite um número : ");
	        num = sc.nextInt();
	    }
	    while(num <= 50);
	        System.out.print("programa encerrado! número maior que 50 : "+num);
	
        sc.close();
    }
}