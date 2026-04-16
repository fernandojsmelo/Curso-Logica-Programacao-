algoritmo "Exercício Repita Ate Número Igual a 0"
//  
//  
// Função :
// Autor : Fernando Melo
// Data : 16/04/2026
// Seção de Declarações 
var

   numero, maiorNumeroDigitado : real

inicio

      maiorNumeroDigitado <- 0
      
      Repita
      
            Escreval("Digite um núemro: ")
            leia( numero )
            
            Se ( numero > maiorNumeroDigitado ) Entao
            
               maiorNumeroDigitado <- numero
            
            FimSe
      
      Ate numero = 0
      
      Escreval("O maior número é: ", maiorNumeroDigitado)

fimalgoritmo
