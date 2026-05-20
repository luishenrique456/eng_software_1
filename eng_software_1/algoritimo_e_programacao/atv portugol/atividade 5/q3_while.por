programa {
  funcao inicio() {
    // 3) Leia valores até que seja informado um número negativo. Exiba o maior valor informado.
    inteiro num
    inteiro maior = 0
    escreva("Digite um número : ")
    leia(num)
    enquanto(num > 0){
      se(num > maior){
        maior = num
      }
      escreva("Digite um número : ")
      leia(num)
      
    }

    escreva("Número maior é : ",maior)

    




  }
}
