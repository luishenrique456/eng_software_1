programa {
  funcao inicio() {
    // 13) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e informe quantos são
    // iguais a 7.
    inteiro numeros[5]
    inteiro contador = 0
    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite ",i+1," um número : ")
      leia(numeros[i])

      se(numeros[i] == 7){
        contador += 1
      }

    }

    escreva("quantidades elementos são iguais a 7 : ",contador)



  }
}
