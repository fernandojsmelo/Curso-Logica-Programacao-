/*
 
 Crie um algoritmo de um caixa eletrónico
 que aceite apenas o nome do cliente, dep�sitos e saques.
 
 */

package MetodosClasses;

public class Exercicio1_Caixa_Eletronico {

	public static void main(String[] args) {

		Conta operacao = new Conta();
		
		operacao.nome = "Roger";
		operacao.saldo = 100.0;
		
		System.out.println("Cliente: " + operacao.nome);
		System.out.println("Saldo atual: " + operacao.saldo);
		System.out.println("\n---------------");
		
		//-------------------------------------------
		
		operacao.depositar(200); 
		
		System.out.println("Saldo atual: " + operacao.saldo);
		System.out.println("\n---------------");
		
		//-------------------------------------------
		
		operacao.sacar(150); 
				
		System.out.println("Saldo atual: " + operacao.saldo);
		System.out.println("\n---------------");
		
		//-------------------------------------------
		
		operacao.sacar(25); 
						
		System.out.println("Saldo atual: " + operacao.saldo);
		System.out.println("\n---------------");
		
		//-------------------------------------------
		
		operacao.depositar(25.75); 
								
		System.out.println("Saldo atual: " + operacao.saldo);
		System.out.println("\n---------------");


	}

}
