#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	string letra, mensagem;
	
	cout << "Digite uma letra: \n";
	cin >> letra;
	
	(letra == "a") ? mensagem = "Você digitou a letra A" : mensagem = "Você não digitou a letra A";
	
	
	cout << "-----------------\n";
	cout << "Letra digitada: " << letra << endl;
	cout << "Resultado: " << mensagem << endl << endl;
	
	//------------------------------------------------------------------
	
	string vogal, resultado;
	
	cout << "Digite uma letra: \n";
	cin >> vogal;
	
	(vogal == "a") ? resultado = "Vogal A" : (vogal == "e") ? resultado = "Vogal E" : (vogal == "i") ? resultado = "Vogal I" : (vogal == "o") ? resultado = "Vogal O" : (vogal == "u") ? resultado = "Vogal U" : resultado = "Consoante "+vogal;   
	
	cout << "------- Exemplo 2 Vogal ou Consoante ----------\n";
	cout << "Letra digitada: " << vogal << endl;
	cout << "Resultado: " << resultado << endl << endl;
	
	
	//----------------------------------------------------------------------
	
	
	string sexo;
	int preco;
	
	preco = 10;
	
	cout << "\nDigite seu sexo: \n";
	cin >> sexo;
	
	(sexo == "m") ? preco++ : preco-=3;
	
	cout << "\n\n ------------- Exemplo Ingresso -------\n\n";
	(sexo == "m") ? cout << "Sexo : Masculino: " << preco++ : cout << "Sexo : Feminino: " << preco++ << endl << endl;
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
