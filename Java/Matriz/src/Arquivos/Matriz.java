package Arquivos;

public class Matriz {
	
	public static void main(String[] args) {
		
		//[][] - Matriz
		//[] - Array
		//Matriz - Linhas e Coluna
		//Primeiro índice é as linhas
		//Segundo índice é as colunas
		//Cada linha da matriz é um Array
		//Se tiver 8 linhas é 8 Arrays
		int[][] numeros = new int[3][4];
		
		//Populando a matriz
		//for - para
		//Percorre as linhas
		for( int linha = 0; linha < 3; linha++ ) {
			
			//Percorre as colunas
			for(int coluna = 0; coluna < 4; coluna++ ) {
				
				//Estou colando o valor 5 em cada item da Matriz
				numeros[linha][coluna] = 5;
				
			}
			
		}
		
		//Imprimindo a matriz
		//for - para
		//Percorre as linhas
		for( int linha = 0; linha < 3; linha++ ) {
					
			//Percorre as colunas
			for(int coluna = 0; coluna < 4; coluna++ ) {
						
				//Estou colando o valor 5 em cada item da Matriz
				System.out.print(numeros[linha][coluna] + "  "); 
						
			}
			
			System.out.println("");
					
		}
		
		//--------------------------------------
		
		int linhas = 3;
		int colunas = 4;
		
		//[][] - Matriz
		//Matriz - Linhas e Coluna		
		String[][] matrizLetras = new String[linhas][colunas];
		String[] array_1 = {"A", "B", "C", "D"};
		String[] array_2 = {"E", "F", "G", "H"};
		String[] array_3 = {"I", "J", "K", "L"};
		
		matrizLetras[0] = array_1;
		matrizLetras[1] = array_2;
		matrizLetras[2] = array_3;
		
		System.out.println("");
		
		//Imprimindo a matriz
		//for - para
		//Percorre as linhas
		for( int linha = 0; linha < linhas; linha++ ) {
							
			//Percorre as colunas
			for(int coluna = 0; coluna < colunas; coluna++ ) {
								
				//Estou colando o valor 5 em cada item da Matriz
				System.out.print(matrizLetras[linha][coluna] + "  "); 
								
			}
					
			System.out.println("");
							
		}
		
		
		
	}

}
