package projecto1;

import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		long fat = 1;
		
		System.out.println("Digite um numero: ");
		num = input.nextInt();
		
		for(long i = fat; i <= num; i++)
			fat *= i;
		
		System.out.printf("Fatorial de %d é %d", num, fat);
		input.close();
	}
}
