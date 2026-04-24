#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

#include "Heranca, Virtual, Override.h"

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	AlunoEscolaFilho *dadosEscolaFilho = new AlunoEscolaFilho();
	
	dadosEscolaFilho -> exibirNaTela();
	
	
	AlunoEscolaNeto *dadosEscolaNeto = new AlunoEscolaNeto("Escola do Neto", "Período Matutino");
	
	dadosEscolaNeto -> escola = "Escola Alves Neto Herdeiro";
	dadosEscolaNeto -> periodo = "Vespertino";
	
	dadosEscolaNeto -> exibirNaTela();
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


