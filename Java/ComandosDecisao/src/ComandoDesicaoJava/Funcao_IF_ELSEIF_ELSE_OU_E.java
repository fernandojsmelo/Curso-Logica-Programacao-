package ComandoDesicaoJava;

import javax.swing.JOptionPane;

public class Funcao_IF_ELSEIF_ELSE_OU_E {
	
	public static void main(String[] args) {
		
		/*
		 || - Ou
		 && - E
		 */
		
		/*
		String fruta;
		
		//Ctrl + Barra de Espaço
		fruta = JOptionPane.showInputDialog("Digite o nome da fruta:");
		
		//if - se
		if(fruta.equals("Maça") || fruta.equals("Banana")) {
			
			JOptionPane.showMessageDialog(null, "A fruta e " + fruta);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "fruta invalida");
			
		}
		*/
		
		//&& - E
		
		String fruta_1, fruta_2;
		
		//Recebendo o nome das frutas e armazenando nas variaveis
		fruta_1 = JOptionPane.showInputDialog("Digite o nome da primeira Fruta");
		fruta_2 = JOptionPane.showInputDialog("Digite o nome da segunda Fruta");
		
		//if - se
		if(fruta_1.equals("Maça") && fruta_2.equals("Banana")){
			
			System.out.println("A fruta 1 e Maca e a Fruta 2 e Banana");
			
		}else {
			
			System.out.println("Voce nao digitou as duas frutas corretamente!");
			
			
		}
		
	}

}
