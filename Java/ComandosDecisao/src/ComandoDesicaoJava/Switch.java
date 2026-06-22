package ComandoDesicaoJava;

import javax.swing.JOptionPane;

public class Switch {
	
	public static void main(String[] args) {
		
		String fruta;
		
		//Recebendo o nome da fruta e armazenando na variável
		fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta");
		
		//switch - Avalia o valor de uma variável e dependendo
		//do resultado ele entra em um caso e executa a ação
		//switch - Selecione Caso
		switch(fruta) {
		
			//case - caso
			case "Banana": {
				
				System.out.println("Voce digitou Banana!");
				
				//break - encerrar o programa
				break;
				
			}
				
			case "Laranja": {
				
				System.out.println("Voce digitou Laranja!");
				
				//break - encerrar o programa
				break;
				
			}
				
			case "Uva": {
				
				System.out.println("Voce digitou Uva!");
				
				//break - encerrar o programa
				break;
				
			}
				
			default: {
				
				System.out.println("Voce nao digitou uma fruta valida!");
				
				
				
			}
		
		}
		
	}

}
