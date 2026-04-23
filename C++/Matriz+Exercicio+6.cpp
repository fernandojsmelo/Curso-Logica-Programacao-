#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	
		Crie uma matriz 3 x 3 e solicite ao usuário que ele preencha os números 
		e em seguida multiplique cada número por 2 
		por último, imprima a matriz original e a matriz com valores multiplicados por 2.

	*/
	
	int linha, coluna, matriz[3][3];
	
	//for = para
	for ( linha = 0; linha < 3; linha++ ){
		
		for( coluna = 0; coluna < 3; coluna++ ){
			
			cout << "Digite o número da Linha: " << linha << " - Coluna: " << coluna << ": ";
			cin >> matriz[linha][coluna];
			
		}
		
	}
	
	//Imprimindo os valores na Matriz
	cout << "------- Valores Originais -----\n\n";
	for ( linha = 0; linha < 3; linha++ ){
		
		for( coluna = 0; coluna < 3; coluna++ ){
			
			cout << matriz[linha][coluna] << "   ";
			
			
		}
		
		cout << "\n";
		
	}
	
	//Multiplicando valores na Matriz por 2
	for ( linha = 0; linha < 3; linha++ ){
		
		for( coluna = 0; coluna < 3; coluna++ ){
			
			matriz[linha][coluna] = matriz[linha][coluna] * 2;
			
			
		}
		
		cout << "\n";
		
	}
	
	//Imprimindo os valores na Matriz Multiplicado por 2
	cout << "\n\n------- Valores Multiplicados por 2 Originais -----\n\n";
	for ( linha = 0; linha < 3; linha++ ){
		
		for( coluna = 0; coluna < 3; coluna++ ){
			
			cout << matriz[linha][coluna] << "   ";
			
			
		}
		
		cout << "\n";
		
	}
	
	
	
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
