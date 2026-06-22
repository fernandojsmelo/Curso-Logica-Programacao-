/*
Crie um algoritmo que leia dois números
 e imprima-os em ordem decrescente.
 */

package ComandoDesicaoJava;

import javax.swing.JOptionPane;

public class Exercicio_If_Ordem_Decrescente {
	
	public static void main(String[] args) {
		
		int numero1, numero2;
		
		//Recebe os numeros e armazena nas variaveis
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		//if - Se
		if(numero1 >= numero2) {
			
			System.out.println(numero1 + "\n" + numero2);
		
		//else - senão
		}else {
			
			System.out.println(numero2 + "\n" + numero1);
			
		}
		
	}

}
