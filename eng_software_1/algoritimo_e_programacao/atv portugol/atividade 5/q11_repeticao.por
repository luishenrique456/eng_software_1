programa {
  funcao inicio() {
    //11) Leia valores até que seja digitado zero e informe quantos são divisíveis por 4.

    inteiro numero
    inteiro contador = 0

    escreva("digite número zero ( 0 ) para encerrar programa\n")
    escreva("Digite um número : ")
    leia(numero)

    enquanto(numero != 0){
      escreva("Digite um número : ")
      leia(numero)

      se(numero % 4 == 0){
        contador += 1
      }

      
    }

    escreva("quantidade de números divisíveis por 4 : ",contador)

  }
}
