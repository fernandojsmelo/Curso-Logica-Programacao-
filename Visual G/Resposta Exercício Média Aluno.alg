Algoritmo "Resposta Exercício Média Aluno"
// 
//  
// Descrição   : Imprime o nome do Aluno com as 4 notas e a média
// Autor(a)    : Fernando Melo
// Data atual  : 15/4/2026
Var
// Seção de Declarações das variáveis 
   nomeAluno : caractere
   nota1, nota2, nota3, nota4, media : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   Escreval("Digite o nome do Aluno: ")
   leia(nomeAluno)
   
   Escreval("Digite a Nota 1:")
   leia(nota1)
   
   Escreval("Digite a Nota 2:")
   leia(nota2)

   Escreval("Digite a Nota 3:")
   leia(nota3)
   
   Escreval("Digite a Nota 4:")
   leia(nota4)
   
   media <- (nota1 + nota2 + nota3 + nota4)/4
   
   Escreval("Aluno: ", nomeAluno)
   Escreval("Nota 1: ", nota1)
   Escreval("Nota 2: ", nota2)
   Escreval("Nota 3: ", nota3)
   Escreval("Nota 4: ", nota3)
   Escreval("Média : ", media)

Fimalgoritmo