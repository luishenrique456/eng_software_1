//28) Faça um programa que exiba números de 1 a 10 e pare quando encontrar o número 5.
public class q28_break_5 {

    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            if( i == 5){
                System.out.println("encontrei 5");
                break;
            }
            System.out.println(i);
        }
        



        
    }
}