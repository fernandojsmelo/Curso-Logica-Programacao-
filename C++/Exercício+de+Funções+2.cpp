#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

//Prototipar
void juntaNomeESobreNome(string textoNome, string textoSobrenome);

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício de Funções 2
		Crie uma função que receba o nome e sobrenome,
		depois junte ambos e imprima-os na tela.

	*/
	
	string nome, sobrenome;
	
	cout << "Digite seu nome: \n";
	cin >> nome;
	
	cout << "Digite seu sobrenome: \n";
	cin >> sobrenome;
	
	juntaNomeESobreNome(nome, sobrenome);
		
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}

void juntaNomeESobreNome(string textoNome, string textoSobrenome){
	
	cout << "\n\nNome: " << textoNome << " " << textoSobrenome << "\n";
	
}





