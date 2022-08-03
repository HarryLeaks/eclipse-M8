package Ficha1;

import java.util.Scanner;
import java.util.Scanner.*;
import java.math.*;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double c1, c2;
		
		System.out.println("Digite os valores: ");
		c1 = input.nextDouble();
		c2 = input.nextDouble();
		
		System.out.printf("Resultado: %.1f", (Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2)))); //uma casa decimal
		input.close();
	}
}
