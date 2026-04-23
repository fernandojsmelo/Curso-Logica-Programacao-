#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
		Crie um algoritmo que contenha um vetor de 5 valores inteiros
		depois solicite ao usuário que digite os 5 números para preencher esse vetor
		em seguida, exiba na tela os valores ímpares desse vetor.

	*/
	
	int contador, posicao;
	int vetorPrincipal[5], vetorNumerosImpares[5];
	
	//for = para
	for( posicao = 0; posicao < 5; posicao++ ){
		
		//Preenchendo os número no vetor principal
		cout << "Digite o número da posição " << posicao << ": ";
		cin >> vetorPrincipal[posicao];
		
		//if = se
		//Verifica se o número é impar e se for armazena no vetor vetorNumerosImpares
		if( vetorPrincipal[posicao] % 2 != 0 ){
			
			vetorNumerosImpares[contador] = vetorPrincipal[posicao];
			contador++;
			
		}
		
	}
	
	cout << "\n\nOs números impares são: \n";
	cout << "Total impares: " << contador << "\n";
	
	//Imprime os números do vetor vetorNumerosImpares
	for( posicao = 0; posicao < contador; posicao++){
		
		cout << vetorNumerosImpares[posicao] << "\n";
		
	}
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
