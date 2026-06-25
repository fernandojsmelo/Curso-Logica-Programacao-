package MetodosClasses;

public class Materias {
	
	//Atributos
	//public - Modificador de acesso
	//Private - S? pode ser lido ou alterado dentro da propria classe
	public String nomeMateria;
	public int quantidadeHoras = 0;
	public int quantidadeAlunos = 0;
	
	public Materias(String nMateria, int qtdeHoras, int qtdAlunos) {
		
		System.out.println("Materia: " + nMateria);
		System.out.println("Carga Horaria: " + qtdeHoras);
		System.out.println("Alunos Matriculados: " + qtdAlunos);
		System.out.println("------------------------\n");
		
	}
	
	int somaHoras = 0;
	int somaAlunos = 0;
	
	//Método para somar a quantidade de alunos e carga horária
	//de todos os cursos
	public void soma(int turma, int qtdHoras, int qtdAlunos) {
		
		somaHoras = somaHoras + qtdHoras;
		somaAlunos = somaAlunos + qtdAlunos;
		
		System.out.println("Turma: " + turma);
		System.out.println("Horas: " + qtdHoras + " - Alunos: " + qtdAlunos);
		System.out.println("Acumulado Horas: " + somaHoras + " - Acumulado Alunos: " + somaAlunos);
		System.out.println("------------------------\n");

		
		
	}
	

}
