package MetodosClasses;

import java.util.Scanner;

public class CursoCienciaComputacao {

	public static void main(String[] args) {
		
		//Preenchendo os valores e imprimindo
		Materias aluno1 = new Materias("Python", 120, 59);
		Materias aluno2 = new Materias("Java", 80, 109);
		
		
		aluno1.nomeMateria = "Algebra";
		aluno1.quantidadeAlunos = 40;
		aluno1.quantidadeHoras = 50;
		
		System.out.println(aluno1.nomeMateria);
		System.out.println(aluno1.quantidadeAlunos);
		System.out.println(aluno1.quantidadeHoras);
		
		//------------------------------------------
		
		Scanner objetoNome = new Scanner(System.in);
		
		int qtdHoras, qtdAlunos;
		
		//for - para
		for(int contador = 1; contador <=3; contador++) {
			
			System.out.println("Digite a carga horaria do curso " + contador);
			qtdHoras = objetoNome.nextInt();
			
			System.out.println("Digite a quantidade de alunos ");
			qtdAlunos = objetoNome.nextInt();
			
			aluno1.soma(contador, qtdHoras, qtdAlunos);
			
		}

	}

}
