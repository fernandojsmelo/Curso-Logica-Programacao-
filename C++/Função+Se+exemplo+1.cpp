#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int numero1, numero2;
	string fruta;
	
	numero1 = 5;
	
	//IF = SE
	
	if ( numero1 > 50 ){
		
		cout << "---------- Resultado IF Numero 1 --------\n";
		cout << "O número 1 é maior que 50\n";
		
	}else{
		
		cout << "---------- Resultado IF Numero 1 --------\n";
		cout << "O número 1 não é maior que 50\n";
		
	}
	
	numero2 = 10;
	
	if ( numero1 > numero2 ){
		
		cout << "\n\n---------- Resultado IF Número 1 e Número 2 --------\n\n";
		cout << "Número 1: " << numero1 << "\n";
		cout << "Número 2: " << numero2 << "\n";
		cout << "O número 1 é maior que o número 2\n";
		
	}else{
		
		cout << "\n\n---------- Resultado IF Número 1 e Número 2 --------\n\n";
		cout << "Número 1: " << numero1 << "\n";
		cout << "Número 2: " << numero2 << "\n";
		cout << "O número 1 NÃO é maior que o número 2\n";
		
	}
	
	fruta = "laranja";
	
	if ( fruta == "Maça" ){
		
		cout << "\n\n---------- Resultado IF FRUTA --------\n\n";
		cout << "Fruta: " << fruta << "\n";
		cout << "A fruta é Maça!\n";
		
	}else{
		
		cout << "\n\n---------- Resultado IF FRUTA --------\n\n";
		cout << "Fruta: " << fruta << "\n";
		cout << "A fruta NÂO é Maça!\n";
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
