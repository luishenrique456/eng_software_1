//10) Crie um menu simples com as opções cadastrar, consultar e sair (usando switch e case) 
import java.util.Scanner;
public class q10_menu_cadastra {
    public static int calcular_soma(int numero1,int numero2){
        return numero1 + numero2;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op;
        int numero1 = 0;
        int numero2 = 0;
        do{
            System.out.println("Menu");
            System.out.println("opção 1 para cadastra números  ");
            System.out.println("opção 2 para consultar resultado soma  ");
            System.out.println("opção 3 para sair  ");
            System.out.println("Escolher uma opção : ");
            op = sc.next().charAt(0);
            switch(op){
                case '1':
                    System.out.println("Digite primeiro número : ");
                    numero1 = sc.nextInt();
                    System.out.println("Digite segundo número : ");
                    numero2 = sc.nextInt();
                    System.out.println("numeros cadastrado com sucesso");
                    break;
                case '2':
                    if(numero1 == 0 && numero2 == 0){
                        System.out.print("sem valor.Precisa opção 1 para cadastra números");
                        break;
                    }
                    else{
                        System.out.println("soma é "+calcular_soma(numero1,numero2));
                        break;
                    }
                case '3':
                    System.out.println("programa encerrado");
                    break;
                default:
                    System.out.println("valor inválido.Tenta novamente");
                    break;

            }
        }
        while (op != '3');
            
        

        sc.close();
    }
}