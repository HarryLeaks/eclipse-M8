package projecto1;

public class vetores {
	public static void main(String[] args) {
		int[] lista = {1, 2, 3, 4, 5};
		int resultado = 1; 
		
		for(int i = 0; i < lista.length; i++) {
			resultado *= lista[i];
		}
		
		System.out.println("Resultado: " + resultado);
	}
}
