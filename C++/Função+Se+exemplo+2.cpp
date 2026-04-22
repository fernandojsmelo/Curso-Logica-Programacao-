#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	double valorEntrada;
	string nome, sexo;
	
	valorEntrada = 12;
	
	cout << "Digite seu nome: \n";
	cin >> nome;
	
	cout << "Digite seu sexo: \n";
	cin >> sexo;
	
	//Se
	if( sexo == "Masculino" ){
		
		cout << "\n\n------- Comprovante de entrada -------\n\n";
		cout << "Nome: " << nome << endl;
		cout << "Valor entrada: " << valorEntrada << endl << endl;
		cout << "------ Aproveite o show -------" << endl << endl;
		
	//else if = Senão Se
	}else if( sexo == "Feminino" ){
		
		valorEntrada = valorEntrada / 2;
		
		cout << "\n\n------- Comprovante de entrada -------\n\n";
		cout << "Nome: " << nome << endl;
		cout << "Valor entrada: " << valorEntrada << endl << endl;
		cout << "------ Aproveite o show -------" << endl << endl;
		
	//else = senão	
	}else{
		
		cout << "\n\nVocê não digitou um sexo válido!\n\n";
		
	}
	
	
		
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
