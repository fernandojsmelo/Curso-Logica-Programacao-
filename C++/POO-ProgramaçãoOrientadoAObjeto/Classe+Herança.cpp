#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

#include "Heranca.h"

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	AlunoEscolaFilho *dadosEscolaFilho = new AlunoEscolaFilho();

	//Imprimimos na Tela
	dadosEscolaFilho -> imprimirNaTela();
	
	AlunoEscolaNeto *dadosNeto = new AlunoEscolaNeto();

	//Imprimimos na Tela
	dadosNeto -> imprimirNaTela();

	//Alteramos dados da Escola neto
	dadosNeto -> nome="Alfredo Alves";
	dadosNeto -> idade=38;

	//Imprimimos na Tela
	dadosNeto -> imprimirNaTela();
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


