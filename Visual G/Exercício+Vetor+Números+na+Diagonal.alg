algoritmo "Exercício Vetor Números na Diagonal"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 16/04/2026
// Seção de Declarações 
var

   matriz : vetor[1..3, 1..3] de real
   soma : real
   linha, coluna : inteiro

inicio

      //Armazena os numeros digitados pelo usuário na Matriz
      Para linha de 1 ate 3 Faca
             Para coluna de 1 ate 3 Faca
                   Escreval("Digite o número [Linha: ", linha, " - Coluna: ", coluna, "]")
                   leia(matriz[ linha, coluna ])
             FimPara
      FimPara
      
      //Imprime na tela a nossa tabela
      Para linha de 1 ate 3 Faca
             Para coluna de 1 ate 3 Faca

                   Escreva( matriz[ linha, coluna ] )

             FimPara
             
             Escreval
      FimPara
      
      //Soma os números
      Para linha de 1 ate 3 Faca
             Para coluna de 1 ate 3 Faca

                   soma <- ( matriz[ 1,1 ] + matriz[ 2,1 ] + matriz[ 3,1 ])

             FimPara

             Escreval
      FimPara
      
      Escreval
      Escreval("Soma da diagonal: ", soma)
      

fimalgoritmo
