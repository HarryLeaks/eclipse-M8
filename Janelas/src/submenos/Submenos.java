package submenos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Submenos extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public void menuJanela() {
		setTitle("Menu de Navegação");
		setSize(600, 400);
		getContentPane().setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		criarMenu();
	}
	
	private void criarMenu() {
		ImageIcon inovo = new ImageIcon("src/submenos/novo.png");
		ImageIcon iabrir = new ImageIcon("src/submenos/abrir.png");
		ImageIcon iguardar = new ImageIcon("src/submenos/guardar.png");
		ImageIcon isair = new ImageIcon("src/submenos/sair.png");
		ImageIcon idisco = new ImageIcon("src/submenos/disco.png");
		ImageIcon iemail = new ImageIcon("src/submenos/email.jpg");
		ImageIcon ipen = new ImageIcon("src/submenos/pen.png");
		ImageIcon iimp = new ImageIcon("src/submenos/importar.png");
		
		JMenuBar menubar = new JMenuBar();
		JMenu opc = new JMenu("Ficheiro");
		JMenu importar = new JMenu("Importar Ficheiro");
		
		JMenuItem disco = new JMenuItem("Importar ficheiro....", idisco);
		JMenuItem email = new JMenuItem("Importar do email....", iemail);
		JMenuItem pen = new JMenuItem("Importar da pen.....", ipen);
		
		importar.setIcon(iimp);
		importar.add(disco);
		importar.add(email);
		importar.add(pen);
		
		JMenuItem novo = new JMenuItem("Novo", inovo);
		novo.setToolTipText("Guardar Ficheiro");
		
		JMenuItem abrir = new JMenuItem("Abrir", iabrir);
		abrir.setToolTipText("Abrir Ficheiro");
		
		JMenuItem guardar = new JMenuItem("Guardar", iguardar);
		guardar.setToolTipText("Guardar Ficheiro");
		
		JMenuItem sair = new JMenuItem("Sair", isair);
		sair.setToolTipText("Sair do Programa");
		
		opc.setIcon(inovo);
		opc.add(novo);
		opc.add(abrir);
		opc.add(guardar);
		opc.addSeparator();
		opc.add(importar);
		opc.addSeparator();
		opc.add(sair);
		
		menubar.add(opc);
		
		setJMenuBar(menubar);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Submenos win = new Submenos();
		win.menuJanela();
	}
}
