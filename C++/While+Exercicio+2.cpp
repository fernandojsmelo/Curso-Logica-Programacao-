#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Escreva um algoritmo que exiba os números de 1 até 10 na tela.	
	*/
	
	int numero;
	
	numero = 1;
	
	//while = enquanto
	while ( numero <= 10 ){
		
		cout << numero << endl;
		
		numero++;
		
	}
		
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
