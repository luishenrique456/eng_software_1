programa {
  funcao inicio() {
    // 6) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e mostre o menor elemento
    // do vetor.
    inteiro numeros[5]
    inteiro menor = 0
    para(inteiro i = 0 ; i < 5 ; i++){
      
      escreva("Digite ",i+1," um número : ")
      leia(numeros[i])

      se(menor == 0){
        menor = numeros[i]
      }

      se(menor > numeros[i]){
        menor = numeros[i]
      }

    }

    escreva("menor elemento : ",menor)



  }
}
