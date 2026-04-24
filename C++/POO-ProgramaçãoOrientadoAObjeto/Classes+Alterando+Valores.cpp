 #include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

#include "AlunoAlterar.h"

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	Aluno *dadosAluno1 = new Aluno(1);
	
	//Exibindo dados na tela
	dadosAluno1 -> imprimirDadosNaTela();
	
	//Altero o valor do nome
	dadosAluno1 -> nome = "Amanda";
	
	//Exibindo dados na tela
	dadosAluno1 -> imprimirDadosNaTela();
	
	//-------------------------------------------
	
	string nomeAluno;
	int idadeAluno;
	string sexoAluno;
	
	cout << "\n\nDigite o nome do aluno: \n";
	cin >> nomeAluno;
	
	cout << "Digite a idade do aluno: \n";
	cin >> idadeAluno;
	
	cout << "Digite o sexo do aluno: \n";
	cin >> sexoAluno;
	
	//Altero o valor do nome
	dadosAluno1 -> nome = nomeAluno;
	dadosAluno1 -> idade = idadeAluno;
	dadosAluno1 -> sexo = sexoAluno;
	
	//Exibindo dados na tela
	dadosAluno1 -> imprimirDadosNaTela();
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


