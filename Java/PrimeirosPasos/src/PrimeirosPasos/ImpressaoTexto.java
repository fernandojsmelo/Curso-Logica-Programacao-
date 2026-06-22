//package - Pasta do Projeto
package PrimeirosPasos;

//Todo o programa JAVA é uma classe
//O nome da classe é o mesmo nome do arquivo
//public - Publico
//class - Classe
public class ImpressaoTexto {
	
	//Precisamos criar um método
	//public - Publico
	//static - Istatico
	//void - Retorno / Vazio
	//main - Nome do metodo ele é o principal
	//String - Texto Array
	//args - Nome do array	
	public static void main(String[] args) {
		
		//System.out - É o objeto de saída padrão
		//print - Imprimir
		//\n - É um caracter de escape que faz a quebra de linha
		System.out.print("Olá, mundo!\n");
		
		//ln - posiciona o curso na linha de baixo
		System.out.println("Texto simples");
		System.out.println("Texto simples 2");
		
		/*
		 	f  - Formatted, Formato que permite fazer impressão personalizada
		 	%s - String / Texto
			%d - Inteiro
			%f - Float
			%b - Boleano TRUE ou FALSE
		 */		
		System.out.printf("%s", "Nome: Ana Paula\n");
		System.out.printf("%s idade: %d", "Nome: Ana Paula", 30);
		
		//%n - No printf indica uma quebra de linha
		System.out.printf("%n%nNome: %s %nIdade: %d", "Ana Paula", 30);
		
		//Variavel - Espaço para armazenamento temporário
		int numero1 = 5;
		int numero2 = 10;
		
		System.out.printf("\n\nSoma dos números: %d", (numero1 + numero2));
		
		
	}

}
