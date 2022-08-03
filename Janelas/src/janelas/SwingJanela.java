package janelas;

import javax.swing.JFrame;

public class SwingJanela extends JFrame{
	public static final long serialVersionUID = 1L;
	
	public SwingJanela() {
		super("As minhas opções");
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingJanela();
	}
}
