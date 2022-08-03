package janelaC;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Entrada{
	private JFrame janela = new JFrame();
	private JPanel painel = new JPanel();
	
	private JLabel txt1 = new JLabel("WELCOME");
	private JLabel txt2 = new JLabel("A JANELA DE LOGIN");
	private JLabel txt3 = new JLabel("UTILIZADOR");
	private JLabel txt4 = new JLabel("PALAVRA-PASSE");
	private JLabel txt5 = new JLabel("Precisa de ajuda?");
	
	private JTextField jtf1 = new JTextField();
	private JPasswordField jpf1 = new JPasswordField();
	
	private JButton ok = new JButton(new ImageIcon("src/janelaC/ok.png")); 
	private JButton ajuda = new JButton(new ImageIcon("src/janelaC/ajuda.png"));

	public void janelaLogin() {
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("E N T R A D A");
		janela.setSize(550, 250);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.add(painel);
		painel.setLayout(null);
		
		painel.setOpaque(true);
		painel.setBackground(new Color(200, 120, 200));
		
		txt1.setBounds(150, 10, 200, 25);
		painel.add(txt1);
		
		txt2.setBounds(170, 25, 200, 25);
		painel.add(txt2);
		
		txt5.setBounds(390, 120, 200, 25);
		painel.add(txt5);
		
		txt3.setBounds(30, 70, 200, 25);
		painel.add(txt3);
		
		jtf1.setBounds(130, 70, 150, 25);
		painel.add(jtf1);
		
		txt4.setBounds(30, 120, 100, 25);
		painel.add(txt4);
		
		jpf1.setBounds(130, 120, 150, 25);
		painel.add(jpf1);
		
		ok.setBounds(130, 150, 150, 25);
		painel.add(ok);
		
		ajuda.setBounds(370, 150, 150, 25);
		painel.add(ajuda);
		
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Entrada window = new Entrada();
		window.janelaLogin();
	}
}
