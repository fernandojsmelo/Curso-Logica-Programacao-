#include <iostream> //Entrada e saída de dados

#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int numero1;
	
	numero1 = 10;
	
	cout << "Numero 1 = " << numero1 << "\n";
	
	numero1 = numero1 * -1;
	
	cout << "------ Invertendo Valores Exemplo 1 -----\n";
	cout << "Numero 1 = " << numero1 << "\n";
	
	//--------------- Exemplo 2 -------------------------
	
	numero1 = 20;
	cout << "------ Invertendo Valores Exemplo 2 -----\n";
	cout << "Numero 1 = " << numero1 << "\n";
	cout << "Numero 1 = " << -numero1 << "\n";
	cout << "Numero 1 = " << numero1 << "\n";
	
	//--------------- Exemplo 3 -------------------------
	
	numero1 = 30;
	
	cout << "------ Invertendo Valores Exemplo 3 -----\n";
	cout << "Numero 1 = " << numero1 << "\n";
	
	numero1=-numero1;
	
	cout << "Numero 1 = " << numero1 << "\n";
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
