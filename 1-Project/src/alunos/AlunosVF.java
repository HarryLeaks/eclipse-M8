package alunos;

public class AlunosVF {
	private String nome;
	private int anoNascimento;
	private String CC;
	private int turma;
	private int ano;
	
	public void criar_aluno(String nome, int anoNascimento, String CC, int turma, int ano) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.CC = CC;
		this.turma = turma;
		this.ano = ano;
	}
	
	public String ver_nome() {
		return nome;
	}
	
	public int ver_AnoNasc() {
		return anoNascimento;
	}
	
	public String ver_CC() {
		return CC;
	}
	
	public int ver_Turma() {
		return turma;
	}
	
	public int ver_Ano() {
		return ano;
	}
}
