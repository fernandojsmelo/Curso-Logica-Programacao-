#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	
		Crie um algoritmo que solicite 2 números a usuário e no final
		imprima o intervalo entre eles.
		
		4 e 8 = 4, 5, 6, 7, 8
		
	*/
	
	int numero1, numero2, contador;
	
	cout << "Digite um número: \n";
	cin >> numero1;
	
	cout << "Digite outro número: \n";
	cin >> numero2;
	
	//for = para
	for( contador = numero1; contador <= numero2; contador++){
		
		cout << contador << "\n";
		
	}
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
