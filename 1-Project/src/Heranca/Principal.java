package Heranca;

public class Principal {
	public static void main(String[] args) {
		Transporte t1 = new Transporte();
		t1.setCapacidade(300);
		System.out.println("A capacidade de T1 (transporte) é: " + t1.getCapacidade());		
		
		Terrestre t2 = new Terrestre();
		t2.setCapacidade(300);
		t2.setNumerodeRodas(4);
		System.out.printf("Capacidade: %d\n", t2.getCapacidade());
		System.out.printf("Numero de rodas: %d\n\n", t2.getNumerodeRodas());
		
		
		Automovel t3 = new Automovel();
		t3.setCapacidade(300);
		t3.setNumerodeRodas(4);
		t3.setCor("Azul");
		t3.setMatricula("999-z2");
		System.out.printf("Capacidade: %d\n", t3.getCapacidade());
		System.out.printf("Numero de rodas: %d\n", t3.getNumerodeRodas());
		System.out.printf("Cor: %d\n", t3.getCor());
		System.out.printf("Matricula: %d\n", t3.getMatricula());
	}
}
