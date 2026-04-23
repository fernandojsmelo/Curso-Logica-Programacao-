#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;


//prototipa = Apresentar
void funcaoNome(string nomeUsuario="Paulo");
void funcaoIdade(int idadeUsuario=29);

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	//Ao invés de passar os parametros aqui, omitimos os valores e colocamos o valor na
	//hora de prototipar
	funcaoNome();
	funcaoIdade();
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}

void funcaoNome(string nomeUsuario){
	
	cout << "Nome: " << nomeUsuario << "\n";
	
}

void funcaoIdade(int idadeUsuario){
	
	cout << "Idade: " << idadeUsuario << "\n";
	
}


