package Ficha2.ex4;

public class Admin extends Funcionario{
	private int senha = 1234;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(senha == getSenha()) {
			return true;
		}else {
			return false;
		}
	}
}
