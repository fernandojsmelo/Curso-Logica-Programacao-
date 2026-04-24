#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

class Aluno{
	
	public:
		
		//Objetos
		string nome = "Maria Eduarda";
		int idade = 29;
		string sexo = "Feminino";
		
		string estado;
		
		
		//Prototipamos
		void verificaEstado(string estadoDoAluno);
	
	
};

//Construimos o nosso Método
void Aluno::verificaEstado(string estadoDoAluno){
	
	//if = se
	if( estadoDoAluno == "SP" ){
		
		this -> estado = "São Paulo";
		
	}else if( estadoDoAluno == "SC" ){
		
		this -> estado = "Santa Catarina";
		
	}else if( estadoDoAluno == "RJ" ){
		
		this -> estado = "Rio de Janeiro";
		
	}
	
}

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	Aluno *dadosAluno = new Aluno();
	
	cout << "Nome: " << dadosAluno -> nome << "\n";
	cout << "Idade: " << dadosAluno -> idade << "\n";
	cout << "Sexo: " << dadosAluno -> sexo << "\n";
	
	dadosAluno -> verificaEstado("SP");
	cout << "Estado: " << dadosAluno -> estado << "\n";
	
	dadosAluno -> verificaEstado("RJ");
	cout << "Estado: " << dadosAluno -> estado << "\n";
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


