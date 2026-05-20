// 6)Crie uma função chamada exibirMensagem, do tipo void. Ela deve receber um nome como parâmetro
// e imprimir uma mensagem de boas-vindas no formato indicado abaixo. O programa principal deve
// solicitar o nome do usuário e chamar a função
import java.util.Scanner;
public class q6_exibirMensagem {

    public static void exibirMensagem(String nome){
        System.out.print("Bem-vindo(a) "+nome+"!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome : ");
        String nome = sc.nextLine();
        exibirMensagem(nome);

        sc.close();
    }
}