algoritmo "Exercício Função Idade para Votar e tirar a Carteira de Habilitação"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 13/01/2022
// Seção de Declarações 
var

   anoNascimento, idade : inteiro

inicio

      Escreval("Digite o ano em que vocë nasceu: ")
      leia(anoNascimento)
      
      idade <- 2022 - anoNascimento
      
      Escreval("Você tem ", idade, " anos.")
      
      Se ( idade >= 18 ) Entao
      
          Escreval("Você já pode Votar.")
          Escreval("Você já pode tirar a carteira de motorista.")
      
      Senao
      
           Se ( idade >= 16 ) Entao
           
                Escreval("Você já pode Votar.")
                Escreval("Você NÃO pode tirar a carteira de motorista.")

           Senao
           
                Escreval("Você NÃO pode Votar e nem tirar a carta de motorista.")

           
           FimSe
      
      FimSe
      

fimalgoritmo
