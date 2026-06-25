/*
 Crie um algoritmo com 2 status: Ligar e Desligar. 
 
�	Ao chamar o status Ligar, verifique se Vocé
       já está numa ligação e exiba uma mensagem
       de ligação Iniciada ou Vocé já está numa ligação.
  
�	Ao chamar o status Desligar, verifique se 
       vocé já está numa ligação e exiba uma mensagem
       de vocé não pode desligar por que não está numa
       ligação ou ligação Encerrada com sucesso.

 */

package MetodosClasses;

public class Exercicio2_Ligacao_Telefonica {

	public static void main(String[] args) {

		//Instanciando para ter acesso
		Telefone ligacao = new Telefone();
		
		ligacao.ligar();
		ligacao.ligar();
		ligacao.desligar();
		ligacao.desligar();
		ligacao.desligar();
		ligacao.ligar();
		ligacao.desligar();
		ligacao.ligar();

	}

}
