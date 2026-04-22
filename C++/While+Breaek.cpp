#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int contador;
	
	contador = 1;
	
	//while = enquanto
	while( contador < 100 ){
		
		cout << "Número: " << contador << "\n";
		
			if( contador == 5){
				
				break;
			}
		
		contador++;
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
