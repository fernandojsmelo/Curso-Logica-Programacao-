package EstruturaRepeticao;

public class For {
	
	public static void main(String[] args) {
		
		/*
		 
		 Só usamos o for quando soubermos quantas vezes usar esse comando
		 int contador = 1 - Configura a variável para servir de contador
		 contador <= 10 - Condição para continuar a execução
		 contador++ - Incremento até o contador atingir o resultado esperado
		 Inicialização / Controle / Incremento
		 */
		
		/*
		//for - Para
		for(int uva = 1; uva <= 10; uva++) {
			
			System.out.println("Numero: "+uva);
			
		}
		*/
		
		/*
		for(int contador = 10; contador >= 1; contador--) {
			
			System.out.println("Numero: " + contador);
			
		}
		*/
		
		for(int contador = 2; contador <= 10; contador+=2) {
			
			System.out.println("Numero: " + contador);
			
		}
		
		//contador++
		//contador = contador + 1
		//contador+=1
		
	}

}
