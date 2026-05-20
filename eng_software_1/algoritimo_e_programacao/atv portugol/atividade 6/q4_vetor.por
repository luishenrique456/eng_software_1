programa {
  funcao inicio() {
    // 4) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e mostre a média aritmética
    // dos elementos.
    inteiro numeros[5]
    inteiro media
    inteiro total_soma = 0
    inteiro quantidade = 0
    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite ",i+1," um número : ")
      leia(numeros[i])
      total_soma += numeros[i]
      quantidade += 1
    }
    
    media = total_soma / quantidade

    escreva("média aritmética : ",media)

  }
}
