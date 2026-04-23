#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
		Crie um algoritmo que leia 10 números e imprima a quatidade de
		pares e de impares.
	*/
	
	int par, numero, contador;
	
	//for = para
	for ( contador = 1; contador <= 10; contador++ ){
		
			cout << "Digite o número: " << contador << "\n";
			cin >> numero;
			
			if( numero % 2 == 0 ){
				
				par++;
				
			}
		
	}
	
	cout << "\nQuantidade números pares: " << par;
	cout << "\nQuantidade números impares: " << 10 - par << "\n";
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
