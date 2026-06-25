/*
 Crie um algoritmo que some todos os itens de um Array 
 e no final calcule a média desses itens.
 */

package ArrayJava;

public class Exercicio_Array_2_Calculo_Soma_Media {
	
	public static void main(String[] args) {
		
		//[] - Significa que estou criando um Array
	 	//new - Significa que vou instanciar da classe double
		double[] numeros = new double[] {5, 12, 14, 20, 40, 90};
		
		double somaItensArray = 0;
		
		//for - para
		for(int posicao = 0; posicao < numeros.length; posicao++) {
			
			somaItensArray = somaItensArray + numeros[posicao];
			
		}
		
		//Soma Itens / Quantidade dos Itens
		double media = somaItensArray / numeros.length;

		System.out.println("Soma: " + somaItensArray);
		System.out.println("Total Itens: " + numeros.length);
		System.out.println("Media: " + media);
		
	}

}
