/*
 
 Crie um algoritmo usando DoWhile que solicite
    ao usuário a entrada de N números inteiros e mostre
    na tela se este número é positivo ou negativo e só
    encerre o programa quando o usuário digitar o 
    número 0.
 
 */

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile_Verfica_Numero_Positivo_Negativo {

    public static void main(String[] args) {

        int numero;

        //do - faça
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ou 0 para sair"));

            //if - se
            if (numero > 0) {

                System.out.println(numero + " positivo!");

            } else if (numero < 0) {

                System.out.println(numero + " negativo!");

            }

            //while - enquanto
            //!= - Diferente
        } while (numero != 0);

        System.out.println(" Ate a proxima!\n");

    }


}
