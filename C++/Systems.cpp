 #include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;



int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	//system("notepad");
	//system("mspaint");
	
	//Criando uma pasta
	//system("mkdir PastaSystem34");
	
	//Criando várias pastas
	//system("mkdir Pasta System 34");
	
	//Tabela cores
	system("color/?");
	
	//Muda Fundo e Letra
	system("color 1F");
	
	system("pause");
	
	//Limpar a tela
	system("cls");
	
	cout << "\n\nCurso de lógica de programação!!!\n\n";
	
	system("ping www.google.com");
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


