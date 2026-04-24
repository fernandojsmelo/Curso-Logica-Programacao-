#ifndef Escola_H_INCLUDED
#define Escola_H_INCLUDED

//Classe PAI
class AlunoEscolaA{
	
	//Objetos
	//Publico podemos acessar os dados de qualquer lugar dentro e fora da classe
	public:
		
		int codigo;
		std::string nome;
		
		std::string getcpf();
		std::string getsexo();
		
	//Só podemos acessar os dados dentro da própria classe
	private:
	
		std::string cpf = "123.456.789-10";
		std::string sexo= "Feminino";
		
				
	//Podemos acessar os dados dentro da própria classe e também de classes herdadas	
	protected:
	
		int idade;
		std::string escola;
		std::string turma;
	
};

string AlunoEscolaA::getcpf(){
	
	return cpf;
	
}

string AlunoEscolaA::getsexo(){
	
	return sexo;
	
}

//Classe Filho
class AlunoEscolaB : public AlunoEscolaA{
	
	public:
		
		AlunoEscolaB(){
			
			codigo = 1; //Public
			nome = "Maria Silva"; //Public
			
			
			
			idade = 29;
			escola = "Escola ABC";
			turma = "8. série turma 2";
			
			std::cout << "------ Escola B -----" << std::endl;
			std::cout << "Código: " << codigo << std::endl;
			std::cout << "Nome: " << nome << std::endl;
			std::cout << "CPF: " << getcpf() << std::endl;
			std::cout << "Sexo: " << getsexo() << std::endl;
			std::cout << "Idade: " << idade << std::endl;
			std::cout << "Escola: " << escola << std::endl;
			std::cout << "Turma: " << turma << std::endl;
			std::cout << std::endl;
			
			
			
		}
	
	
};

class AlunoEscolaC{
	
	public:
		
		AlunoEscolaB contrutor;
		
		AlunoEscolaC(){
			
			contrutor.codigo = 1; //Public
			contrutor.nome = "Elaine Moreia"; //Public
			
			std::cout << "------ Escola C -----" << std::endl;
			std::cout << "Código: " << contrutor.codigo << std::endl;
			std::cout << "Nome: " << contrutor.nome << std::endl;
			std::cout << std::endl;
			
			
			
		}
	
	
};









#endif
