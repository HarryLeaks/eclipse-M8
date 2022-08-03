package projecto1;

public class exercicio {
	public static void main(String[] args) {
		int[] vetor = {2,5,0,1,0,4};
		int cont = 0;
		
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] != 0)
				cont++;
		}
		
		System.out.println("Numero de elementos diferente de 0: " + cont);
	}
}
