#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

#include "HerancaMultiplaPaiMae.h"

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	Filho *dadosFilho = new Filho();
	
	//Imprimindo dados casa Pai
	dadosFilho -> imprimiDadosCasaPai();
	
	//Imprimindo dados casa Mae
	dadosFilho -> imprimiDadosCasaMae();
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


