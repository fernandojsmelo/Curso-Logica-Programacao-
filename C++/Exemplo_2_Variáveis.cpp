#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){

	//Biblioteca responsavel pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	 *Crie um algoritmo que solícite ao usuário 3 números inteiros e depois calcule e apresente na tela:
	 *	1) O dobro do primeiro número mais a metade do segundo número.
	 *	2) o tripo do número primeiro mais o terceiro número.
	 *	3) o terceiro número multiplicado por 3
	 */

	double numero1, numero2, numero3, operacao1, operacao2, operacao3;
	cout<<"Digite o primeiro numero: ";
	cin>>numero1;

	cout<<"Digite o sequndo numero: ";
	cin>>numero2;
	
	cout<<"Digite o terceiro numero: ";
	cin>>numero3;

	operacao1 = (numero1 * 2) + (numero2/2);

	operacao2 = (numero1 * 3) + (numero3);

	operacao3 = (numero3 * 2);

	cout << "\n\n ---------------------------------------\n";
	cout << "1) " << operacao1 << endl;
	cout << "2) " << operacao2 << endl;
	cout << "3) " << operacao3 << endl;

	system("pause");
	return 0;
}
