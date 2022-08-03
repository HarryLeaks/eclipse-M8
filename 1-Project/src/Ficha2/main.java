package Ficha2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Marcas []carros = new Marcas[3];
		Marcas Max = new Marcas();
		
		Scanner input = new Scanner(System.in);
		
		String modelo;
		String cor;
		String marca;
		double velocidade;
		
		double maiorVelocidade = 0;
		String maiorMarca = null;
		
		for(int i = 0; i < carros.length; i++) {
			carros[i] = new Marcas();
			
			System.out.printf("Digite a marca: ");
			marca = input.next();
			System.out.printf("Digite o modelo: ");
			modelo = input.next();
			System.out.printf("Digite a cor: ");
			cor = input.next();
			
			do {
			System.out.printf("Digite a velocidade: ");
			velocidade = input.nextDouble();
			}while(velocidade <= 0);
			
			carros[i].setCarros(marca, modelo, cor, velocidade);
		}		
		
		/*
		for(int i = 0; i < 3; i++) {
			if(maiorVelocidade < carros[i].getVelocidade()) {
				maiorVelocidade = carros[i].getVelocidade();
				maiorMarca = carros[i].getMarca();
			}
		}
		System.out.printf("Marca: %s\nMaior velocidade: %s", maiorMarca, maiorVelocidade);
		*/
		Max.GetMax(carros);
	}
}
