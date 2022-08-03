package alunos;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
	public static void mostrar_aluno(AlunosVF[] alunos) {
		for(int i = 0; i < 3; i++)
			System.out.printf("Nome: %s  Nascimento: %d  CC: %s  Turma: %d  Ano: %d\n\n", alunos[i].ver_nome(), alunos[i].ver_AnoNasc(), alunos[i].ver_CC(), alunos[i].ver_Turma(), alunos[i].ver_Ano());
	}
	
	public static void idade_aluno(AlunosVF[] alunos) {
		LocalDate date = LocalDate.now();
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("Idade de %s: %d\n", alunos[i].ver_nome(), date.getYear() - alunos[i].ver_AnoNasc());
		}
	}
	
	public static void main(String[] args) {
		AlunosVF[] alunos = new AlunosVF[3];
		
		Scanner input = new Scanner(System.in);
		String nome;
		int anoNasc;
		String CC;
		int turma;
		int ano;
		
		for(int i = 0; i < 3; i++) {
			alunos[i] = new AlunosVF();
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("Digite o nome: ");
			nome = input.next();
			System.out.printf("Digite o ano de nascimento: ");
			anoNasc = input.nextInt();
			System.out.printf("Digite o CC: ");
			CC = input.next();
			System.out.printf("Digite a turma: ");
			turma = input.nextInt();
			System.out.printf("Digite o ano: ");
			ano = input.nextInt();
			
			alunos[i].criar_aluno(nome, anoNasc, CC, turma, ano);
		}
		
		mostrar_aluno(alunos);
		idade_aluno(alunos);
		
		input.close();
	}
}
