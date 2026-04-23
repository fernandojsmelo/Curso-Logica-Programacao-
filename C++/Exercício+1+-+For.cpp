#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
		Crie um algoritmo que leia um número e se ele for entre 1 a 10
		mostre a tabuada desse número, caso contrário, 
		emita a mensagem que o número não está no intervalo de 1 a 10.
	*/
	
	int numero, contador, resultado;
	
	cout << "Informe o número da tabuada que deseja ver: \n";
	cin >> numero;
	
	if ( numero >= 1 && numero <= 10 ){
		
		//for = para
		for( contador = 1; contador <= 10; contador++ ){
			
			resultado = ( numero * contador );
			cout << "\n" << numero << " x " << contador << " = " << resultado;
			
		}
		
	}else{
		
		cout << "O número não está no intervalo de 1 a 10!\n";
		
	}
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
