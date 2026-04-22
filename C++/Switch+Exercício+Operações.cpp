#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Crie um algoritmo que solicite ao usuário a entrada de dois números 
	e a operação que ele deseja executar (Soma, Subtração, Divisão e Multiplicação). 
	Logo em seguida, o algoritmo deve ler os dois números, 
	a operação e apresentar na tela o resultado.	
	*/
	
	double valor1, valor2;
	int opcao;
	
	cout << "Digite o primeiro número: \n";
	cin >> valor1;
	
	cout << "Digite o segundo número: \n";
	cin >> valor2;
	
	//Menu de opções
	cout << "Qual operação você deseja fazer? \n";
	cout << "Digite 1 para SOMAR \n";
	cout << "Digite 2 para SUBTRAÇÃO \n";
	cout << "Digite 3 para DIVISÃO \n";
	cout << "Digite 4 para MULTIPLICAÇÃO \n";
	cin >> opcao;
	
	//switch = escolha
	switch(opcao){
		
		case 1:
				cout << "A soma é: " << valor1 + valor2 << "\n";
			break;
			
		case 2:
				cout << "O resultado da subtração é: " << valor1 - valor2 << "\n";
			break;
			
		case 3:
				cout << "O resultado da divisão é: " << valor1 / valor2 << "\n";
			break;
			
		case 4:
				cout << "O resultado da multiplicação é: " << valor1 * valor2 << "\n";
			break;
			
		default:
				cout << "Opção inválida!!!";
			break;
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
