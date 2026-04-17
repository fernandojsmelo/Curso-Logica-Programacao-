#include <iostream> //Entrada e saída de dados

#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

//VG - Variavel Global
double nota1VG, nota2VG, nota3VG;

int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	/*Exercício Variáveis Globais e Locais Média Aluno
	Crie um algoritmo que leia o nome e as 4 notas de um aluno e depois imprima 
	o nome e a média do aluno usando as variáveis Globais e Locais.	
	*/
	
	double variavelLocalNota4, media;
	string nomeAluno;
	
	cout << "Digite o nome do aluno(a): \n";
	getline(cin, nomeAluno);
	
	cout << "Digite a nota 1: \n";
	cin >> nota1VG;
	
	cout << "Digite a nota 2: \n";
	cin >> nota2VG;
	
	cout << "Digite a nota 3: \n";
	cin >> nota3VG;
	
	cout << "Digite a nota 4: \n";
	cin >> variavelLocalNota4;
	
	media = (nota1VG + nota2VG + nota3VG + variavelLocalNota4) / 4;
	
	cout << "\n-----------------------\n";
	cout << "Aluno(a): " << nomeAluno << "\n";
	cout << "Média: " << media << "\n";
	
	
	
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}
