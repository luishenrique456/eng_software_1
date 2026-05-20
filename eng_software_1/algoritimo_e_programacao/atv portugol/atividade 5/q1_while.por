programa {
  funcao inicio() {
    // 1) Leia números inteiros até que a soma ultrapasse 100. Exiba a soma final.
    inteiro num 
    inteiro total_soma = 0
    enquanto(total_soma <= 100){
      escreva("Digite um número : ")
      leia(num)
      total_soma += num

    }
    escreva("soma ultrapasse 100 : ",total_soma)

    // se(total_soma > 100){
    //   escreva("soma ultrapasse 100 : ",total_soma)
    // }

  

  }
}
