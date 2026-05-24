//21) Desenvolva um programa que calcule a soma dos números de 1 até 100
public class q21_somar_1_a_100 {
    public static void main(String[] args) {
        int soma_total = 0;
        for(int i = 1 ; i <= 100 ;i++){
            soma_total += i;
        }

        System.out.print("Somar 1 até 100 : "+soma_total);
    }
}
