package projecto1;
import java.util.Scanner;

public class maiusculas {
	public static void main(String[] args) {
		String palavra;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite a palavra:");
		palavra = input.next();
		
		//palavra = new String(palavra);
		System.out.println("Maiusculas: " + palavra.toUpperCase());
		input.close();
	}
}
