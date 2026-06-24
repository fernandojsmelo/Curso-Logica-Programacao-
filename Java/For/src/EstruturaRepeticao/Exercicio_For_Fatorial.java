/*
 
 Crie um algoritmo que solicite um número inteiro
  positivo ao usuário e na sequência, calcule e 
  exiba o número do fatorial.

Obs: O fatorial é por exemplo se digitar 5:
 1 * 2 * 3 * 4 * 5 = 120

 
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Fatorial {
	
	public static void main(String[] args) {
		
		int numero, fatorial;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro positivo: ", "Leia com atenção!", JOptionPane.QUESTION_MESSAGE));
		
		fatorial = 1;
		
		//for - para
		for(int contador = numero; contador >= 1; contador--) {
			
			//fatorial = fatorial * contador;
			System.out.printf("%d x %d = %d \n", fatorial, contador, fatorial = fatorial * contador );
			
			
		}
		
		System.out.println("O fatorial do " + numero + ": " + fatorial);
		
	}

}
