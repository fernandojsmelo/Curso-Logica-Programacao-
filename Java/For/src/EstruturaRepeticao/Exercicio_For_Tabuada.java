/*
 
 Crie um algoritmo que leia um número digitado
  pelo usuário e imprima a tabuada desse número.
 
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Tabuada {
	
	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número positivo: ", "Tabuada", JOptionPane.QUESTION_MESSAGE));
		
		//for - para
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.printf("%d x %d = %d \n", numero, contador, numero * contador);
			
		}
		
	}

}
