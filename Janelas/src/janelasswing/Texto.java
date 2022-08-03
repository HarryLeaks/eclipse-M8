package janelasswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Texto extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JLabel jlNome = new JLabel("Nome Aluno: ");
	private JTextField jlfNome = new JTextField();
	
	public void Text() {
		//setLayout(new FlowLayout());
		setTitle("Janela");
		setResizable(false);
		setSize(500, 400);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlNome.setBounds(10, 10, 110, 18);
		add(jlNome);
		jlfNome.setBounds(110, 10, 200, 20);
		add(jlfNome);
	}
	
	public static void main(String[] args) {
		Texto win = new Texto();
		win.Text();
		win.setVisible(true);
	}
}
