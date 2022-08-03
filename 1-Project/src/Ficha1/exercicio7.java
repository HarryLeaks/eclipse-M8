package Ficha1;
import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		check(false);
	}
	
	public static void check(boolean verify) {
		Scanner input = new Scanner(System.in);
		
		int idade1, idade2;
		System.out.println("Digite a sua idade: ");
		idade1 = input.nextInt();
		
		System.out.println("Digite a idade da sua mãe: ");
		idade2 = input.nextInt();
		
		if(idade1 <= idade2) {
			System.out.println("Resultado: " + (idade2-idade1));
		}else {
			System.out.println("As idades não podem estar corretas");
			verify = false;
			check(verify);
		}
		input.close();
	}
}
