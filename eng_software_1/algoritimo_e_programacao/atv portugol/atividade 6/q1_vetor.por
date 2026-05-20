programa {
  funcao inicio() {
  // 1) Declare um vetor de 5 posições do tipo inteiro. Leia os 5 valores e mostre-os na mesma
  //ordem em que foram informados.
  inteiro numeros[5]
  para(inteiro i = 0 ; i < 5 ; i++){
    escreva("Digite ",i+1," um número : ")
    leia(numeros[i])
    
  }

  escreva(numeros)

  }
}
