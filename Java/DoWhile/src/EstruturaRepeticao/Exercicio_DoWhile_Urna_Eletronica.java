/*
 
 Crie um algoritmo usando Do While , Switch Case 
    e If que receba o nome de 3 candidatos e em seguida
    solicite N votos a esses candidatos só encerre
    o programa quando digitar 0 e em seguida, imprima
    o total de votos que cada candidato recebeu e 
    apresente que venceu a eleição.
 
 */

package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio_DoWhile_Urna_Eletronica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String candidato1, candidato2, candidato3;
        int votosCandidato1, votosCandidato2, votosCandidato3;
        int votacao, totalVotos, maiorVotacao;

        votosCandidato1 = votosCandidato2 = votosCandidato3 = 0;

        System.out.println("Nome Candidato 1");
        candidato1 = scanner.nextLine();

        System.out.println("Nome Candidato 2");
        candidato2 = scanner.nextLine();

        System.out.println("Nome Candidato 3");
        candidato3 = scanner.nextLine();

        totalVotos = 0;

        //do - faça
        do {

            System.out.println("Digite o numero do seu candidato para votar: ");
            votacao = scanner.nextInt();

            //switch - Escolha
            switch (votacao) {

                //case - Caso
                case 1: {

                    //Somando 1 na variável votos
                    votosCandidato1++;
                    totalVotos++;

                    //break - Encerra
                    break;
                }

                case 2: {

                    //Somando 1 na variável votos
                    votosCandidato2++;
                    totalVotos++;

                    //break - Encerra
                    break;
                }

                case 3: {

                    //Somando 1 na variável votos
                    votosCandidato3++;
                    totalVotos++;

                    //break - Encerra
                    break;
                }

                default: {

                    //if - se
                    if (votacao != 0) {

                        System.out.println("Voto invalido");

                    }

                }


            }

            //while - enquanto
        } while (votacao != 0);

        System.out.println(candidato1 + " - " + votosCandidato1 + " votos!");
        System.out.println(candidato2 + " - " + votosCandidato2 + " votos!");
        System.out.println(candidato3 + " - " + votosCandidato3 + " votos!");
        System.out.println("Total votos Eleicao: " + totalVotos);

        maiorVotacao = votosCandidato1;
        //if - se
        if (votosCandidato2 > maiorVotacao) {
            maiorVotacao = votosCandidato2;
        }

        if (votosCandidato3 > maiorVotacao) {
            maiorVotacao = votosCandidato3;
        }

        System.out.println("Candidato Vencedor da Eleicao ");

        if (votosCandidato1 == maiorVotacao) {
            System.out.println(candidato1 + " ganhou a eleicao com " + votosCandidato1 + " votos!");
        }
        if (votosCandidato2 == maiorVotacao) {
            System.out.println(candidato2 + " ganhou a eleicao com " + votosCandidato2 + " votos!");
        }
        if (votosCandidato3 == maiorVotacao) {
            System.out.println(candidato3 + " ganhou a eleicao com " + votosCandidato3 + " votos!");
        }


    }

}
