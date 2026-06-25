package MetodosClasses;

public class Telefone {
	
	//boolean - Verdadeiro ou Falso
	//false - Com a ligação desligada
	boolean ligada = false;
	
	void ligar() {
		
		//if - se
		if(ligada == true) {
			
			System.out.println("Vocé já está em uma ligação");
			
		}else {
			
			ligada = true;
			
			System.out.println("Ligação Iniciada");
			
			
		}
		
	}
	
	void desligar() {
		
		//if - se
		//true - significa que estou numa ligação
		//false - significa que não estou numa ligação
		if(ligada == true) {
					
			System.out.println("Ligação Encerrada com sucesso!");
			ligada = false;
			
		}else {
					
								
			System.out.println("Vocé não pode desligar por que não está em uma ligação");
					
					
		}
		
	}

}
