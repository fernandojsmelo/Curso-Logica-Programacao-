#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int numero;
	string fruta;
	
	numero = 5;
	
	//if - se
	//&& - E 
	if ( numero >= 2 && numero <= 10 ){
		
		cout << "---------------\n";
		cout << "Número: " << numero << "\n";
		cout << "Está no intervalo de 2 a 10\n\n";
		
	}else{
		
		cout << "---------------\n";
		cout << "Número: " << numero << "\n";
		cout << "NÂO está no intervalo de 2 a 10\n\n";
		
	}
	
	// || - OU >> OR
	if ( numero >=2 || numero <= 10  ){
		
		cout << "\n\n------ || -- OU ---------\n";
		cout << "Número: " << numero << "\n";
		cout << "É Maior ou igual a 2 OU Menor ou Igual a 10\n\n";
		
	}
	
	fruta = "pera";
	
	if ( fruta == "maça" || fruta == "banana"  ){
		
		cout << "\n\n------ FRUTA ---------\n";
		cout << "Fruta: " << fruta << "\n";
		cout << "Fruta é Maça ou Banana\n\n";
		
	}else{
		
		cout << "\n\n------ FRUTA ---------\n";
		cout << "Fruta: " << fruta << "\n";
		cout << "Fruta NÂO é Maça nem Banana\n\n";
		
	}
	
	numero = 12;
	
	//! = Falso ou seja Not
	//1 = Verdadeiro
	//0 = Falso
	
	if ( !numero ){
		
		cout << "----- NEGAÇÂO NOT (!) -----\n\n";
		cout << "Não é um Número: " << "\n";
		
		
	}else{
		
		cout << "----- NEGAÇÂO NOT (!) -----\n\n";
		cout << "É um Número: " << "\n";
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
