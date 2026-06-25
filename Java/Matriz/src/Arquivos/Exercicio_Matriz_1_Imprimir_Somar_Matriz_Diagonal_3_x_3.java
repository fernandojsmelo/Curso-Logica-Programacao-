/*
 
 Crie um algoritmo com uma matriz 3 x 3 que permita
  a entrada de números digitados pelo usuário, e na
  sequência, imprima todos os números que foram digitados
  e imprima também na linha de baixo apenas os números
  da Diagonal da Matriz e por último, imprima a soma
  sssda Diagonal.
 
 */

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_1_Imprimir_Somar_Matriz_Diagonal_3_x_3 {

    public static void main(String[] args) {

        Scanner objetoNumero = new Scanner(System.in);

        //[][] - Matriz inteiros
        int[][] numeros = new int[3][3];

        //for - para
        //Percorre linha por linha
        //Preenchendo os valores da Matriz
        for (int linha = 0; linha < 3; linha++) {

            //Percorre coluna por coluna
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.println("Digite um numero na linha: " + linha + " - coluna: " + coluna + ": ");
                numeros[linha][coluna] = objetoNumero.nextInt();

            }

        }

        int somaDiagonal = 0;

        //Imprimindo os valores da Matriz
        for (int linha = 0; linha < 3; linha++) {

            //Percorre coluna por coluna e imprime as colunas
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.print(numeros[linha][coluna] + "  ");

                somaDiagonal = numeros[0][0] + numeros[1][1] + numeros[2][2];

            }

            //Pulo uma linha
            System.out.println("");


        }

        System.out.println("\nImprimir numeros Diagonal");
        System.out.print(numeros[0][0] + "  ");
        System.out.print(numeros[1][1] + "  ");
        System.out.print(numeros[2][2] + "  ");
        System.out.print("\nSoma da Diagonal: " + somaDiagonal);

    }

}
