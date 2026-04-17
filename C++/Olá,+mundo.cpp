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
	
	setlocale(LC_ALL, "");
	
	cout << "Olá, mundo!" << endl;
	
	cout << "Olá, mundo! \n Sou o professor Clevison" << endl;
	
	
	//A função main diz que retonar um inteiro, então colocamos o 0 como tipo retorno
	return 0;
	
}
