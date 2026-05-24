//23) Crie um algoritmo que continue pedindo senha até que o usuário digite “1234”
import java.util.Scanner;
public class q23_verificar_senha_certa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digie sua senha : ");
        int senha = sc.nextInt();
        while(senha != 1234){
           System.out.print("Digie sua senha : ");
           senha = sc.nextInt();
        }
        if(senha == 1234){
            System.out.print("programa encerrado");
        }




        sc.close();
    }
}
