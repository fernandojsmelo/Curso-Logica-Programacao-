#include <iostream> //Entrada e saída de dados

#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício - Total a Receber Mês
	Crie um algoritmo que solicite ao usuário o valor que ele ganha por hora 
	e o número de horas que ele trabalhou durante o mês. Depois calcule e mostre
	na tela o total que ele tem a receber naquele mês.
	*/
	
	double valorHora, salarioDoMes, horasTrabalhadasMes;
	
	cout << "Digite quanto você ganha por hora trabalhada? \n";
	cin >> valorHora;
	
	cout << "Digite quantas horas você trabalhou neste mês: \n";
	cin >> horasTrabalhadasMes;
	
	//Calculo salário h x th
	salarioDoMes = valorHora * horasTrabalhadasMes;
	
	cout << "\n\n Seu salário total no mês é: " << salarioDoMes << "\n";
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
