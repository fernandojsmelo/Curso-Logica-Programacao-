#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	string pais;
	
	//Para indicar que o recomecar é um label colocamos os dois pontos no final
	recomecar:
		
	cout << "Qual o país vai ganhar a Copa do Mundo? \n";
	cin >> pais;
	
	//if = se
	if ( pais == "Brasil" ){
		
		cout << "Muito bem! O Brasil vai ser o campeão da copa do mundo, até breve!\n\n";
	
	//else if = senão se	
	}else if ( pais == "BRASIL" ){
		
		cout << "Muito bem! O Brasil vai ser o campeão da copa do mundo, até breve!\n\n";
		
	}else if ( pais == "brasil" ){
		
		cout << "Muito bem! O Brasil vai ser o campeão da copa do mundo, até breve!\n\n";
	
	//senão
	}else{
		
		cout << "\n";
		goto recomecar;
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
