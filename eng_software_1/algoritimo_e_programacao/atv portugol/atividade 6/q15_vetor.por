programa {
  funcao inicio() {
    // 15) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e informe a posição (índice)
    // do menor elemento.
    inteiro numeros[5]
    inteiro menor = 0
    inteiro posicao
    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite posição ",i," um número : ")
      leia(numeros[i])
      se(menor == 0){
        menor = numeros[i]
        posicao = i
      }

      se(menor > numeros[i]){
        menor = numeros[i]
        posicao = i
      }

    }
    escreva("\nposição : ",posicao,"\nmenor valor : ",menor)




  }
}
