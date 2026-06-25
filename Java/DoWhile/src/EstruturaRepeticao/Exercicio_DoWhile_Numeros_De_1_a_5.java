/*
 
 Crie um algoritmo usando DoWhile que solicite
  ao usuário a entrada de N números e só encerre
   o programa quando o usuário digitar um número
    entre 1 e 5.
 
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile_Numeros_De_1_a_5 {
	
	public static void main(String[] args) {
		
		double numero;
		
		//do - faça
		do {
			
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número ou de 1 a 5 para encerrar!"));
		
			//if - se
			if(numero < 1 || numero > 5) {
				
				System.out.println(numero + " numero incorreto! Tente novamente!");
				
			}
			
		//while - enquanto
		//|| - Ou
		}while(numero < 1 || numero > 5);
		
		System.out.println("Muito bem! Algoritmo encerrado!");
		
	}

}
