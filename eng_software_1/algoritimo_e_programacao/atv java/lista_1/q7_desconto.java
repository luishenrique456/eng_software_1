// 7. Leia um valor de compra. Se o valor for maior que R$ 100,00, aplique 10% de desconto e mostre o valor
// final. Caso contrário, mostre o valor original.
import java.util.Scanner;
public class q7_desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor : ");
        float valor_original = sc.nextFloat();
        if(valor_original > 100){
            float acrecimo = valor_original * 0.10f;
            float desconto = valor_original - acrecimo;
            System.out.println("Valor com desconto: " + desconto);
        }
        else{
            System.out.println("Valor original: " + valor_original);
        }


        sc.close();
    }
}