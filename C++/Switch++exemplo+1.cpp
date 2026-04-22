#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int numeroCor;
	
	//Menu de opções
	cout << "Digite um número para escolher o país que vai ganhar a copa do mundo! \n";
	cout << "1 - Alemanha: \n";
	cout << "2 - Argentina: \n";
	cout << "3 - Camarões: \n";
	cout << "4 - Brasil: \n";
	cout << "5 - Sérvia: \n";
	cout << "6 - Suiça: \n";
	cin >> numeroCor;
	
	//switch = Escolha
	switch( numeroCor ){
		
		//case = caso
		case 1:
			
			cout << "Você escolheu a Alemanha para ganhar a copa do mundo! \n\n";
			//break = Parar
			break;
			
		case 2:
			
			cout << "Você escolheu a Argentina para ganhar a copa do mundo! \n\n";
			break;
			
		case 3:
			
			cout << "Você escolheu o Camarões para ganhar a copa do mundo! \n\n";
			break;
			
		case 4:
			
			cout << "Você escolheu o Brasil para ganhar a copa do mundo! \n\n";
			break;
			
		case 5:
			
			cout << "Você escolheu a Sérvia para ganhar a copa do mundo! \n\n";
			break;
			
		case 6:
			
			cout << "Você escolheu a Suiça para ganhar a copa do mundo! \n\n";
			break;
			
		//default - Outro caso
		default:
			cout << "Escolha inválida!";
			break;
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
