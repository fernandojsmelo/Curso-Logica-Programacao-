#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	
		Crie uma matriz 3x3 e solicite que o usuário digite os números. 
		Em seguida, exiba a soma dos valores da matriz na diagonal.

	*/
	
	int matriz[3][3];
	int linha, coluna, somaDiagonal, somaPrimeiraLinha;
	
	//for = para
	for ( linha = 0; linha < 3; linha++ ){
		
		for( coluna = 0; coluna < 3; coluna++ ){
			
			cout << "Digite o número da Linha: " << linha << " - Coluna: " << coluna << ": ";
			cin >> matriz[linha][coluna];
			
		}
		
	}
	
	//Imprimindo valores da Matriz
	cout << "------- Valores Digitados --------\n";
	for ( linha = 0; linha < 3; linha++ ){
		
		for( coluna = 0; coluna < 3; coluna++ ){
			
			cout << matriz[linha][coluna] << "  ";
			
		}
		
		cout << "\n";
		
	}
	
	
	somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
	cout << "\n\nA soma da diagonal é: " << somaDiagonal << "\n";
	
	somaPrimeiraLinha = matriz[0][0] + matriz[0][1] + matriz[0][2];
	cout << "\n\nA soma da primeira linha é: " << somaPrimeiraLinha << "\n";
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
