algoritmo "Exercício Enquanto Faca Tabuada"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 16/04/2026
// Seção de Declarações 
var

   numero, contador : inteiro
   resultado : inteiro
   

inicio

      contador <- 1
      Escreval("Digite o número da Tabuada que deseja ver: ")
      leia(numero)
      
      Enquanto ( contador <= 10 ) Faca
      
              resultado <-  ( numero * contador )
              
              Escreval(numero, " x ", contador, " = ", resultado)
              
              contador <- contador + 1
      
      FimEnquanto

fimalgoritmo
