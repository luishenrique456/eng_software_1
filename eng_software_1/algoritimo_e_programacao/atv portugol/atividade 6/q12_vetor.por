programa {
  funcao inicio() {
    // 12) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e mostre apenas os
    // elementos que estão nas posições de índice ímpar.
    inteiro numeros[5]
    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite um ",i," um número : ")
      leia(numeros[i])
    }

    para(inteiro i = 0 ; i < 5 ; i++){
      se(i % 2 != 0){
        escreva("\nposição ",i," valor : ",numeros[i],"\n")
      }
    }




  }
}
