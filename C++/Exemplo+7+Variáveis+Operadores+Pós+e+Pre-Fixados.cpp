#include <iostream> //Entrada e saída de dados

#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int numero1;
	
	numero1 = 10;
	
	cout << "------- Valor Inicial ------\n";
	cout << "Número: " << numero1 << "\n";
	
	//Multiplica o valor por 2
	numero1*=2;
	cout << "Número: " << numero1 << "\n";
	
	//Dividindo por 4
	numero1/=4;
	
	cout << "\n------- Valor Dividido por 2 ------\n";
	cout << "Número: " << numero1 << "\n";
	
	//------------ PÒS FIXADO -------------
	
	numero1 = 100;
	
	cout << "\n ------------ Pós Fixado ----------\n";
	cout << "Numero = 100" << "\n";
	cout << "Numero = " << numero1++ << "\n";
	cout << "Numero = " << numero1 << "\n";
	
	//------------ PRÉ FIXADO -------------
	
	numero1 = 100;
	
	cout << "\n ------------ Pré Fixado ----------\n";
	cout << "Numero = 100" << "\n";
	cout << "Numero = " << ++numero1 << "\n";
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
