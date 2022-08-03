package projecto1;
import java.util.Scanner;

public class ordenar {
	public static void main(String[] args) {
		int []num = {2,5,4,2,7};
		int aux;
		
		for(int i = 0; i < num.length; i++){
			for(int b = i; b < num.length; b++) {
				if(num[i] > num[b]) {
					aux = num[i];
					num[i] = num[b];
					num[b] = aux;
				}
			}
		}
		
		for(int i= 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		Scanner input = new Scanner(System.in);
		int a, b, c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(a > b && a > c) {
			if(b > c)
				System.out.println("a > b > c");
			else
				System.out.println("a > c > b");
		}else if(b > a && b > c) {
			if(a > c)
				System.out.println("b > a > c");
			else
				System.out.println("b > c > a");
		}else if(c > a && c > b){
			if(a > b)
				System.out.println("c > a > b");
			else
				System.out.println("c > b > a");
		}
		
	}
}
