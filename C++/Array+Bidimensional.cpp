#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	string matriz[2][3];
	int linha, coluna;
	
	matriz[0][0] = "A";
	matriz[0][1] = "B";
	matriz[0][2] = "C";
	matriz[1][0] = "D";
	matriz[1][1] = "E";
	matriz[1][2] = "F";
	
	cout << "----- Vetor Letras -------\n";
	for ( linha = 0; linha < 2; linha++ ){
		
		for ( coluna = 0; coluna <3; coluna++ ){
			
				cout << matriz[linha][coluna] << " ";
			
		}
		
		cout << "\n";
		
	}
	
	//----------------------------------------------

	int matrizInteiros[2][3];
	int linhaInteiros, colunaInteiros;

	matrizInteiros[0][0] = 1;
	matrizInteiros[0][1] = 2;
	matrizInteiros[0][2] = 3;
	matrizInteiros[1][0] = 4;
	matrizInteiros[1][1] = 5;
	matrizInteiros[1][2] = 6;

	cout << "\n\n----- Vetor Números -------\n";
	for ( linhaInteiros = 0; linhaInteiros < 2; linhaInteiros++ ){

		for ( colunaInteiros = 0; colunaInteiros <3; colunaInteiros++ ){

				cout << matrizInteiros[linhaInteiros][colunaInteiros] << " ";

		}

		cout << "\n";

	}

	//--------------------------------------

	int matrizPreechimentoAutomatico[50][10];
	int linhaPreechimentoAutomatico, colunaPreechimentoAutomatico;

	for ( linhaPreechimentoAutomatico = 0; linhaPreechimentoAutomatico < 50; linhaPreechimentoAutomatico++ ){

		for ( colunaPreechimentoAutomatico = 0; colunaPreechimentoAutomatico < 10; colunaPreechimentoAutomatico++ ){

			matrizPreechimentoAutomatico[linhaPreechimentoAutomatico][colunaPreechimentoAutomatico] = colunaPreechimentoAutomatico;

		}

		cout << "\n";

	}

	cout << "\n\nImprindo Matriz Automática\n";

	for ( linhaPreechimentoAutomatico = 0; linhaPreechimentoAutomatico < 50; linhaPreechimentoAutomatico++ ){

		for ( colunaPreechimentoAutomatico = 0; colunaPreechimentoAutomatico < 10; colunaPreechimentoAutomatico++ ){

			cout << matrizPreechimentoAutomatico[linhaPreechimentoAutomatico][colunaPreechimentoAutomatico] << "  ";

		}

		cout << "\n";

	}
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
