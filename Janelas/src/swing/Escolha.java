package swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Escolha extends JFrame{
	private static final long serialVersionUID = 1L;
	private JFrame janela = new JFrame();
	private JPanel panel = new JPanel(); //criamos um painel (swing puro)
	
	private ButtonGroup cores = new ButtonGroup();
	private JRadioButton branco = new JRadioButton("Branco", true);
	private JRadioButton amarelo = new JRadioButton("Amarelo");
	private JRadioButton vermelho = new JRadioButton("Vermelho");
	private JRadioButton preto = new JRadioButton("Preto");
	
	public void botoes() {
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Radio Button");
		janela.setSize(250, 200);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.add(panel);
		panel.setLayout(null);
		
		branco.setBounds(10, 10, 100, 20);
		amarelo.setBounds(10, 40, 100, 20);
		vermelho.setBounds(10, 70, 100, 20);
		preto.setBounds(10, 100, 100, 20);
		
		cores.add(branco);
		cores.add(amarelo);
		cores.add(vermelho);
		cores.add(preto);
		
		panel.add(branco);
		panel.add(amarelo);
		panel.add(vermelho);
		panel.add(preto);
		
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Escolha win = new Escolha();
		win.botoes();
	}
}
