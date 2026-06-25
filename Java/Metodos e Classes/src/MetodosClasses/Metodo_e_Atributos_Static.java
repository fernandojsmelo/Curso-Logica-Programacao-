package MetodosClasses;

public class Metodo_e_Atributos_Static {

	public static void main(String[] args) {

		/*
			 Quando crio um elemento e defino para Static eu posso
			 Instaciar vários objetos dessa classe, mas todos que
			 eu instanciar, vão apontar para o mesmo endereço da
			 memória, é como se eu tivesse várias variáveis e quando
			 eu altero o valor de uma, todas as variáveis que estão
			 a usar receberão o mesmo valor
		 */
		
		System.out.println(Pao.quantidadePao);
		Pao pao1 = new Pao("Francós", 20, "Pequeno");
		Pao pao2 = new Pao("Pão de Centeio", 50, "Médio");
		Pao pao3 = new Pao("Pão Autraliano", 35, "Grande");
		
		//Métodos e Atributos Static, temos acesso sem
		//ter que instanciar um objeto da classe
		Pao.quantidadePao = 300;
		
		System.out.println("----------------------\n\n");
		pao1.imprimir();
		pao2.imprimir();
		pao3.imprimir();

	}

}
