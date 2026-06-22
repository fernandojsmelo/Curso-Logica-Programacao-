/*
 
 Crie um algoritmo que solicite ao usuário 
 o nome e a senha e na sequência, verifique 
 se o nome é Roger e se a senha é 123 e se for, 
 exiba a mensagem Logado com sucesso!
 
 */

package ComandoDesicaoJava;

import java.util.Scanner;

public class Exercicio_If_Login_Senha {
	
	public static void main(String[] args) {
		
		Scanner objetoLogin = new Scanner(System.in);
		
		//Login / nome
		System.out.println("Digite seu nome: ");
		String nome = objetoLogin.nextLine();
		
		//Senha
		System.out.println("Digite sua senha: ");
		String senha = objetoLogin.nextLine();
		
		//&& - E
		//if - se
		if(nome.equals("Roger") && senha.equals("123")) {
			
			System.out.printf("Usuario %s logado com sucesso!", nome);
			
		//else - senão
		}else {
			
			System.out.println("Usuario ou senha invalidos!");
			
		}
		
	}

}
