/*
 
 Crie um algoritmo usando While que sorteie um número
  de 0 a 100 e que permita que o usuário tente acertar
  o número que foi sorteado. Se o usuário não acertar,
  deve imprimir uma mensagem informando se o número
  sorteado é maior ou menor que a tentativa feita.
  Quando o usuário acertar, imprima o total de
  tentativas feitas.
 
 */

package Estrtura_Repeticao;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio_While_Sorteio_Numeros {
	
	public static void main(String[] args) {
		
		
		//Random - gera numeros aleatórios
		Random gerador = new Random();
		boolean acertou = false;
		int palpite, tentativas = 0;
		
		int numero = gerador.nextInt(101);
		
		System.out.println("Numero sorteado: " + numero);
		
		//while - enquanto
		while(acertou == false) {
			
			palpite =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número entre 0 e 100", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
			
			//Sempre acrescenta 1
			tentativas++;
			
			//if - se
			if(palpite == numero) {
				
				System.out.println("Acertou em " + tentativas + " tentativas!");
				
				acertou = true;
				
			}else if(palpite > numero) {
				
				System.out.println("O numero digitado e MAIOR que " + numero);
				
			}else {
				
				System.out.println("O numero digitado e MENOR que " + numero);
				
			}
			
		}
		
	}

}
