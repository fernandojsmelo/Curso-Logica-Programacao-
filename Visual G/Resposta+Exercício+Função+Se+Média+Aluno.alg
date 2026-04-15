algoritmo "Resposta Exercício Função Se Média Aluno"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 12/01/2022
// Seção de Declarações 
var

   nota1, nota2, nota3, nota4, media, notaRecuperacao, mediaRecuperacao : real

inicio

      Escreval("Digite a nota 1 do aluno: ")
      leia( nota1 )
      
      Escreval("Digite a nota 2 do aluno: ")
      leia( nota2 )
      
      Escreval("Digite a nota 3 do aluno: ")
      leia( nota3 )
      
      Escreval("Digite a nota 4 do aluno: ")
      leia( nota4 )
      
      media <- ( nota1 + nota2 + nota3 + nota4 ) / 4
      
      Se ( media >= 7 ) Entao
      
           Escreval("O aluno foi aprovado com a média: ", media)
      
      Senao
      
           Escreval( "O aluno ficou em recuperação, tirou a média: ", media )
           Escreval
           Escreval
           Escreval
           Escreval("Digite a nota que o aluno tirou na recuperação: ")
           leia( notaRecuperacao )
           
           mediaRecuperacao <- ( media + notaRecuperacao ) / 2
           
           Se ( mediaRecuperacao >= 7) Entao
           
                Escreval("Média: ", media)
                Escreval("Nota Recuperação: ", notaRecuperacao)
                Escreval("O aluno foi aprovado sua média é: ", mediaRecuperacao)
           
           Senao
           
                Escreval("Média: ", media)
                Escreval("Nota Recuperação: ", notaRecuperacao)
                Escreval("O aluno NÂO foi aprovado sua média é: ", mediaRecuperacao)
           
           FimSe
      
      FimSe

fimalgoritmo
