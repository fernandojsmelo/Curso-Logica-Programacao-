Algoritmo "Comando de Entrada de Dados"
// 
//  
// Descrição   : Comandos de Entrada de Dados
// Autor(a)    : Fernando Melo
// Data atual  : 15/4/2026
Var

   cliente : caractere //Texto
   quantidade : inteiro //1, 2, 3, ...
   preco : real //Aceita casas decimais 1,232222
   produto : caractere // texto
   totalPagar : real //Aceita casas decimais 1,232222


Inicio

      Escreval("Digite o nome do Cliente")
      Leia(cliente)
      
      Escreval("Digite a quantidade de produtos que o cliente comprou")
      Leia(quantidade)
      
      Escreval("Digite o preço do produto")
      Leia(preco)
      
      Escreval("Digite o nome do produto")
      Leia(produto)
      
      totalPagar <- quantidade * preco
      
      escreval("Cliente : ", cliente)
      escreval("Quantidade : ", quantidade)
      escreval("Preço : ", preco)
      escreval("Produto : ", produto)
      escreval("Total a pagar : ", totalPagar)


Fimalgoritmo