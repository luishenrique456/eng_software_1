//31 O sistema deve permitir:- Cadastrar números- Exibir soma- Exibir média- Encerrar o programa
//Menu com switch- Estruturas if e else- Uso de laços de repetição- Validação de entrada- Uso de break e continue
import java.util.Scanner;
public class q31_sistema_media {
    public static int calcular_somar(int numero1 , int numero2){
        return numero1 + numero2;
    }
    public static int calcular_media(int numero1 , int numero2){
        return calcular_somar(numero1, numero2) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op;
        int numero1 = 0;
        int numero2 = 0;
        do{
            System.out.print("Menu");
            System.out.print("\nopção 1 para cadastrar números ");
            System.out.print("\nopção 2 para exibir soma ");
            System.out.print("\nopção 3 para exibir média ");
            System.out.print("\nopção 4 para sair");
            System.out.print("\nEscolha uma opção (1 , 2 , 3 e 4) : ");
            op = sc.next().charAt(0);
            switch(op){
                case '1':
                    System.out.print("Digite primeiro número :");
                    numero1 = sc.nextInt();
                    System.out.print("Digite segundo número :");
                    numero2 = sc.nextInt();
                    break;
                case '2':
                    if(numero1 == 0 && numero2 == 0){
                        System.out.println("sem valor. Vai na opção 1 para cadastrar números");
                        break;
                    }
                    else{
                        System.out.println("Soma é "+calcular_somar(numero1,numero2));
                        break;
                    }
                    
                case '3':
                    if(numero1 == 0 && numero2 == 0){
                       System.out.println("sem valor. Vai na opção 1 para cadastrar números");
                       break; 
                    }
                    else{
                        System.out.println("média é "+calcular_media(numero1,numero2));
                    break;
                    }
                    
                case '4':
                    System.out.println("programa encerrado");
                    break;
                default:
                    System.out.println("valor inválido.Tenta novamente");
                    break;

            }
        
        }
        while (op != '4');


        sc.close();
    }
}
