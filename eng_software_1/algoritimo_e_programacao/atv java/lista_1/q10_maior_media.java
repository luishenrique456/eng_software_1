// 10. Leia 10 números inteiros, calcule a média e informe quantos números são maiores que a média.
import java.util.Scanner;
public class q10_maior_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = 0;
        int somar = 0;
        int conta_num = 0;
        int [] numeros = new int [5];
        for(int i = 0; i < 5 ; i++){
            System.out.printf("Digite %d um número : ",i+1);
            int num_user = sc.nextInt();
            numeros[i] = num_user;
            somar += numeros[i];
            quantidade += 1;
        }

        int media = somar / quantidade;

        for(int i = 0;i < 5;i++){
            if(numeros[i] > media){
                conta_num++;
            }
        }

        System.out.printf("media é %d ",media);
        System.out.printf("\nquantidades números são maiores que a média %d",conta_num);

        sc.close();
    }
}
