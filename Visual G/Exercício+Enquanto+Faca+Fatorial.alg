algoritmo "Exercício Enquanto Faca Fatorial"
//  
//  
// Função : Enquanto Faca Fatorial
// Autor : Fernando Melo
// Data : 16/01/2022
// Seção de Declarações 
var

   numero, contador : inteiro
   fatorial : real

inicio

      Escreval("Digite um número")
      leia(numero)
      
      contador <- 1
      
      fatorial <- numero
      
      Enquanto ( contador < numero) Faca
      
             fatorial <- fatorial * contador
             
             contador <- contador + 1
      
      FimEnquanto
      
      Escreval ("O fatorial de ", numero, " é ", fatorial, ".")
      

fimalgoritmo
