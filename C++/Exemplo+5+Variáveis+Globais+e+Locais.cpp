#include <iostream> //Entrada e saída de dados

#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

//VG = Variável Global - Acessamos dentro de outras funções
double nota1VG, nota2VG;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	//VL = Variavies Locais - Acessamos apenas dentro da nossa função
	double nota3VL, nota4VL, media;
	
	nota1VG = 9;
	nota2VG = 10;
	nota3VL = 5;
	nota4VL = 10;
	
	
	media = (nota1VG + nota2VG + nota3VL + nota4VL ) / 4;
	
	cout << "Nédia: " << media << "\n";
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
