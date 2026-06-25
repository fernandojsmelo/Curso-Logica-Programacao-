package MetodosClasses;

//Classe
//public - Modificador de acesso - public / privat / protected
//class - Indentifica para o Java que é uma classe
//Nome - Escola
public class Escola {
	
	/*
	 Dentro da classe eu posso criar quantos objetos / atributos eu quiser
	 
	 Exemplo:
	 
	 - Posso criar outras escolas com objetos e cada objeto será
	 um objeto separado possuindo suas próprias características
	 só todos vão seguir as regras da classe
	 */
	
	public Escola(int aluno) {
		
		System.out.println("Aluno: " + aluno);
		
	}
	
	public void imprimirNumeros(int valorInicio, int valorFinal) {
		
		//for - para
		for(int contador = valorInicio; contador <= valorFinal; contador+=20) {
			
			System.out.println("Numero: " + contador);
			
		}
		
	}

}
