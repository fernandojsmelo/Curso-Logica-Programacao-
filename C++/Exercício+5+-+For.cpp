#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	
		Em São Paulo três candidatos estão concorrendo as eleições como vereador.
		Faça um algortimo que peça o número total de eleitores.
		
		Peça para cada eleitor votar e ao final mostre o número de votos
		de cada candidato recebeu e também mostre o total de votos nulos.


		
	*/
	
	int candidato1, candidato2, candidato3, eleitores, nulos, contador, voto;
	
	cout << "Digite o número de eleitores da cidade de São Paulo: \n";
	cin >> eleitores;
	
	candidato1 = 0;
	candidato2 = 0;
	candidato3 = 0;
	nulos = 0;
		
	//For = para
	for( contador = 1; contador <= eleitores; contador++){
		
		cout << "Voto número: " << contador << "\n";
		cout << "Veador(a) Ana = 1 \n";
		cout << "Veador(a) Paulo = 2 \n";
		cout << "Veador(a) Jorge = 3 \n\n";
		cin >> voto;
		
		if(voto == 1){
			candidato1++;
		}else if(voto == 2){
			candidato2++;
		}else if(voto == 3){
			candidato3++;
		}else{
			nulos++;
		}
				
	}
	
	cout << "\n\nResultado Eleição!\n";
	cout << "Ana: " << candidato1 << " voto(s) \n";
	cout << "Paulo: " << candidato2 << " voto(s) \n";
	cout << "Jorge: " << candidato3 << " voto(s) \n";
	cout << "Nulos: " << nulos << " voto(s) \n";
	
	
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
