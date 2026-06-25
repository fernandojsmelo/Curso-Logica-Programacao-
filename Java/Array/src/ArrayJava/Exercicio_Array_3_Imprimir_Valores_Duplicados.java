/*
 
 Crie um algoritmo que percorra os itens de um Array
  de números inteiros e imprima todos os valores duplicados.
 
  */

package ArrayJava;

public class Exercicio_Array_3_Imprimir_Valores_Duplicados {
	
	public static void main(String[] args) {
		
		int[] arrayNumeros = {5, 10, 10, 12, 21, 24, 21, 9, 31, 12};
		
		System.out.println(arrayNumeros.length);
		
		//for - para
		//Contar começa a partir da posição 1 do array - contador_x + 1
		//Assim compara a posição 0 no contador_x com todos os itens do Array a partir da primeira posição
		//O segundo For vai comparar a posição do primeiro For com todos os itens do Array através do segundo For
		for (int contador_x = 0; contador_x < arrayNumeros.length - 1; contador_x++) {
			
			for(int contador_y = contador_x + 1; contador_y < arrayNumeros.length; contador_y++) {
				
				//if - se
				//Compara se a posição 0 é igual a posição 1 && se a posição 0 é diferente da posição 1
				if( (arrayNumeros[contador_x] == arrayNumeros[contador_y]) &&
						(contador_x != contador_y) ) {
					System.out.println("Item duplicado: " + arrayNumeros[contador_y]);
				}
					
				
			}
			
		}
		
	}

}
