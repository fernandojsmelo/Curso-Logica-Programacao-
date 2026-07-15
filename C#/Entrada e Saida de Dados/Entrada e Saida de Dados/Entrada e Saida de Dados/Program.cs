using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Entrada_e_Saida_de_Dados
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //Pedir ao usuário para digitar seu nome
            Console.WriteLine("Digite seu nome:");

            //Cria uma variavel chamada nome que vai ler o que o usuário digitar
            String nome = Console.ReadLine();

            //Exibe a mensagem de saudação
            Console.WriteLine("\nOlá, " + nome + "!");

            //Pedir par ao usuário digitar a idade
            Console.WriteLine("\nDigite sua idade: ");

            //Lê a entrada do usuário e converte para um número inteiro
            int idade = Convert.ToInt32(Console.ReadLine());

            //Exibe a mensagem de saudação
            Console.WriteLine("\nOlá, " + nome + "! Você tem " + idade + " anos.");


            //Aguarda o usuário pressionar uma tecla para sair
            Console.ReadKey();

        }
    }
}
