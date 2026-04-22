//
// Created by fernandomelo on 22/04/2026.
//
#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;

int main(){

    //Biblioteca responsável pelos acentos nas letras e palavras
    setlocale(LC_ALL, "Portuguese");

    /*Exercício
        Crie um algoritmo que solicite um número inteiro positivo
        ao usuário e depois imprima x vezes os números naturais ímpares.

        ex: Digitar o número 5 imprimir (1, 3, 5, 7, 9)
    */

    int numero, contador, impar;

    cout << "Digite um número inteiro: \n";
    cin >> numero;

    contador = 0;
    impar = 1;

    //while = enquanto
    while ( contador <= numero ){

        cout << "\n" << impar;
        impar = impar + 2;
        contador++;

    }



    //Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
    system("pause");

    //Tipo de retorno da função main que é um inteiro
    return 0;
}
