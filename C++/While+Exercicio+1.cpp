#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Crie um algoritmo que solicite ao usuário um número	inteiro. 
	e só saia da rotina quando o usuário digitar um úmero entre 1 e 5.	
	*/
	
	int numero;
	
	cout << "Digite um número inteiro entre 1 e 5: \n";
	cin >> numero;
	
	//while = enquanto
	while( numero > 5 || numero < 1 ){
		
			cout << "Digite um número inteiro entre 1 e 5: \n";
			cin >> numero;
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
