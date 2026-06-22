package ComandoDesicaoJava;

import javax.swing.JOptionPane;

public class Switch_Exemplo_2 {
	
	public static void main(String[] args) {
		
		int mes;
		
		//Recebendo o nome da fruta e armazenando na variável
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes entre 1 e 12"));
				
		//switch - Avalia o valor de uma variável e dependendo
		//do resultado ele entra em um caso e executa a ação
		//switch - Selecione Caso		
		switch(mes) {
		
			//caso
			case 1: case 2: case 3: case 4: case 5:
				
				System.out.println("O mes esta entre 1 e 5");
				
				//break - encerrar o programa
				break;
				
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				
				System.out.println("O mes esta entre 6 e 10");
				
				//break - encerrar o programa
				break;
				
			case 11:
			case 12:
				
					System.out.println("Mes 11 ou 12");
				
				//break - encerrar o programa
				break;
				
			//Outro caso
			default:
				
				System.out.println("Mes invalido");
		
		}
		
	}

}
