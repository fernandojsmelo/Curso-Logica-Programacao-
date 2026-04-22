#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Crie um algoritmo que solicite ao usuário um número inteiro
	e depois imprima na tela se este número é positivo ou negativo.
	
	*/
	
	int numero;
	
	cout << "Digite um número inteiro: \n";
	cin >> numero;
	
	if ( numero > 0 ){
		
		cout << "\nNúmero positivo.\n";
		
	}else if( numero < 0 ){
		
		cout << "\nNúmero NEGATIVO.\n";
		
	}else{
		
		cout << "\nNúmero 0.\n";
		
	}
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
