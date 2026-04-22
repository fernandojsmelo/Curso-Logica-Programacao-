#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Crie um algoritmo que solicite ao usuário a entrada de três números e depois 
	imprima na tela o maior número e o menor número digitado por ele.
	*/
	
	int numero1, numero2, numero3;
	
	cout << "Digite o primeiro número: \n";
	cin >> numero1;
	
	cout << "Digite o segundo número: \n";
	cin >> numero2;
	
	cout << "Digite o terceiro número: \n";
	cin >> numero3;
	
	//Função para encontrar o MAIOR número
	if ( numero1 > numero2 && numero1 > numero3){
		
		cout << "\nO maior número é o " << numero1 << "\n";
		
	}else if( numero2 > numero1 && numero2 > numero3 ){
		
		cout << "\nO maior número é o " << numero2 << "\n";
		
	}else{
		
		cout << "\nO maior número é o " << numero3 << "\n";
		
	}
	
	//Função para encontrar o MENOR número
	if ( numero1 < numero2 && numero1 < numero3){
		
		cout << "\nO menor número é o " << numero1 << "\n";
		
	}else if( numero2 < numero1 && numero2 < numero3 ){
		
		cout << "\nO menor número é o " << numero2 << "\n";
		
	}else{
		
		cout << "\nO menor número é o " << numero3 << "\n";
		
	}
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
