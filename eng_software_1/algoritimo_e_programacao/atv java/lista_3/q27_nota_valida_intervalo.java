//27) Desenvolva um programa que solicite uma nota válida entre 0 e 10
import java.util.Scanner;
public class q27_nota_valida_intervalo {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        do{
            System.out.print("\nDigite uma nota : ");
            nota = sc.nextInt();
            if(!(nota >= 0 && nota <= 10)){
                System.out.print("nota inválido");
            }

            
            }
            while(!(nota >= 0 && nota <= 10));
            System.out.print("nota válida\nprograma encerrado");


            sc.close();
        }
        

        
    }

