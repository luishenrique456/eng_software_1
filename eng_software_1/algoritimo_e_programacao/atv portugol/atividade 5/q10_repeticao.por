programa {
  funcao inicio() {
    //10) Leia 10 números e conte quantos são maiores que a média.
    inteiro total_soma = 0
    inteiro media 
    inteiro contador = 0
    para(inteiro i = 0 ; i<10;i++){
      inteiro num
      escreva("\nDigite posição ",i+1," um número : ")
      leia(num)
      
      total_soma += num

      media = total_soma / 10

      se(num > media){
        contador += 1
      }
      
    }
    escreva("total da soma : ",total_soma,"\nmedia : ",media,"\nquantidade números são maiores que a média : ",contador)

  }
}
