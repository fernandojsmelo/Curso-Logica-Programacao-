#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int numero;
	
	cout << "------------ Resultado Exemplo 1 --------\n\n";
	//for = para
	for( numero = 1; numero < 11; numero++ ){
		
		cout << "Número: " << numero << "\n";
		
	}
	
	//-------------------------------------------------------------
	
	
	cout << "------------ Resultado Exemplo 2 --------\n\n";
	
	string nome;
	int contador;
	double nota, media, soma;
	
	soma = 0;
	
	cout << "Digite o nome do aluno: \n";
	cin >> nome;
	
	//for = para
	for( contador = 1; contador <= 4; contador++ ){
		
		cout << "Digite a nota " << contador << "\n";
		cin >> nota;
		
		soma += nota;
		
	}
	
	media = soma / 4;
	
	cout << "\n\nAluno(a): " << nome << "\n";
	cout << "\n\nMédia: " << media << "\n";
	cout << "\n\n";
	
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
