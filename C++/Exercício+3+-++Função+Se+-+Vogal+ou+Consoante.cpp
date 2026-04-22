#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	Crie um algoritmo que solicite ao usuário que digite uma letra, 
	após isso verifique se a letra digitada é vogal ou consoante 
	e imprima na tela o resultado.	
	*/
	
	char letra;
	
	cout << "Digite uma letra: \n";
	cin >> letra;
	
	if ( letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
		
		cout << "Você digitou uma VOGAL\n";
		
	}else if( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
		
		cout << "Você digitou uma VOGAL!\n";
		
	}else{
		
		cout << "Você digitou uma CONSOANTE!\n";
		
	}
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
