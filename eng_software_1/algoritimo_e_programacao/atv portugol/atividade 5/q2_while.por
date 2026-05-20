programa {
  funcao inicio() {
    // 2) Leia números enquanto forem positivos. Ao final, informe quantos números foram digitados.
    inteiro num 
    inteiro qtd = 0
    escreva("Digite um número : ")
    leia(num)
    enquanto(num > 0){
      qtd += 1
      escreva("Digite um número : ")
      leia(num)
      
      
      
    }

    
    escreva("quantidade de números positivos digitados : ",qtd)
    
    

    
  }
}
