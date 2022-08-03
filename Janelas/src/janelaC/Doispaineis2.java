package janelaC;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Doispaineis2 {
	private JFrame janela;
	private JPanel painel1;
	private JPanel painel2;
	private JLabel img;
	
	public void constJanela() {
		janela = new JFrame();
		janela.setSize(300, 300);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		
		painel1 = new JPanel();
		painel1.setBounds(0, 0, 300, 200);
		painel1.setOpaque(true);
		painel1.setBackground(new Color(0, 0, 0));
		img = new JLabel(new ImageIcon("src/janelaC/fox.jpg"));
		img.setBounds(-8, 0, 300, 200);
		painel1.add(img);
		
		painel2 = new JPanel();
		painel2.setBounds(0, 151, 300, 100);
		painel2.setOpaque(true);
		painel2.setBackground(Color.GRAY);
		
		janela.add(painel1);
		janela.add(painel2);
		
		painel1.setLayout(null);
		painel2.setLayout(null);
		
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Doispaineis2 window = new Doispaineis2();
		window.constJanela();
	}
}
