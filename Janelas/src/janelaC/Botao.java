package janelaC;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;

public class Botao extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JSeparator jSep = new JSeparator(); //Separador
	private JPasswordField jPass = new JPasswordField();
	private JButton jBtn = new JButton("OK");
	
	private JTextField jTf = new JTextField();
	private JTextField jTf2 = new JTextField();
	
	private JLabel jLb = new JLabel("Escola que frequenta: ");
	private JLabel jLb2 = new JLabel("Palavra passe: ");
	private JLabel jLb3 = new JLabel("Nome: ");
	
	public void janela() {
		setSize(400, 255);
		setTitle("Botão");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null); //painel
		setLocationRelativeTo(null);
		
		jLb3.setBounds(10, 10, 100, 20);
		jTf.setBounds(110, 10, 200, 20);
		add(jLb3);
		add(jTf);
		
		jLb.setBounds(10, 50, 150, 18);
		jTf2.setBounds(150, 50, 150, 18);
		add(jLb2);
		add(jTf2);
		
		jSep.setBounds(5, 100, 375, 30);
		add(jSep);
		
		jLb2.setBounds(10, 120, 90, 18);	
		jPass.setBounds(150, 120, 100, 18);
		add(jLb);
		add(jPass);
		
		jBtn.setBounds(230, 170, 70, 33);
		jBtn.setMnemonic('O'); //sublinha o O
		add(jBtn);
	}
	
	public static void main(String[] args) {
		Botao win = new Botao();
		win.janela();
		win.setVisible(true);
	}
}
