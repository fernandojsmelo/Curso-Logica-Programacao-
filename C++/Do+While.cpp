#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int contador;
	
	contador = 1;
	
	//Do = Faça
	//While = Enquanto
	//Diferente do while o Do While sempre vai executar o código pelo menos uma vez!
	do{
		
		cout << "Número: " << contador << "\n";
		
		contador++;
		
	}while( contador < 6 );
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
