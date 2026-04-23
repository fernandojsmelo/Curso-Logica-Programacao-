#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

//Protottipar
void contarDeUmAteDez(int numero, int incremento=1);

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int contador;
	contador = 1;
	
	cout << " ----- Resultado com While - Enquanto -----\n";
	while ( contador < 11 ){
		
		cout << "Número While: " << contador << "\n";
		contador++;
		
	}
	
	//----------------------------------------------
	
	cout << "\n\n";
	contarDeUmAteDez(10);
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}

void contarDeUmAteDez(int numero, int incremento){
	
	cout << "Número Função: " << incremento << "\n";
	
	//if = se
	if( numero > incremento ){
		
		contarDeUmAteDez(numero, ++incremento);
		
	}
	
}


