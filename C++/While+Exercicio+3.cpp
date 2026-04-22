#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Crie um algoritmo que solicite ao usuário um número inteiro maior que zero
	e só saia da rotina quando o usuário digitar o valor 0 (zero) 
	caso o usuário não digite o valor zero (0) o algoritmo deverá solicitar 
	a entrada de um novo número.
	
	
	Após o usuário digitar o valor zero (0) o algoritmo deverá imprimir 
	a quantidade de números que foram digitados e a média destes números.	
	*/
	
	double soma, total, numero;
	soma = 0;
	total = 0;
	
	cout << "Digite um número maior que 0: \n";
	cin >> numero;
	
	//while = enquanto
	while ( numero > 0 ){
		
		soma = soma + numero;
		total++;
		
		cout << "Digite um número maior que 0: \n";
		cin >> numero;
		
	}
	
	cout << "\nQuantidade de números digitados: " << total << "\n";
	cout << "Média: " << soma / total << "\n";
	
		
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
