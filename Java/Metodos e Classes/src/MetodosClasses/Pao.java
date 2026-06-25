package MetodosClasses;

public class  Pao {
	
	//public - Modificador de acesso
	public String nomePao;
	static int quantidadePao = 5;
	public String tipoPao;
	
	public Pao(String nPao, int qtdPao, String tPao) {
		
		//this - referencia / aponta para o atributo na classe
		this.nomePao = nPao;
		this.quantidadePao = qtdPao;
		this.tipoPao = tPao;
		
		System.out.println("Nome: " + nPao);
		System.out.println("Quantidade: " + qtdPao);
		System.out.println("Tipo: " + tPao);
		System.out.println("------------------- \n");
		
	}
	
	public void imprimir() {
		
		System.out.println("Nome: " + this.nomePao);
		System.out.println("Quantidade: " + this.quantidadePao);
		System.out.println("Tipo: " + this.tipoPao);
		System.out.println("------------------- \n");
		
	}

}
