// imc = peso / (altura * altura)
//tabela_imc = {"Baixo peso: menor que 18,5","Peso normal: 18,5 a 24,9","Sobrepeso: 25,0 a 29,9","Obesidade grau I: 30,0 a 34,9","Obesidade grau II: 35,0 a 39,9","Obesidade grau III: 40,0 ou mais"};
// Baixo peso: menor que 18,5
// Peso normal: 18,5 a 24,9
// Sobrepeso: 25,0 a 29,9
// Obesidade grau I: 30,0 a 34,9
// Obesidade grau II: 35,0 a 39,9
// Obesidade grau III: 40,0 ou mais
import java.util.Scanner;
public class calculadora_imc {
    //função calcular imc(double peso , double altura) que recebe 2 parâmetros e retorna resulado imc
    public static double calcular_imc(double peso , double altura){
        double imc = peso / (altura * altura);
        return imc;
    }
    //função exibir_tabela_imc() para percorrer um array sem retorno
    public static void exibir_tabela_imc(){
        String [] tabela_imc = {"Baixo peso: menor que 18,5","Peso normal: 18,5 a 24,9","Sobrepeso: 25,0 a 29,9","Obesidade grau I: 30,0 a 34,9","Obesidade grau II: 35,0 a 39,9","Obesidade grau III: 40,0 ou mais"};
        for(int i = 0 ; i < tabela_imc.length ; i++){
            System.out.print(tabela_imc[i]+"\n");
        }
    }
    //função classificar_imc(double imc) que recebe o valor do IMC
    //e retorna a classificação de acordo com a tabela de IMC
    public static String classificar_imc(double imc){
        if(imc < 18.5){
            return "Baixo peso";
        }
        else if(imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        }
        else if(imc >= 25.0 && imc <= 29.9){
            return "Sobrepeso";
        }
        else if(imc >= 30.0 && imc <= 34.9){
            return "Obesidade grau I";
        }
        else if(imc >= 35.0 && imc <= 39.9){
            return "Obesidade grau II";
        }
        else{
            return "Obesidade grau III";
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
    // Define o locale para US para que o Scanner aceite ponto (.) como separador decimal.
    // Sem isso, no Windows em português, o nextDouble() espera vírgula (,) e lança InputMismatchException.
        sc.useLocale(java.util.Locale.US);
        char op;

        do{
            System.out.println("Menu");
            System.out.println("opção 1 para calcular imc ");
            System.out.println("opção 2 para exibir tabela imc ");
            System.out.println("opção 3 para sair ");
            System.out.println("Escolha uma opção (1,2,3) : ");
            op = sc.next().charAt(0);
            switch(op){
              case '1':
                  System.out.println("Digite seu peso : ");
                  double peso = sc.nextDouble();
                  System.out.println("Digite sua altura : ");
                  double altura = sc.nextDouble();
                  double imc = calcular_imc(peso,altura);
                  System.out.printf("Seu IMC é %.2f\n",imc);
                  System.out.println("classificação imc é : "+classificar_imc(imc));
                  break;
              case '2':
                  System.out.println("tabela de IMC");
                  exibir_tabela_imc();
                  break;
                 
              case '3':
                  System.out.println("programa encerrado");
                  break;
              default:
                  System.out.println("valor inválido.Tenta Novamnete!");
                  break;
             
            }

        }
        while(op != '3');
        sc.close();
    }
}