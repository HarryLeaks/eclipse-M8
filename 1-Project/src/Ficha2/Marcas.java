package Ficha2;

public class Marcas {
	private String marca;
	private String modelo;
	private String cor;
	private double velocidade;
	
	public void setCarros(String marca, String modelo, String cor, double velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocidade = velocidade;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public double getVelocidade() {
		return this.velocidade;
	}
	
	public void GetMax(Marcas[] carros) {
		double maiorVelocidade = 0;
		String maiorMarca = null;
		
		for(int i = 0; i < 3; i++) {
			if(maiorVelocidade < carros[i].velocidade) {
				maiorVelocidade = carros[i].velocidade; //podemos aceder aos atributos dos outros objetos neste ficheiro
				maiorMarca = carros[i].marca;
			}
		}
		System.out.printf("Marca: %s\nMaior velocidade: %s", maiorMarca, maiorVelocidade);
	}
}
