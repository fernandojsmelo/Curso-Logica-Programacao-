#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Crie um algoritmo que solicite ao usuário uma letra e depois 
	verifique se a letra digitada é "F" ou "M". 
	
		Caso a letra digitada seja F imprima a palavra Feminino.
		Caso a letra digitada seja M imprima a palavra Masculino.
		Caso o usuário digite qualquer outra coisa, imprima a palavra Sexo Inválido.

	
	*/
	
	char sexo;
	
	cout << "Digite F para Feminino ou M para Masculino: \n";
	cin >> sexo;
	
	if ( sexo == 'F' || sexo == 'f' ){
		
		cout << "F - Feminino \n\n";
		
	}else if( sexo == 'M' || sexo == 'm' ){
		
		cout << "M - Masculino \n\n";
		
	}else{
		
		cout << "Sexo Inválido!";
	}
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
