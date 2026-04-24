#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

#include "SobrecargaMetodos.h"

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*
	 *Polimorfismo
	Significa várias formas, pode mudar ou assumir outra forma
	Podemos com o polimorfismo criar vários métodos construtores com o
	mesmo nome desde que tenham parametros diferentes
	*/
	
	Aluno *dadosAluno = new Aluno();
	
	//Metodo contrutor 1
	dadosAluno -> DadosAluno();
	
	//Metodo contrutor 2
	dadosAluno -> DadosAluno("222.222.222-22");
	
	//Metodo contrutor 3
	dadosAluno -> DadosAluno("333.333.333-33",
							"Berenice Alves",
							39,
							"Feminino"
							);
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


