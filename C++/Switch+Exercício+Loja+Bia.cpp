#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício
	A loja da Bia oferece aos seus funcionários um desconto de 10% por cada item comprado por eles.
	A loja da bia para fidelizar seus clientes, oferece para os clientes VIP 5% de descontos para cada produto que eles comprarem. 
	
	Com esses dados, crie um algoritmo que calcule o valor total a ser pago respeitando os descontos oferecidos pela loja. 
	
	O algoritmo na hora da venda, deverá solicitar a entrada total da compra e um código que identifique se o comprador é
	 1- Cliente Comum - 100% - 0
	 2- Funcionário - 90% - 10
	 3- Cliente Vip	 - 95% - 5
	*/
	
	double valorCompra, totalPagar;
	int codigo;
	
	cout << "Informe o valor total da compra: \n";
	cin >> valorCompra;
	
	cout << "Digite o código: \n";
	cout << "1 - Cliente Comum (0% desconto)\n";
	cout << "2 - Funcionário (10% desconto)\n";
	cout << "3 - Cliente Vip (5% desconto)\n";
	cin >> codigo;
	
	//switch = Escolha
	switch(codigo){
		
		case 1:
				cout << "\nCliente comum - 0% de desconto.\n";
				cout << "Total a pagar: " << valorCompra << "\n";
			break;
			
		case 2:
				totalPagar = valorCompra - (valorCompra * 0.1);
				cout << "\Funcionário - 10% de desconto.\n";
				cout << "Total a pagar: " << totalPagar << "\n";
			break;
			
		case 3:
				totalPagar = valorCompra - (valorCompra * 0.05);
				cout << "\Cliente Vip - 5% de desconto.\n";
				cout << "Total a pagar: " << totalPagar << "\n";
			break;
			
		default:
				cout << "Opção inválida!!!\n";
			break;
		
	}
	
	
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
