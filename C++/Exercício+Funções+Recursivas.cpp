#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

//Prototipou
int somarNumeros(int numeroRecebido);

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício de Recursividade
		Crie um algoritmo usando Recursividade que solicite ao usuário 
		que digite um número e em seguida, calcule a somatória do 1 ao número 
		que o usuário digitou. 
	 
	 Ex: Se digitar 5:  1 + 2 + 3 + 4 + 5 = 15

	*/
	
	int numero, somatorio;
	
	cout << "Digite o número: ";
	cin >> numero;
	
	somatorio = somarNumeros(numero);
	
	cout << "A soma dos número de 1 até " << numero << " é " << somatorio << "\n";
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}

int somarNumeros(int numeroRecebido){
	
	int resultado;
	
	//if = se
	if(numeroRecebido == 1){
		
		return(1);
		
	}else{
		
		resultado = numeroRecebido + somarNumeros(numeroRecebido - 1);
		
		
		
	}
	
	return(resultado);
	
	
}




