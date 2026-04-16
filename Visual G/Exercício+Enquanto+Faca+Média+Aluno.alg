algoritmo "Exercício Enquanto Faca Média Aluno"
//  
//  
// Função : Exercício Enquanto Faca Média Aluno
// Autor : Fernando Melo
// Data : 16/01/2022
// Seção de Declarações 
var

   nota, somaNotas : real
   nomeAluno : caracter
   contador : inteiro

inicio

     nota <- 0
     
     Escreval("Digite o nome do aluno: ")
     leia(nomeAluno)
     
     contador <- 1
     
     Enquanto ( contador < 5 ) Faca
     
              Escreval("Digite a nota ", contador, ": ")
              leia(nota)
              
              somaNotas <-  somaNotas + nota
              contador <- contador + 1
     
     FimEnquanto
     
     Escreval("Aluno: ", nomeAluno)
     Escreval("Média: ", somaNotas/4)

fimalgoritmo
