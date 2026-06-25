/*
 
 Crie um algoritmo com uma matriz de String/Texto
    onde será entrevistado pessoas, o algoritmo deverá
    perguntar ao usuário quantas pessoas deverão ser
    entrevistadas e quantos filhos cada pessoa tem. 
    Para cada pessoa, o algoritmo deverá armazenar o nome
    de cada filho e por último, imprima a pessoa,
    a quantidade e o nome de cada filho que ela tem.
 
 */

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_3_Pessoas_Entrevistadas {
	
	public static void main(String[] args) {
		
		Scanner scannerPessoa = new Scanner(System.in);
		
		int numeroPessoasEntrevistadas = 0;
		int quantidadeFilhos = 0;
		
		System.out.println("Digite o numero de pessoas que serão entrevistadas");
		numeroPessoasEntrevistadas = scannerPessoa.nextInt();
		
		//Matriz com apenas linhas
		String[][] nomesFilhos = new String[numeroPessoasEntrevistadas][];
		
		//for - para
		//nomesFilhos.length - Tamanho da matriz
		for(int linha = 0; linha < nomesFilhos.length; linha++) {
			
			int numeroDaPessoa = 0;			
			numeroDaPessoa = linha + 1;
			
			System.out.println("Digite a quantidade de filhos que a pessoa " + numeroDaPessoa + " tem");
			quantidadeFilhos = scannerPessoa.nextInt();
			
			//Matriz adiciona na linha atual a quantidade de colunas
			nomesFilhos[linha] = new String[quantidadeFilhos];
			
			//nomesFilhos[linha].length - Contando quantas colunas tem na linha
			for(int coluna = 0; coluna < nomesFilhos[linha].length; coluna++) {
				
				int numeroDoFilho = 0;			
				numeroDoFilho = coluna + 1; 
				
				System.out.println("Digite o nome do filho " + numeroDoFilho + " da pessoa " + numeroDaPessoa);
				nomesFilhos[linha][coluna] = scannerPessoa.next();
			}
			
		}
		
	
		//Imprimindo os itens da matriz
		for(int linha = 0; linha < nomesFilhos.length; linha++) {
			
			int numeroDaPessoa = 0;			
			numeroDaPessoa = linha + 1;
			
			System.out.println("Pessoa " + numeroDaPessoa + " tem " + nomesFilhos[linha].length + " filhos");
			
			//nomesFilhos[linha].length - Total de colunas
			for(int coluna = 0; coluna < nomesFilhos[linha].length; coluna++) {
				
				System.out.println(nomesFilhos[linha][coluna]);
				
			}
			
		}
	}

}
