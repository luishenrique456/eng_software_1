programa {
  funcao inicio() {
    // 10) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e substitua todos os valores
    // negativos por 0. Em seguida, mostre o vetor atualizado.
    inteiro numeros[5]
    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite ",i+1," um número : ")
      leia(numeros[i])

      se(0 > numeros[i]){
        numeros[i] = 0
      }

    }

    escreva(numeros)

    
  }
}
