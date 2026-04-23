#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

//Precisamos prototipar as funções para que elas funcionem ou seja, precisamos apre-
//sentar a função para o programa
//Void = Tipo de retorno + Nome da função e os argumentos
void somaNumeros(int numero1, int numero2);
void somaNumeros(int valor1, int valor2, int valor3);

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	somaNumeros(10, 2);
	somaNumeros(10, 5, 20);
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}

void somaNumeros(int numero1, int numero2){
	
	cout << "Total 1: " << numero1 + numero2 << "\n\n";
	
}

void somaNumeros(int valor1, int valor2, int valor3){
	
	cout << "Total 2: " << valor1 + valor2 + valor3 << "\n\n";
	
}


