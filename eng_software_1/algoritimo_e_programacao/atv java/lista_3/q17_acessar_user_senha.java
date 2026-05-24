//17) Crie um algoritmo que permita acesso ao sistema caso usuário ou senha estejam corretos
import java.util.Scanner;
public class q17_acessar_user_senha {

    public static String validar_user_or_senha(String nome_user,String senha_user,String nome_user_confirma,String senha_user_confirma){
        if(nome_user.equals(nome_user_confirma) || senha_user.equals(senha_user_confirma)){
            return "Acesso permitido";
        }
        else{
            return "Usuário e senha inválidos";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome de usuário : ");
        String nome_user = sc.nextLine();
        System.out.print("Digite sua senha : ");
        String senha_user = sc.nextLine();
        
        System.out.print("Digite confirma seu nome usuário : ");
        String nome_user_confirma = sc.nextLine();
        System.out.print("Digite confirma sua senha : ");
        String senha_user_confirma = sc.nextLine();

        System.out.print(validar_user_or_senha(nome_user, senha_user, nome_user_confirma, senha_user_confirma));
        




        sc.close();
    }
    
}
