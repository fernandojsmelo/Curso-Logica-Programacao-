#include <iostream>
/*
Iostream é uma biblioteca
I - Vem de Input - Entrada
O - Vem de Output saída
*/

#include <locale.h> //Para usarmos acentos

/*
Importando todos os identificadores do NameSpace STD para usar o cout e endl
O Namespace é nada mais nada menos que uma organização de pastas
*/
using namespace std;



/*
Todo o programa em C++ tem uma e somente uma função principal que é a função MAIN
*/
int main(){
	
	//Para usarmos acentos
	setlocale(LC_ALL, "");
	
	//Variaveis é um espaço na memória onde vamos guardar valores temporiamente
	int numerosInteiros = 3;
	double numerosComCasasDecimais = 9.99;
	char letra = 'a';
	const char* letras = "abcdefg";
	string textos = "Aluna: Rosiane";
	bool verdadeiroFalso = true;
	
	cout << numerosInteiros << "\n";
	cout << numerosComCasasDecimais << "\n";
	cout << letra << "\n";
	cout << letras << "\n";
	cout << textos << "\n";
	cout << verdadeiroFalso << "\n";
	
	
	
	//A função main diz que retonar um inteiro, então colocamos o 0 como tipo retorno
	return 0;
	
}
