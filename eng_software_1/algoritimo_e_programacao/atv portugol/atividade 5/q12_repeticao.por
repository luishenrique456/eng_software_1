programa {
  funcao inicio() {
    //12) Leia 5 números e informe quantos são positivos e quantos são negativos.
    inteiro contador_positivo = 0
    inteiro contador_negativo = 0
    inteiro numero
    para(inteiro i = 0; i<5;i++){
      escreva("Digite ",i+1," um número : ")
      leia(numero)
      se(numero > 0){
        contador_positivo += 1
      }senao{
        contador_negativo += 1
      }
    }

    escreva("quantidade números positivos : ",contador_positivo,"\nquantidade números negativos : ",contador_negativo)

  }
}
