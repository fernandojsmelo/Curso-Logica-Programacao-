#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int numero1, resto;
	
	//% pega o resto da divisão
	numero1 = 10;
	resto = numero1 % 2; //% = resto
	
	cout << "O resto da divisão é " << resto << "\n\n";
	
	//----------------------------------
	
	int numero2, resto2;
	numero2 = 10;
	resto2 = numero2 % 3;
	
	cout << "O resto da divisão é " << resto2 << "\n\n";
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
