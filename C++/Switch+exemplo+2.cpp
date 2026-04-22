#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	int numeroApartamento;
	
	cout << "Digite o número do andar do Apartamento que deseja comprar: \n";
	cin >> numeroApartamento;
	
	//switch = Escolha
	switch(numeroApartamento){
		
		case 1:
		case 2:
		case 3:
				cout << "Andares de 1 ao 3 - R$ 200.000 \n\n";
			break;
		case 4:
		case 5:
		case 6:
				cout << "Andares de 4 ao 6 - R$ 400.000 \n\n";
			break;
		case 7:
		case 8:
		case 9:
				cout << "Andares de 7 ao 9 - R$ 500.000 \n\n";
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
				cout << "Andares de 10 ao 18 - R$ 1.000.000 \n\n";
			break;
		default:
				cout << "Opção Inválida!!! \n\n";
			break;
		
	}
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
