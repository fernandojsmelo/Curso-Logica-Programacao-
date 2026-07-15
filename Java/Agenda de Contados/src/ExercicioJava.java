//package Exercicios;

public class ExercicioJava {
    public static void main(String[] args) {

        String palavra = "Exemplo";
        String novaPalavra = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            novaPalavra += palavra.charAt(i);
        }

        System.out.println(novaPalavra);
    }
}