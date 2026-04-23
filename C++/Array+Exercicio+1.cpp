#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
		Crie um algoritmo que contenha um vetor de 5 números inteiros
		depois solicite ao usuário que digite os 5 números
		em seguida imprima os números na ordem inversa em que foram digitados.

	*/
	
	int vetorNumeros[5];
	int contador;
	
	//for = para
	//Colentando números no vetor
	for ( contador = 0; contador < 5; contador++ ){
		
		cout << "Digite o número da posição: " << contador << ": ";
		cin >> vetorNumeros[contador];
		
	}
	
	//Imprimindo os números na ordem inversa
	for ( contador = 4; contador >= 0; contador-- ){
		
		cout << vetorNumeros[contador] << "\n";
		
	}
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
