#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	
		Crie um algoritmo que calcule o fatorial de um número inteiro 
		fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

		
	*/
	
	int fatorial, numero, contador;
	
	fatorial = 1;
	
	cout << "Digite um número inteiro: \n";
	cin >> numero;
	
	//For = para
	for ( contador = numero; contador >= 1; contador--){
		
		fatorial = fatorial * contador;
		
	}
	
	cout << "O fatorial de " << numero << " é " << fatorial << "\n";
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
