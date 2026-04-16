algoritmo "Exercício Vetor Pesquisa Número"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 16/04/2026
// Seção de Declarações 
var

   listaNumerosVetor: vetor [1..5]  de inteiro
   numeroPesquisa, posicao : inteiro

inicio

      //Prenchendo os dados no Vetor
     Para posicao de 1 ate 5 Faca
     
          Escreval("Digite o número ", posicao )
          leia(listaNumerosVetor[ posicao ])

     FimPara
     
     Escreval
     Escreval
     Escreval("Digite um número para pesquisar: ")
     leia(numeroPesquisa)
     
     posicao <- 1
     
     //Busca o número digitado para pesquisa
     Enquanto ( posicao < 5 ) e ( listaNumerosVetor[ posicao ] <> numeroPesquisa )  Faca
     
              posicao <- posicao + 1
     
     FimEnquanto
     
     //Imprime na tela a posição que o número está
     Se listaNumerosVetor[ posicao ] = numeroPesquisa Entao
     
        Escreval("Número encontrado na posição: ", posicao )
     
     Senao
     
     
        Escreval("Número não encontrado.")
     
     FimSe

fimalgoritmo
