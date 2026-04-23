#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
		Crie um algoritmo que contenha um vetor de 5 números inteiros,  
		depois solicite ao usuário a entrada desses números e no final 
		mostre quantos números possuem valor maior, menor e igual ao primeiro número do vetor.

	*/
	
	int vetor[5], posicao, maior, menor, igual;
	
	maior = 0;
	menor = 0;
	igual = 0;	
	
	//for = para
	for( posicao = 0; posicao < 5; posicao++ ){
		
		cout << "Digite o número da posição " << posicao << ": \n";
		cin >> vetor[posicao];
		
	}
	
	
	for( posicao = 0; posicao < 5; posicao++ ){
		
		//if = se
		//Contando valores maiores que o primeiro número
		if( vetor[posicao] > vetor[0]){ //Posição 0 é o primeiro número
			
			maior++;
			
		}
		
		//Contando valores maiores que o primeiro número
		if( vetor[posicao] < vetor[0]){ //Posição 0 é o primeiro número
			
			menor++;
			
		}
		
		//Contando valores IGUAIS que o primeiro número
		if( vetor[posicao + 1] == vetor[0]){ //Posição 0 é o primeiro número
			
			igual++;
			
		}
		
		cout << "Maiores: " << vetor[posicao] << "\n";
		cout << "Menores: " << vetor[posicao] << "\n";
		cout << "Iguais: " << vetor[posicao + 1] << "\n";
		
	}
	
	cout << "\n\nTotal de números maiores que " << vetor[0] << ": " << maior;
	cout << "\nTotal de números menores que " << vetor[0] << ": " << menor;
	cout << "\nTotal de números iguais a " << vetor[0] << ": " << igual << "\n";
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
