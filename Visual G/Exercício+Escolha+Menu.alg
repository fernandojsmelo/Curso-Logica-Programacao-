algoritmo "Exercício Escolha Menu"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 20/01/2022
// Seção de Declarações 
var

   numero1, numero2, resultado : real
   operacao : inteiro

inicio

      Escreval("Escolha uma opção!")
      Escreval("1 - Soma")
      Escreval("2 - Subtrair")
      Escreval("3 - Dividir")
      Escreval("4 - Multiplicar")
      leia(operacao)
      
      Se ( (operacao >= 1) e (operacao <= 4)) Entao


            Escreval
            Escreval
            Escreval("Digite o número 1: ")
            leia(numero1)
            Escreval("Digite o número 2: ")
            leia(numero2)

            Escolha operacao

                    Caso 1

                        resultado <- numero1 + numero2

                    Caso 2

                        resultado <- numero1 - numero2

                    Caso 3

                         Se ((numero1 = 0) ou (numero2 = 0)) Entao
                            Escreval("Erro ao dividir o núemro")
                         Senao
                            resultado <- numero1 / numero2
                         FimSe

                    Caso 4


                         resultado <- numero1 * numero2

            FimEscolha
      
            Escreval("Total: ", resultado)
      
      Senao
      
           Escreval("Escolha Incorreta!")
      
      FimSe

fimalgoritmo
