package ArrayJava;

import java.util.Arrays;

public class Array_Aula_2 {
	
	public static void main(String[] args) {
		
		//final é uma constante / fixo e pode ser usado em diversas partes
		final int tamanho = 3;
		
		/*
	 	Array é semelhante a criação de várias variáveis
	 	ele faz a mesma coisa / função
	 	
	 	[] - Significa que estou criando um Array
	 	new - Significa que vou instanciar da classe int
		 */
	
		//Array com 3 posições
		int[] precos = new int[tamanho];
		
		precos[0] = 18;
		precos[1] = 45;
		precos[2] = 90;
		
		System.out.println("Imprimindo Array Precos");
		
		//for
		//length - Atributo do array que vai retorna o tamanho do Array
		for(int posicao = 0; posicao < precos.length; posicao++) {
			
			System.out.println("Preco: " + posicao + " : " + precos[posicao]);
			
		}
		
		//-------------------------------
		
		String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		System.out.println("\n\n>>>> For Array Letras <<<<<< ");

		//For utilizado como uma opção para ler itens do Array
		for(String linha : letras) {

			System.out.println(linha);

		}

		//-------------------------------

		int[] numeros = {18, 22, 37, 44, 51, 67, 78, 86, 91, 150};

		System.out.println("\n\n>>>> For Array Numeros <<<<<< ");

		//For utilizado como uma opção para ler itens do Array
		for(int linha : numeros) {

			System.out.println(linha);

		}

		//-------------------------------------
		//fill - Preenche os arrays com um valor pre-determinado
		Arrays.fill(numeros, 5);

		System.out.println("\n\n>>>> For Array fill <<<<<< ");

		//For utilizado como uma opção para ler itens do Array
		for(int linha : numeros) {

			System.out.println(linha);

		}

		//-------------------------------------
		//fill - Preenche os arrays com um valor pre-determinado
		Arrays.fill(letras, "W");

		System.out.println("\n\n>>>> For Array Letras fill <<<<<< ");

		//For utilizado como uma opção para ler itens do Array
		for(String linha : letras) {

			System.out.println(linha);

		}
		
	}

}
