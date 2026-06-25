package MetodosClasses;

public class Metodos_Get_e_Set {

	public static void main(String[] args) {

		//Instanciando - usando todas as propriedade e tudo que tem na classe
		ItensLoja produto1 = new ItensLoja("Celular", 50, "Motorola");
		
		//Aqui podemos alterar os atributos de fora da classe
		//por que ele está definido como public
		produto1.nomeProduto = "Sapato";
		produto1.quantidadeProduto = 30;
		
		//Para alterar o valor privat precisamos alterar pelo
		//m�todo set
		produto1.setFabricanteProduto("Apple");
		
		
		System.out.println(produto1.nomeProduto);
		System.out.println(produto1.quantidadeProduto);
		
		//Para acessar os itens de um atributo privat fora
		//da classe, precisamos usar o get
		System.out.println(produto1.getFabricanteProduto());
		
		
		//produto1.

	}

}
