#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	
		Crie uma matriz 3 x 3 e solicite ao usuário que ele preencha os números e em seguida, 
		conte e imprima quantos números maiores que 5 foram digitados na matrix.

	*/
	
	int linha, coluna, matriz[3][3], numerosMaioresQueCinco;
	
	numerosMaioresQueCinco = 0;
	
	//for = para
	for( linha = 0; linha < 3; linha++ ){
		
		for( coluna = 0; coluna < 3; coluna++  ){
			
				cout << "Digite o número da Linha: " << linha << " - Coluna: " << coluna << ": ";
				cin >> matriz[linha][coluna];
				
				//if = se
				if( matriz[linha][coluna] > 5 ){
					
					numerosMaioresQueCinco++;
					
				}
			
		}
		
	}
	
	
	//Imprimindo os numeros digitados
	for( linha = 0; linha < 3; linha++ ){
		
		for( coluna = 0; coluna < 3; coluna++  ){
			
				cout << matriz[linha][coluna] << "  ";
				
			
		}
		
		cout << "\n";
		
	}
	
	cout << "\n\nNúmeros maiores que 5: " << numerosMaioresQueCinco << "\n";
	
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
