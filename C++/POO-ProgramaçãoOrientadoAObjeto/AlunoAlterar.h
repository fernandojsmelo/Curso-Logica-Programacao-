#ifndef Aluno_H_INCLUDED
#define Aluno_H_INCLUDED

class Aluno{
	
	public:
		
		//Objetos
		int codigo;
		std::string nome;
		int idade;
		std::string sexo;
		
		//Prototipando
		Aluno(int codigoAluno); //Metodo Construtor
		
		void imprimirDadosNaTela();
	
};

void Aluno::imprimirDadosNaTela(){
	
	std::cout << "Código: " << codigo << std::endl;
	std::cout << "Nome: " << nome << std::endl;
	std::cout << "Idade: " << idade << std::endl;
	std::cout << "Sexo: " << sexo << std::endl;
	std::cout << std::endl;
	
}

Aluno::Aluno(int codigoAluno){
	
	//if = se
	if( codigoAluno == 1 ){
		
		codigo = 1;
		nome = "Nicole";
		idade = 28;
		sexo = "Feminino";
		
	}else if( codigoAluno == 2 ){
		
		codigo = 2;
		nome = "Allan";
		idade = 31;
		sexo = "Masculino";
		
	}
	
}

#endif
