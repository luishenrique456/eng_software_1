programa {
  funcao inicio() {
    // 9) Declare um vetor de 6 posições do tipo inteiro. Leia os valores e mostre a soma apenas dos
    // elementos ímpares.
    inteiro numeros[6]
    inteiro contador = 0
    para(inteiro i = 0 ; i < 6 ; i++){
      escreva("Digite ",i+1," um número : ")
      leia(numeros[i])

      se(numeros[i] % 2 != 0){
        contador += 1
      }

    }

    escreva("quantidade de elementos são ímpares : ",contador)



  }
}
