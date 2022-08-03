package janelaC;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Combobox extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JFrame window  = new JFrame();
	private JPanel panel = new JPanel();
	
	private JLabel nome = new JLabel("Nome");
	private JLabel morada = new JLabel("Morada");
	
	private ImageIcon corto = new ImageIcon("bin/janelaC/corto.jpg");
	private JLabel foto = new JLabel("Foto do aluno", corto, SwingConstants.CENTER);
	private JLabel submeter = new JLabel("Botão para submeter o formulário");
	private JLabel idade = new JLabel("Tem mais de 18 anos?");
	
	private JTextField jtftxt1 = new JTextField("Escrever o nome...");
	private JTextField jtftxt2 = new JTextField("Escrever a morada...");
	
	private JButton botao = new JButton("OK");
	
	public void comboWindow() {
		window.setTitle("Informação Pessoal");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.add(panel);
		panel.setLayout(null);
		
		foto.setBorder(BorderFactory.createTitledBorder("Fotografia"));
		foto.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Sim");
		combo.addItem("Não");
		
		nome.setBounds(10, 10, 70, 25);
		panel.add(nome);
		
		jtftxt1.setBounds(80, 10, 230, 25);
		panel.add(jtftxt1);
		
		morada.setBounds(10, 60, 70, 25);
		panel.add(morada);
		
		jtftxt2.setBounds(80, 60, 390, 25);
		panel.add(jtftxt2);
		
		foto.setBounds(10, 100, 460, 180);
		panel.add(foto);
		
		idade.setBounds(10, 300, 130, 25);
		panel.add(idade);
		
		combo.setBounds(140, 300, 80, 25);
		panel.add(combo);
		
		submeter.setBounds(110, 380, 250, 30);
		panel.add(submeter);
		
		botao.setBounds(320, 380, 80, 30);
		panel.add(botao);
		
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		Combobox win = new Combobox();
		win.comboWindow();
	}
}
