#ifndef Aluno_H_INCLUDED
#define Aluno_H_INCLUDED

class Aluno{
	
	public:
		
		int codigo;
		std::string nome;
		
	Aluno(int codigoAluno);
	
	int setidade(int idadeAluno);
	
	//Metodo para pegar o obtejo do tipo privado
	int getidade();
	
	void exibirDadosNaTela();
	
	
	private:
		
		int idade;
		std::string sexo;
	
};

int Aluno::getidade(){
	
	return idade;
	
}

int Aluno::setidade(int idadeAluno){
	
	idade = idadeAluno;
	
}

void Aluno::exibirDadosNaTela(){
		
		std::cout << "Código: " << codigo << std::endl;
		std::cout << "Nome: " << nome << std::endl;
		std::cout << "Idade: " << idade << std::endl;
		std::cout << "Sexo: " << sexo << std::endl;
		std::cout << std::endl;
		
}

//Metodo Construtor
Aluno::Aluno(int codigoAluno){
	
	//If = se
	if ( codigoAluno == 1 ){
		
		codigo = 1;
		nome = "Ana Paula";
		idade = 32;
		sexo = "Feminino";
		
		
	}
	
}	

#endif
