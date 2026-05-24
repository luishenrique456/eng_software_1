//25) Faça um programa que exiba um menu repetidamente até o usuário escolher sair.
import java.util.Scanner;
public class q25_exibir_menu {

    public static int somar(int numero1 , int numero2){
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;
        do{
            System.out.print("Menu");
            System.out.print("opção 1 para somar ");
            System.out.print("opção 0 para sair ");
            System.out.print("Escolha uma opção (1 ou 0) : ");
            opcao = sc.next().charAt(0);
            
            switch(opcao){
                case '1':
                    System.out.print("Digite primero número : ");
                    int numero1 = sc.nextInt();
                    System.out.print("Digite segundo número : ");
                    int numero2 = sc.nextInt();
                    System.out.println("Somar é "+somar(numero1,numero2));
                    break;
                case '0':
                    System.out.print("programa encerrado");
                    break;
                default:
                    System.out.println("opção inválido.Tenta novamente");
                    break;
            };

        }
        while(opcao != '0');



        sc.close();
    }
}