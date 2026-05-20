programa {
  funcao inicio() {
    // 8) Exiba todos os divisores de um número informado pelo usuário.
    inteiro numero
    escreva("Digite um número : ")
    leia(numero)
    para(inteiro i = 0 ; i < 10 ; i++){
      se(i % numero == 0){
        escreva(i," ")
      }      

    }

  }
}
