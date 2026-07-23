/*
Exercício 7

Faça um programa que imprima os caracteres de 
uma string de trás para frente usando um laço de repetição for.
*/

// Primeiro, importamos o módulo 'readline' do Node.js.
// Este módulo fornece funcionalidades para criar uma interface de
// linha de comando (CLI), permitindo a leitura de entradas do usuário
// e a exibição de saídas no terminal.
const readline = require("readline");

// Criamos uma nova interface de readline especificando como a entrada
// de dados será feita pelo teclado do usuário (process.stdin)
// e como a saída de dados será mostrada no terminal do usuário
// (process.stdout).
// Isso configura o ambiente para interagir com o usuário através do
// terminal.
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// Utilizamos o método 'question' para fazer uma pergunta ao usuário,
// solicitando a inserção de uma string.
// A função de callback é chamada assim que o usuário fornecer a
// entrada e pressionar 'Enter'.
rl.question("Digite uma string para ser invertida: ", function (inputString) {
  // Inicializamos uma variável 'inverterTexto' com uma string vazia.
  // Esta variável será usada para construir a versão invertida da
  // string fornecida pelo usuário.
  let inverterTexto = "";

  // Iniciamos um loop 'for' que começa no último caractere da
  // string fornecida e continua até o primeiro caractere.
  // A expressão 'inputString.length - 1' calcula o índice do último
  // caractere da string.
  for (let i = inputString.length - 1; i >= 0; i--) {
    // Dentro do loop, concatenamos cada caractere da string
    // original à 'inverterTexto', começando pelo último caractere
    // e movendo em direção ao primeiro.
    // Isso efetivamente constrói a string invertida, caractere
    // por caractere.
    inverterTexto += inputString[i];
  }

  // Após completar a inversão da string, exibimos a string
  // invertida no console.
  // Utilizamos uma template string para incluir o valor de
  // 'inverterTexto' na mensagem de saída.
  console.log(`String invertida: ${inverterTexto}`);

  // Por fim, fechamos a interface de readline.
  // Fechar a interface é um passo necessário para encerrar o
  // programa e liberaro terminal para outras operações.
  rl.close();
});
