algoritmo "Exercício Vetor Lista Inversa"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 16/04/2026
// Seção de Declarações 
var

   letrasDigitadas : vetor[1..5] de caractere
   posicaoLetra : inteiro

inicio

      Para posicaoLetra de 1 ate 5 Faca
      
           Escreval("Digite uma letra: ")
           leia( letrasDigitadas[ posicaoLetra ] )
      
      FimPara
      
      Escreval
      Escreval("As letras digitadas foram: ")
      
      Para posicaoLetra de 1 ate 5 Faca
      
           Escreval( letrasDigitadas[ posicaoLetra ] )
      
      FimPara
      
      Escreval
      Escreval("As letras digitadas em orde inversa foram: ")

      Para posicaoLetra de 5 ate 1 passo -1 Faca

           Escreval( letrasDigitadas[ posicaoLetra ] )

      FimPara
      
      


fimalgoritmo
