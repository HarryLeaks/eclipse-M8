package Pessoas;

public class main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		int idade;
		char sexo;
		String nome;
		
		pessoa.atribuir_caract("Francisco", 10, 'M');
		nome = pessoa.mostrar_nome();
		idade = pessoa.mostrar_idade();
		sexo = pessoa.mostrar_sexo();
		
		System.out.printf("%s %d %c", nome, idade, sexo);
	}
}
