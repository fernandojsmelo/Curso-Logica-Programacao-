#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

//Precisamos prototipar as funções para que elas funcionem ou seja, precisamos apre-
//sentar a função para o programa
//Void = Tipo de retorno + Nome da função e os argumentos
void funcaoMensagem();
void somarNumeros(int numero1, int numero2);
int somarTresNumeros(int numero1, int numero2, int numero3);

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	funcaoMensagem();
	
	somarNumeros(12, 20);
	
	int n1, n2, n3, soma;
	
	cout << "Digite o primeiro número: ";
	cin >> n1;
	
	cout << "Digite o segundo número: ";
	cin >> n2;
	
	cout << "Digite o terceito número: ";
	cin >> n3;
	
	soma = somarTresNumeros(n1, n2, n3);
	
	cout << "\n\nTotal soma 3 números: " << soma << "\n";
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}

int somarTresNumeros(int numero1, int numero2, int numero3){
	
	return numero1 + numero2 + numero3;
	
}

void somarNumeros(int numero1, int numero2){
	
	cout << "Número 1: " << numero1 << endl;
	cout << "Número 2: " << numero2 << endl;
	cout << "Total: " << numero1 + numero2 << endl;
	
}

void funcaoMensagem(){
	
	cout << "Curso de Lógica de Programação!\n\n";
	
}
