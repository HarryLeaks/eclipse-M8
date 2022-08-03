package calc;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		double num1 = 0, num2 = 0;
		int op = 0;
		
		Scanner input = new Scanner(System.in);
		
		//classes para fazer calculos
		//criacao de objetos
		somar sum = new somar();
		subtrair sub = new subtrair();
		multiplicar mult = new multiplicar();
		dividir div = new dividir();
		
		System.out.println("1-somar");
		System.out.println("2-subtrair");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("5-Sair");
	
		while(op != 5) {
			System.out.printf("\nDigite a opção: ");
			op = input.nextInt();
		
			if(op < 5) {
				System.out.printf("Digita o valor 1: ");
				num1 = input.nextDouble();
				System.out.printf("Digite o valor 2: ");
				num2 = input.nextDouble();
			}
				
				switch(op) {
				case 1:
					//System.out.printf("Res: %f", num1+num2);
					System.out.printf("Res: %.2f", sum.s(num1, num2));
					break;
				case 2:
					System.out.printf("Res: %.2f", sub.subtrair(num1, num2));
					break;
				case 3:
					System.out.printf("Res: %.2f", mult.multiplicar(num1, num2));
					break;
				case 4:
					System.out.printf("Res: %.2f", div.dividir(num1, num2));
					break;
				case 5:
					System.out.printf("Saindo...");
					break;
				default:
					System.out.printf("Erro...");
				}
			}
		input.close();
	}
}
