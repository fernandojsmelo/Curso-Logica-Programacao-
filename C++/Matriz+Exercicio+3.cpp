#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
		Crie um algoritmo que leia uma matriz de 2 x 2 
		usando um comando for e multiplique os elementos por 2 e imprima o resultado.

	*/
	
	int linha, coluna, matriz[2][2];
	
	//for = para
	//Preenchendo os valores da matriz
	for( linha = 0; linha < 2; linha++ ){ //percorre as linhas
		
		for ( coluna = 0; coluna < 2; coluna++ ){ //Percorre as colunas
			
			cout << "Digite o número da Linha: " << linha << " - Coluna: " << coluna << ": ";
			cin >> matriz[linha][coluna]; //Armazena o número na posição correta
			
		}
		
	}
	
	cout << "\n\nNúmeros digitados:\n";
	
	//Imprimindo os valores da Matriz
	for( linha = 0; linha < 2; linha++ ){
		
		for ( coluna = 0; coluna < 2; coluna++ ){
			
			cout << matriz[linha][coluna] << "  ";
			
		}
		
		cout << "\n";
		
	}
	
	//Multiplicar por 2 os valores
	for ( linha = 0; linha < 2; linha++ ){
		
		for ( coluna = 0; coluna < 2; coluna++ ){
			
			//Substituindo os números da matriz pelo números multiplicados por 2
			matriz[linha][coluna] = matriz[linha][coluna] * 2;
			
		}
		
	}
	
	cout << "\n\nNúmeros multiplicados por 2\n";
	//Imprimindo os valores da Matriz multiplicados por 2
	for( linha = 0; linha < 2; linha++ ){
		
		for ( coluna = 0; coluna < 2; coluna++ ){
			
			cout << matriz[linha][coluna] << "  ";
			
		}
		
		cout << "\n";
		
	}
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
