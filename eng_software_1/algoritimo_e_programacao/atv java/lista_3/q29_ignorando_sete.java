//29) Crie um algoritmo que exiba números de 1 a 10 ignorando o número 7.
public class q29_ignorando_sete {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            if(i == 7){
                continue;
            }
            System.out.println(i);
        }
        
    }
}