/*
 Crie um algoritmo que leia um número e 
 verifique se ele é PAR ou ÍMPAR.
 */

package ComandoDesicaoJava;

import java.util.Scanner;

public class Exercicio_If_Par_Impar {
	
	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		int numero;
		
		//Imprime a mensagem na tela
		System.out.println("Digite um numero inteiro");
		
		//nextInt - Lê o texto e retorna como inteiro na variavel
		numero = objetoNumero.nextInt();
		
		//if - se
		if(numero % 2 == 0) {
			
			System.out.println("Numero " + numero + ", PAR");
			
		}else {
			
			System.out.println("Numero " + numero + ", IMPAR");
			
		}
	}

}
