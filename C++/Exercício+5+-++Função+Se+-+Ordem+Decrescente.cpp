#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Crie um algoritmo que solicite ao usuário a entrada de 3 números
	e depois imprima-os na tela em ordem decrescente.
	*/
	
	int numero1, numero2, numero3;
	
	cout << "Digite o primeiro número: \n";
	cin >> numero1;
	
	cout << "Digite o segundo número: \n";
	cin >> numero2;
	
	cout << "Digite o terceiro número: \n";
	cin >> numero3;
	
	if ( numero1 > numero2 && numero2 > numero3 ){
		
		cout << numero1 << "\n" << numero2 << "\n" << numero3 << "\n";
		
	}else if( numero1 > numero3 && numero3 > numero2 ){
		
		cout << numero1 << "\n" << numero3 << "\n" << numero2 << "\n";
		
	}else if( numero2 > numero1 && numero1 > numero3 ){
		
		cout << numero2 << "\n" << numero1 << "\n" << numero3 << "\n";		
		
	}else if( numero2 > numero3 && numero3 > numero1 ){
		
		cout << numero2 << "\n" << numero3 << "\n" << numero1 << "\n";		
		
	}else if( numero3 > numero1 && numero1 > numero2 ){
		
		cout << numero3 << "\n" << numero1 << "\n" << numero2 << "\n";
		
		
	}else{
		
		cout << numero3 << "\n" << numero2 << "\n" << numero1 << "\n";
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
