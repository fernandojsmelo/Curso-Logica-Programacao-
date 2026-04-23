#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

//Prototipar
int verificaMenorNumero(int primeiroNumero, int segundoNumero);

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício de Funções 1
		Crie uma função que receba dois números inteiros
		e retorne o menor número entre eles.

	*/
	
	int numero1, numero2, resultado;
	
	cout << "Digite o primeiro número: ";
	cin >> numero1;
	
	cout << "Digite o segundo número: ";
	cin >> numero2;
	
	resultado = verificaMenorNumero(numero1, numero2);
	
	cout << "\n\nO menor número é " << resultado << "\n";
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}

int verificaMenorNumero(int primeiroNumero, int segundoNumero){
	
	//if = se
	if( primeiroNumero > segundoNumero  ){
		
		return segundoNumero;
		
	}else{
		
		return primeiroNumero;
		
	}
	
}


