programa {
  funcao inicio() {
    // 14) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e informe a posição (índice)
    // do maior elemento.
    inteiro numeros[5]
    inteiro posicao = 0
    inteiro maior = 0
    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite posição ", i  ," um número : ")
      leia(numeros[i])

      se(maior == 0){
        maior = numeros[i]
        posicao = i
      }

      se(maior < numeros[i]){
        maior = numeros[i]
        posicao = i
      }


    }

    escreva("\nPosição : ",posicao,"\nMaior valor : ",maior)


  }
}
