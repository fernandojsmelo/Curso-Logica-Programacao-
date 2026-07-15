using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*

    Exercício

    Crie um programa em C# que peça ao usuário para digitar
    dois números inteiros e exiba a soma desses números na tela.

 */

namespace Exercicio_Entrada_e_Saida_de_Dados
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //Pedir ao usuário para digitar o primeiro número
            Console.WriteLine("Digite o primeiro número: ");

            //Lê a entrada do usuário e converte para um número inteiro
            int numero1 = Convert.ToInt32(Console.ReadLine());

            //Pedir ao usuário para digitar o segundo número
            Console.WriteLine("Digite o segundo número: ");

            //Lê a entrada do usuário e converte para um número inteiro
            int numero2 = Convert.ToInt32(Console.ReadLine());

            //Calcula a soma dos dois números
            int soma = numero1 + numero2;

            //Exibe a soma na tela
            Console.WriteLine("Total: " + soma);

            //Aguarda o usuário pressionar uma tecla para sair
            Console.ReadKey();

        }
    }
}
