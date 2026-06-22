package PrimeirosPasos;

import java.util.Scanner;

public class Scanner1 {
	
	public static void main(String[] args) {
		
		//new Scanner - Instancia um objeto da classe
		//System.in - Lê as informações do teclado
		//Scanner - Objeto da classe Scanner
		java.util.Scanner objetoNome = new java.util.Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		//Ler o que o usuário digitar e armazenar na variável nome
		String nome = objetoNome.nextLine();
		
		//-------------------------------------------
		
		System.out.println("Digite sua idade: ");
		
		//Ler o que o usuário digitar e armazenar na variável nome
		int idade = objetoNome.nextInt();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Idade: " + idade);
		
		/*
		 
		 	nextLine - Armazena textos
		 
		 */
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int numeroInteiro     = scanner.nextInt();
		byte numeroByte       = scanner.nextByte();
		long numeroLong       = scanner.nextLong();
		boolean numeroBoleano = scanner.nextBoolean();
		float numeroFloat     = scanner.nextFloat();
		double numeroDouble   = scanner.nextDouble();
		
	}

}
