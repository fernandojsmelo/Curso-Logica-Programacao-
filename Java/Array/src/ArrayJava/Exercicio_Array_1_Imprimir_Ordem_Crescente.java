/*
 
 Crie um algoritmo que solicite ao usuário a entrada
  de 3 números inteiros e imprima na tela os valores
  na ordem em que foram digitados, depois imprima
  também os números na ordem crescente.
 
 */

package ArrayJava;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercicio_Array_1_Imprimir_Ordem_Crescente {
	
	public static void main(String[] args) {
		
		int qtdVezes = 3;
		
		//[] - Significa que estou criando um Array
	 	//new - Significa que vou instanciar da classe int
		int[] arrayNumeros = new int[qtdVezes];
		
		//for - para
		for(int posicao = 0; posicao < qtdVezes; posicao++ ) {
			
			arrayNumeros[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
			
		}
		
		System.out.println("Numeros na ordem digitada \n");
		
		for(int posicao :  arrayNumeros) {
			
			System.out.println(posicao);
			
		}
		
		//---------------------------------------
		
		System.out.println("Numeros na ordem Crescente \n");
		
		//sort - Método para organizar os números em ordem crescente
		Arrays.sort(arrayNumeros);
		
		for(int posicao :  arrayNumeros) {
			
			System.out.println(posicao);
			
		}
		
	}

}
