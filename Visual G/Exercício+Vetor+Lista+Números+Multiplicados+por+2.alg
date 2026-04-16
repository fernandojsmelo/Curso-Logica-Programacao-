algoritmo "Exercício Vetor Lista Números Multiplicados por 2"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 16/04/2026
// Seção de Declarações 
var

   vatorNumero1 : vetor [1..5] de inteiro
   vetorNumero2 : vetor [1..5] de inteiro
   
   posicaoNumeroVetor : inteiro

inicio

     Para posicaoNumeroVetor de 1 ate 5 Faca
     
          Escreval("Digite um número: ")
          leia( vatorNumero1[ posicaoNumeroVetor ] )
          vetorNumero2[ posicaoNumeroVetor ]  <- vatorNumero1[ posicaoNumeroVetor ] * 2
     
     FimPara
     
     Escreval
     Escreval("Resultado:")

     Para posicaoNumeroVetor de 1 ate 5 Faca
     
          Escreval( "Vetor 1: ", vatorNumero1[ posicaoNumeroVetor ], " - Vetor 2: ", vetorNumero2[ posicaoNumeroVetor ])
     
     FimPara

fimalgoritmo
