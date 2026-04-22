#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
		Solicite que o usuário digite um número inteiro e imprima na sequencia 
		o quadrado do número digitado pelo usuário. Repita isso até 
		o número digitado seja 0 use o While.
	*/
	
	int numero, quadrado;
	
	cout << "Digite um número inteiro (digite 0 para encerrar):\n ";
	cin >> numero;
	
	//while = enquanto
	while ( numero != 0 ){
		
		quadrado = numero * numero;
		cout << "O quadrado do número: " << numero << " é " << quadrado << "\n";
		
		cout << "Digite um número inteiro (digite 0 para encerrar):\n ";
		cin >> numero;
		
	}
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
