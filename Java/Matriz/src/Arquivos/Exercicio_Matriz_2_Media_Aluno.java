/*
 
 Crie um algoritmo com uma matriz 3 x 3 que permita
    a entrada de 3 notas de 3 alunos digitadas pelo usuário,
    na sequência, imprima todos as notas que foram digitadas
    e imprima também a média de cada aluno e a 
    situação 
    Aprovado (>=6), 
    Recuperação (>=2) ou 
    Reprovado (<2). 
 
 */

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_2_Media_Aluno {
	
	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		double[][] matrizNotasAlunos = new double[3][3];
		
		
		//for - para
		//Percorrendo todas as linhas
		for(int linha = 0; linha < 3; linha++) {
			
			//Percorrendo todas as colunas
			for(int coluna = 0; coluna < 3; coluna++) {
				
				int numeroNota = 0;
				numeroNota = coluna + 1;
				
				System.out.print("Digite a nota " + numeroNota + ": ");
				matrizNotasAlunos[linha][coluna] = objetoNumero.nextDouble();
				
			}
			
		}
		
		
		//Imprimindo a Matriz
		//Percorrendo todas as linhas
		for(int linha = 0; linha < 3; linha++) {
					
			//Percorrendo todas as colunas
			for(int coluna = 0; coluna < 3; coluna++) {
						
				System.out.print(matrizNotasAlunos[linha][coluna] + "   ");
				
						
			}
			
			System.out.println("");
					
		}
		
		System.out.println("\nCalculando a media de cada aluno\n");
		
		double somaNotas, mediaAluno;
		
		//for - para
		//Percorrendo todas as linhas
		for(int linha = 0; linha < 3; linha++) {
			
			somaNotas = 0;
					
			//Percorrendo todas as colunas
			for(int coluna = 0; coluna < 3; coluna++) {
					
				//Somar as notas das colunas da linha corrente
				somaNotas += matrizNotasAlunos[linha][coluna];
												
			}
			
			int numeroAluno = 0;
			numeroAluno = linha + 1;
			
			mediaAluno = somaNotas / 3;
			System.out.println("Media do aluno " + numeroAluno + " = " + mediaAluno);
				
			//if - se
			if(mediaAluno >= 6) {
				System.out.println("Aluno Aprovado(a)");
			}else if(mediaAluno >= 2) {
				System.out.println("Aluno em Recuperacao");
			}else {
				System.out.println("Aluno Reprovado(a)");
			}
			
			System.out.println("");
			
		}
		
	}

}
