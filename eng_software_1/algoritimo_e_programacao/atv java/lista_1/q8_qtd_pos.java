// 8. Leia números inteiros enquanto forem positivos. Ao final, informe quantos números positivos foram digitados.
import java.util.Scanner;
public class q8_qtd_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
	    int conta = 0;
	
	    do{
            System.out.print("Digite um número : ");
            num = sc.nextInt();

            if(num > 0){
                conta ++;
            }
            
        }
        
        while(num > 0);
            
            System.out.println("Quantidade de positivos: "+conta);

        sc.close();
    }
}
