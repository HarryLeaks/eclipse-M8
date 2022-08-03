package Ficha2.ex4;

public class TestarAdmin {
	public static void main(String[] args){
		Admin administrador = new Admin();
		
		administrador.setNIF("12343565454zzz");
		administrador.setNome("Francisco");
		administrador.setSenha(12);
		
		if(administrador.autentica(administrador.getSenha()) == true) {
			System.out.println("Acessado com sucesso!!!\n");
			System.out.println("Nome: " + administrador.getNome());
			System.out.println("NIF: " + administrador.getNIF());
		}
	}
}
