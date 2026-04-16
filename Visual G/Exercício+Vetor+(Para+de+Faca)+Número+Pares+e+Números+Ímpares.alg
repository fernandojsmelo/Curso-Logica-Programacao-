algoritmo "Exercício Vetor (Para de Faca) Número Pares e Números Ímpares"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 16/04/2026
// Seção de Declarações 
var

   vetorNumerosPares : vetor[1..4] de inteiro
   vetorNumerosImpares : vetor[1..4] de inteiro
   numeroDigitado, posicaoNumero : inteiro

inicio

      Para  posicaoNumero de 1 ate 4 Faca
      
            Escreval("Digite um número: ")
            leia(numeroDigitado)
            
            Se ( numeroDigitado % 2 = 0) Entao
                 vetorNumerosPares[ posicaoNumero ] <- numeroDigitado
            Senao
                 vetorNumerosImpares[ posicaoNumero ] <- numeroDigitado
            FimSe
      
      FimPara
      
      Escreval
      Escreval
      Escreval("Números Pares: ")
      Para posicaoNumero de 1 ate 4 Faca
      
           Escreval(vetorNumerosPares[ posicaoNumero ])
      
      FimPara
      
      //--------------
      
      Escreval
      Escreval
      Escreval("Números Impares: ")
      Para posicaoNumero de 1 ate 4 Faca

           Escreval(vetorNumerosImpares[ posicaoNumero ])

      FimPara

fimalgoritmo
