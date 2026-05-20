programa {
  funcao inicio() {
    // 7) Declare um vetor de 6 posições do tipo inteiro. Leia os valores e mostre quantos elementos
    // são maiores que 10.
    inteiro contador = 0
    inteiro numeros[6]
    para(inteiro i = 0 ; i < 6 ; i++){
      escreva("Digite ",i+1," um número : ")
      leia(numeros[i])

      se(10 < numeros[i]){
        contador += 1
      }

    }

    escreva("valores são maiores que 10 : ",contador)


  }
}
