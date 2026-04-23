#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;


int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercicio Enum
	
		Crie um algoritmo usando o emum que armazene as letras do alfabeto de A a K 
		e após isso use um for para imprimir os números de 0 a 10 usando o enum.
	
	*/
	
	enum letrasAlfabeto{
		a,
		b,
		c,
		d,
		e,
		f,
		g,
		h,
		i,
		j,
		k
	};
	
	int contador;
	
	//for = para
	for ( contador = a; contador <= k; contador++ ){
		
			cout << contador << "\n";
		
	}
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


