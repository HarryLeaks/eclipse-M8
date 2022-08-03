package Pessoas;

public class Pessoa {
	private int idade;
	private String nome;
	private char sexo;
	
	public void atribuir_caract(String nome,int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String mostrar_nome() {
		return nome;
	}
	
	public int mostrar_idade() {
		return idade;
	}
	
	public char mostrar_sexo() {
		return sexo;
	}
}
