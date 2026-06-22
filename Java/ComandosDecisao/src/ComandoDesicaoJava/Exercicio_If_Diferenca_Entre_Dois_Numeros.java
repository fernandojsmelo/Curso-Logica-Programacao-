/*

Crie um algoritmo que leia dois números 
e apresente a diferença entre eles.

 */

package ComandoDesicaoJava;

import javax.swing.JOptionPane;

public class Exercicio_If_Diferenca_Entre_Dois_Numeros {
	
	public static void main(String[] args) {
		
		int numero1, numero2, diferenca;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		
		//if - Se
		if(numero1 >= numero2) {
			
			diferenca = numero1 - numero2;
			
			System.out.println("------- Resposta Exercicio ------");
			System.out.println("\n\nNumero 1: " + numero1);
			System.out.println("Numero 2: " + numero2);
			System.out.println("Diferenca: " + numero1 + " - " + numero2 + " = " + diferenca);
			
			
		//else - senão
		}else {
			
			diferenca = numero2 - numero1;
			
			System.out.println("------- Resposta Exercicio ------");
			System.out.println("\n\nNumero 1: " + numero1);
			System.out.println("Numero 2: " + numero2);
			System.out.println("Diferenca: " + numero2 + " - " + numero1 + " = " + diferenca);
			
			
		}
			
		
		
		
	}

}
