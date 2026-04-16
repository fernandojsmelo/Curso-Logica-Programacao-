algoritmo "Exercício Vetor Soma Números"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 16/04/2026
// Seção de Declarações 
var

   numerosDigitados : vetor [1..5] de inteiro
   contador, total : inteiro

inicio

      Para contador de 1 ate 5 Faca
      
           Escreval("Digite um número: ")
           leia( numerosDigitados[ contador ] )
           
           total <- total + numerosDigitados[ contador ]
      
      FimPara
      
      
      Escreval
      Escreval("A soma dos números é: ", total)
      Escreval
      Escreval("Os números digitados foram: ")
      
      Para contador de 1 ate 5 Faca
      
           Escreval("Número posição ", contador, " = ", numerosDigitados[ contador ])
      
      FimPara


fimalgoritmo
