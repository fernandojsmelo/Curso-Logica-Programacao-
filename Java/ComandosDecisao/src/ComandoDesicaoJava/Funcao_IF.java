//package - Pasta do Projeto
package ComandoDesicaoJava;

public class Funcao_IF {
	
	public static void main(String[] args) {
		
		int numero = 9;
		String nome = "Amanda";
		
		/*
		    == - Igual - Equals
		    != - Diferente
		    > - Maior
		    < - Menor
		    >= - Maior ou igual
		    <= - Menor ou igual
		 */
		
		//if - Se
		if(numero > 10) {
			
			System.out.println("O numero e maior que 10");
			
		//else - Senão
		}else {
			
			System.out.println("Numero menor que 10");
			
		}
		
		if(nome.equals("Ana")) {
			
			System.out.println("O nome e " + nome);
			
		//else - Senão
		}else {
			
			System.out.println("Nome invalido");
			
		}
		
	}

}
