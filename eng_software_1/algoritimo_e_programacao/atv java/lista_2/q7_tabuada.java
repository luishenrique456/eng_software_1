// 7)Crie uma função chamada mostrarTabuada que receba um número inteiro. A função deve exibir a
// tabuada desse número de 1 até 10. O programa principal deve solicitar o número ao usuário e chamar a
// função
import java.util.Scanner;
public class q7_tabuada {
    public static void mostrarTabuada(int numero){
        for(int i = 0 ; i <= 10 ;i++){
            System.out.print("\n"+numero+" * "+i+" = "+numero*i+"\n");;
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite um número : ");
       int numero = sc.nextInt();
       mostrarTabuada(numero);
       
       


       sc.close();
    }
}