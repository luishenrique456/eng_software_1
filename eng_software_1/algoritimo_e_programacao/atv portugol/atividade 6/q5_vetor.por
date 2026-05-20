programa {
  funcao inicio() {
    // 5) Declare um vetor de 5 posições do tipo inteiro. Leia os valores e mostre o maior elemento do
    // vetor.
    inteiro numeros[5]
    inteiro maior = 0
    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite ",i+1," um número : ")
      leia(numeros[i])

      se(maior < numeros[i]){
        maior = numeros[i]
      }

    }

    escreva("maior elemento é : ",maior)

    
  }
}
