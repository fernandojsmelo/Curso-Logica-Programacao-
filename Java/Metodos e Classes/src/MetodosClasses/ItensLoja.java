package MetodosClasses;

public class ItensLoja {
	
	//public - Modificador de acesso
	//private - Só pode ser acessado dentro da própria classe ou através do Get e Set
	//Quando defino como publico posso acessar de qualquer lugar
	public String nomeProduto;
	public int quantidadeProduto = 0;
	private String fabricanteProduto;
	
	//Get - Obtém os valores das variáveis / atributos de uma classe
	public String getNomeProduto() {
		
		//return - Retorna o valor do atributo nomeProduto 
		return nomeProduto;
		//return this.nomeProduto;
	}

	//Set - Atribuir / Mudar valores de uma variável de uma classe
	public void setNomeProduto(String nomeProduto) {

		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getFabricanteProduto() {
		return fabricanteProduto;
	}

	public void setFabricanteProduto(String fabricanteProduto) {
		
		//if - se
		if(fabricanteProduto.equals("Apple")) {
			System.out.println("Nao trabalhamos com os produtos desse fabricante");
		}else {
			this.fabricanteProduto = fabricanteProduto;
		}
		
		
	}

	public ItensLoja(String nProduto, int qtdProdutos, String fProduto) {
		
		System.out.println("Nome: " + nProduto);
		System.out.println("Quantidade: " + qtdProdutos);
		System.out.println("Fabricante: " + fProduto);
		System.out.println("------------------\n");
		
	}

}
