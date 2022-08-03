package janelaC;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Doispaineis {
	private JFrame janela;
	private JPanel painel1;
	private JPanel painel2;
	
	public void constJanela() {
		janela = new JFrame();
		janela.setSize(300, 300);
		janela.setLocationRelativeTo(null);
		
		painel1 = new JPanel();
		painel1.setBounds(0,0, 300, 100);
		painel1.setOpaque(true);
		painel1.setBackground(new Color(0, 255, 0));
		
		painel2 = new JPanel();
		painel2.setBounds(0, 151, 300, 150);
		painel2.setOpaque(true);
		painel2.setBackground(Color.GRAY);
		
		janela.add(painel1);
		janela.add(painel2);
		
		painel1.setLayout(null);
		painel2.setLayout(null);
		
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Doispaineis window = new Doispaineis();
		window.constJanela();
	}
}
