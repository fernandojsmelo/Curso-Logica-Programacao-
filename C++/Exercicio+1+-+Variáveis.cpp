//Crie um algoritmo que converta metros para centímetros

#include <iostream> //Entrada e saída de dados

#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	double m, c;
	
	cout << "Digite quantos metros você deseja converter: \n";
	cin >> m;
	
	c = m * 100;
	
	cout << "\n" << m << " metros correspondem a " << c << " centimetros.\n\n";
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
