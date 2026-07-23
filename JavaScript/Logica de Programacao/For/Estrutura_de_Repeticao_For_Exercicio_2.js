/*
Exercício 2

Crie um programa que calcule a soma dos números de 1 a 100 usando um laço de repetição for.
*/

// Inicializamos uma variável chamada 'soma' com o valor 0.
// Esta variável servirá como acumulador, armazenando a soma progressiva dos números de 1 a 100.
let soma = 0;

// Iniciamos um loop 'for' que servirá para iterar sobre os números de 1 a 100.
// A iteração começa em 1 e vai até 100, inclusive, incrementando o valor de 'i' em 1 a cada passo.
for (let i = 1; i <= 100; i++) {
  // Dentro do loop, somamos o valor atual de 'i' ao acumulador 'soma'.
  // O operador '+=' soma o valor de 'i' ao valor atual de 'soma', atualizando 'soma' com o novo total.
  // soma = soma + i
  soma += i;
}

// Após a conclusão do loop, quando todos os números de 1 a 100 foram somados,
// imprimimos o resultado final da soma acumulada na variável 'soma'.
// Utilizamos uma template string para criar uma mensagem formatada que inclui o valor de 'soma'.
console.log(`A soma dos números de 1 a 100 é: ${soma}`);
