programa {
  funcao inicio() {
    // 2) Declare um vetor de 6 posições do tipo inteiro. Leia os valores e mostre-os na ordem inversa
    // (da última posição para a primeira).
    inteiro numeros[6]
    para(inteiro i = 0 ; i < 6 ; i++){
      escreva("Digite ",i," um número : ")
      leia(numeros[i])
    }

    para(inteiro i = 5 ; i >= 0; i--){
      
      escreva(numeros[i]," ")  
                             
    }
    



  }
}
