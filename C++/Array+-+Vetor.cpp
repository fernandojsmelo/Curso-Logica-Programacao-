#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	//Vetor
	string comodaGavetas[4];
	int posicao;
	
	comodaGavetas[0] = "Camisas";
	comodaGavetas[1] = "Calças";
	comodaGavetas[2] = "Jaquetas";
	comodaGavetas[3] = "Meias";	
	
	cout << "------------ Exemplo 1 ---------------\n";
	cout << "Gaveta 1: " << comodaGavetas[0] << "\n";
	cout << "Gaveta 2: " << comodaGavetas[1] << "\n";
	cout << "Gaveta 3: " << comodaGavetas[2] << "\n";
	cout << "Gaveta 4: " << comodaGavetas[3] << "\n";
	
	cout << "\n\n------------ Exemplo 2 ---------------\n";
	for ( posicao = 0; posicao < 4; posicao++ ){
		
		cout << "Posição " << posicao << " : " << comodaGavetas[posicao] << "\n";
		
	}
	
	//----------------------------------------------------------
	
	int tamanho = 10;
	int posicao2, contador;
	
	string letrasAlfabeto[tamanho] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
	
	cout << "\n\n------------ Exemplo 3 Letras Alfabeto ---------------\n";
	for ( posicao2 = 0, contador = 1; posicao2 < tamanho; posicao2++, contador++ ){
		
			cout << "Letra  " << contador << " : " << letrasAlfabeto[posicao2] << "\n";
		
	}
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
