package MetodosClasses;

public class Metodos {

	/*
	 Métodos é uma função que programamos para a classe
	 main ele é o método principal
	 
	 Como criar um método?
	 Indicador de Acesso - public static
	 Tipo de Retorno - void / Nada
	 Nome - main
	 Conjunto de parâmetros desse método - String[] args
	 
	 */
	public static void main(String[] args) {
		
		//Faz a chamada do método e executa a instrução que tem dentro
		mensagem();
		
		//Faz a passagem dos itens para o método
		instrucoes("Estude e treine bastante");
		instrucoes("Assim voce aprende JAVA");
		
		//Faz a passagem de 4 notas e calcula a média
		//Aqui passamos valores do tipo double
		media(10, 8.5, 9, 6.5);
		
		//Sobrecarga de métodos
		//Podemos criar mais de um método com o mesmo nome
		//mas eles devem ter tipos diferentes para serem aceitos
		//Aqui passamos valores do tipo int
		media(10, 8, 9, 6);
		
		int resultado;
		resultado = soma(50, 9);
		
		System.out.println("Resultado da soma: " + resultado);

		//-------------------------------
		
		System.out.println("Resultado: " + somaNumeros(5, 10, 20, 10, 30, 25, 50, 75));
		
	}
	
	//Criamos uma lista de parametros do tipo inteiro
	public static int somaNumeros(int ... numeros) {
		
		int resultado = 0;
		
		for(int posicao = 0; posicao < numeros.length; posicao++) {
			
			resultado = resultado + numeros[posicao];
			
		}
		
		return resultado;
		
		
	}
	
	public static int soma(int valor1, int valor2) {
		
		int resultado = valor1 + valor2;
		
		//return - Retorna o resultado da operação
		return resultado;
		
	}
	
	/*
	 public - Tenho acesso a esse método fora da classe
	 Se o método main é static ou outros também terão que ser static
	 
	 */
	public static void media(double nota1, double nota2, double nota3, double nota4) {
		
		double media;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Media final com Double: " + media);
		
	}
	
	public static void media(int nota1, int nota2, int nota3, int nota4) {
		
		int media;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Media final com Int: " + media);
		
	}
	
	//Indicador de Acesso - public static
	//Tipo de Retorno - void / Nada
	//Nome - mensagem
	public static void mensagem() {
		
		System.out.println("Boa noite, estou aprendendo sobre Metodos");
		
	}
	
	//Nesse caso criamos o método com um parametro de entrada
	//String texto - recebe o texto que vem do método main e exibe na
	//tela com o auxilio do System.out.println
	public static void instrucoes(String texto) {
		
		System.out.println(texto);
		
		
	}

}
