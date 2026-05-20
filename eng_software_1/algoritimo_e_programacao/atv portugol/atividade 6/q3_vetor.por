programa {
  funcao inicio() {
    // 3) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e mostre a soma de todos os
    // elementos.
    inteiro numeros[5]
    inteiro total_soma = 0
    para(inteiro i = 0 ; i < 5 ; i++){
      
      escreva("Digite ",i+1," um número : ")
      leia(numeros[i])
      total_soma += numeros[i]


    }
    escreva("total da soma é : ",total_soma)
  }
}
