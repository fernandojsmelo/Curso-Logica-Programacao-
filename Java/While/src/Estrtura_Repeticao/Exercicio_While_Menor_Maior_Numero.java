/*
Crie um algoritmo usando While que solicite 
ao usuário a entrada de N números inteiros e 
positivos, no final exiba o menor e o maior 
número digitado.

Obs: Para encerrar o programa, o usuário deve
 digitar um número menor que 0.

 */

package Estrtura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_While_Menor_Maior_Numero {
	
	public static void main(String[] args) {
		
		int numeroDigitado, maior, menor;
		boolean primeiro = true;
		
		numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
		
		menor = numeroDigitado;
		maior = numeroDigitado;
		
		//while - enquanto
		while(numeroDigitado >= 0) {
			
			System.out.println(numeroDigitado);
			
			numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
						
			//if - se
			if(numeroDigitado > maior) {
				
				maior = numeroDigitado;
				
			}
			//if - se
			if(numeroDigitado < menor && numeroDigitado >= 0) {
				
				menor = numeroDigitado;
				
			}
			
		}
		
		System.out.println("Menor numero: " + menor);
		System.out.println("Maior numero: " + maior);
		
	}

}
