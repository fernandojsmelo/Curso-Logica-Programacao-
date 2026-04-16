algoritmo "Exercício Enquanto Faca número for diferente de 5"
//  
//  
// Função : Enquanto Faca número for diferente de 5
// Autor : Fernando Melo
// Data : 16/01/2022
// Seção de Declarações 
var

   numero, resultado : inteiro

inicio

      resultado <- 0
      
      Escreval("Digite um número")
      leia(numero)
      
      Enquanto numero <> 5 Faca
      
             resultado <- resultado + numero
             
             Escreval("Digite um número: ")
             leia(numero)
      
      FimEnquanto
      
      Escreval("Total: ", resultado)

fimalgoritmo
