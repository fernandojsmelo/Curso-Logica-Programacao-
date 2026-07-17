/*
Exercício 6

Crie um programa que solicite ao usuário uma sequência 
de números separados por vírgula e calcule a soma desses
 números usando um laço de repetição for
*/

// Primeiro, importamos o módulo 'readline', que fornece uma interface
// para leitura de entrada do usuário através do terminal.
// Este módulo é essencial para criar aplicações interativas que podem
// receber dados digitados pelo usuário.
const readline = require("readline");

// Criamos uma nova interface de readline especificando como a entrada
// de dados será feita pelo teclado do usuário (process.stdin)
// e como a saída de dados será mostrada no terminal do usuário
// (process.stdout).
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// Usamos o método 'question' para fazer uma pergunta ao usuário,
// solicitando que ele insira uma sequência de números separados por
// vírgula.
// A função de callback será chamada assim que o usuário fornecer a
// entrada e pressionar 'Enter'.
rl.question(
  "Digite uma sequência de números separados por vírgula: ",
  function (input) {
    // A string de entrada fornecida pelo usuário é dividida em um
    // array de strings usando a vírgula (',') como delimitador.
    // Isso permite que a entrada do usuário seja manipulada como uma
    // série de valores individuais.
    let numbers = input.split(",");

    // Inicializamos uma variável 'soma' com o valor 0.
    // Esta variável acumulará a soma dos números fornecidos pelo
    // usuário.
    let soma = 0;

    // Iniciamos um loop 'for' para iterar sobre cada elemento do
    // array 'numbers'.
    // A variável 'i' serve como índice para acessar cada elemento do
    // array.
    for (let i = 0; i < numbers.length; i++) {
      // Dentro do loop, convertemos cada elemento do array
      // 'numbers' de string para número usando a função 'Number'.
      // Em seguida, adicionamos o valor numérico à variável 'soma'.
      // Isso acumula o total dos valores fornecidos pelo usuário.
      soma += Number(numbers[i]);
    }

    // Após completar o loop e somar todos os números, exibimos o
    // resultado da soma no console.
    // Utilizamos uma template string para incluir o valor calculado
    // de 'soma' na mensagem de saída.
    console.log(`A soma dos números é: ${soma}`);

    // Por fim, fechamos a interface de readline.
    // Isso é necessário para encerrar a entrada do programa e permitir
    // que o processo do Node.js termine corretamente.
    rl.close();
  },
);
