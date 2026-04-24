#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

#include "AlunoPrivado.h"

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	Aluno *dadosAluno = new Aluno(1);
	
	//Imprimindo dados
	dadosAluno -> exibirDadosNaTela();
	
	//Alterando o nome que é publico
	dadosAluno -> nome = "Pedro Ramos";
	dadosAluno -> setidade(23);
	
		
	//Imprimindo dados
	dadosAluno -> exibirDadosNaTela();
	
	//Alterando idade
	dadosAluno -> setidade(45);
	
	cout << "\n\n-------- Imprimindo publicos e privados -----------\n\n";
	cout << dadosAluno -> nome << "\n";
	cout << dadosAluno -> getidade() << "\n";
		
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


