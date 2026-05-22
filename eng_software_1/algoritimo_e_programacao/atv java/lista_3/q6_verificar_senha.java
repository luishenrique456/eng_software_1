//6) Desenvolva um algoritmo que leia a senha digitada pelo usuário e informe se ela está correta ou incorreta.
import java.util.Scanner;
public class q6_verificar_senha {
    public static String verificar_senha(String senha , String senha_confir){
        // O método .equals() compara o CONTEÚDO das Strings.
        if(senha.equals(senha_confir)){
            return "senha correta";
        }
        else{
            return "senha incorreta";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua senha : ");
        String senha = sc.nextLine();
        System.out.print("Digite para confirma senha : ");
        String senha_confir = sc.nextLine();
        System.out.print(verificar_senha(senha, senha_confir));
        



        sc.close();
    }
}