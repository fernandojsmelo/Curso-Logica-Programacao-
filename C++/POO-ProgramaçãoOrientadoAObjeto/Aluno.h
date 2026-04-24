#ifndef Aluno_H_INCLUDED
#define Aluno_H_INCLUDED

class Aluno{
	
	public:
		
		//Objetos
		int codigo;
		std::string nome;
		int idade;
		std::string sexo;
		
		//Prototipando - apresentando na classe
		Aluno(int codigoAluno);
		
		void exibirDadosNaTela();
	
};

void Aluno::exibirDadosNaTela(){
	
	std::cout << "Código: " << codigo << std::endl;
	std::cout << "Nome: " << nome << std::endl;
	std::cout << "Idade: " << idade << std::endl;
	std::cout << "Sexo: " << sexo << std::endl;
	std::cout << std::endl;
	std::cout << std::endl;
	
}

//Metodo Construtor
Aluno::Aluno(int codigoAluno){
	
	//IF = Se
	if( codigoAluno == 1 ){
		
		codigo = 1;
		nome = "Ana Paula";
		idade = 32;
		sexo = "Feminino";
		
	}else if( codigoAluno == 2 ){
		
		codigo = 2;
		nome = "Pedro Martins";
		idade = 27;
		sexo = "Masculino";
		
	}else if( codigoAluno == 3 ){
		
		codigo = 3;
		nome = "Raquel Moreira";
		idade = 39;
		sexo = "Feminino";
		
	}else if( codigoAluno == 4 ){
		
		codigo = 4;
		nome = "Berenice Alves";
		idade = 39;
		sexo = "Feminino";
		
	}
	
}


#endif
