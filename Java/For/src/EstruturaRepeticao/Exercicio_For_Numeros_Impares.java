/*
 
 Crie um algoritmo que solicite um número inteiro
  positivo ao usuário e no final imprima os números
   Ímpares do 1 até o número que o usuário digitou.
 
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Numeros_Impares {
	
	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número positivo maior que 1", "Leia com atenção!", JOptionPane.QUESTION_MESSAGE));
		
		
		//for - para
		for(int contador = 1; contador <= numero; contador++) {
			
			//if - se
			//% - Resto
			if(contador % 2 == 1) {
				
				System.out.println("Impar: " + contador);
				
			}
			
			
		}
	}
	

}
