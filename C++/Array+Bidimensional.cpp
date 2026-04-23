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
	

	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
