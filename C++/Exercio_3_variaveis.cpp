//
// Created by fernandomelo on 17/04/2026.
//
#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main() {
    //Biblioteca responsavel pelos acentos nas letras e palavras
    setlocale(LC_ALL, "Portuguese");

    /* Exercício
     *	Crie um algoritmo que solicite ao usuario o valor que ele ganha por hora e o
     *	número de horas que ele trabalhou durante o mês.
     *	Depois calcule e mostre na tele o total que ele tem a receber naquele mês.
     *	e também efetue os seguintes descontos.
     *
     *	1) 11% para o Imposto de Renda,
     *	2) 8% para o INSS,
     *	3) 5% para o Sindicato.
     *
     *	Faça o calculo e imprima o resultado conforme mostrado abaixo:
     *		+ salário Bruto> R$
     *		- IR (11%) : R$
     *		- INSS (8%) : R$
     *		- Sindicato (5%) : R$
     *		= Salário Liquido: R$
     *	OBS>: Salário Bruto - Descontos = Salário Líquido
     *
     */

    double salarioHora, horasTrabalhadas, IR, INSS,
           sindicato, salarioBruto, salarioLiquido;

    cout << "Digite quanto você ganha por Hora: \n";
    cin >> salarioHora;

    cout << "Digite quanto Hora você trabalhou neste mês: \n";
    cin >> horasTrabalhadas;


    salarioBruto = salarioHora * horasTrabalhadas;
    IR = salarioBruto * (11.0 / 100);
    INSS = salarioBruto * (8.0 / 100);
    sindicato = salarioBruto * (5.0 / 100);
    salarioLiquido = salarioBruto - IR - INSS - sindicato;

    cout << "\n\n----------------------------------------------\n";
    cout << "+ salário Bruto> R$ " << salarioBruto << endl;
    cout << "- IR (11%) : R$ " << IR << endl;
    cout << "- INSS (8%) : R$ " << INSS << endl;
    cout << "- sindicato (5%) : R$ " << sindicato << endl;
    cout << "= Salário Liquido: R$ " << salarioLiquido << endl;

    // Impede o fechamento da tela após execução de código para dar tempo de testarmos e ver
    system("pause");
    return 0;
}