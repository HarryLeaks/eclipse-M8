package Tabela;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;

import com.toedter.calendar.JDateChooser;

public class Nvcomp {
	private JFrame janela;
	private JPanel painel;
	private JTextArea area;
	private JLabel txt, jldata;
	private JDateChooser data;
	private JScrollPane elev, elev1;
	private JTable tabela;
	private JSlider deslizar;
	
	String [] colunas = { "Nome", "Telefone", "Email" };
	String [][] contactos = { 
			{"Ana", "91 11111", "ana@gmail.com"},
			{"Maria", "91 22222", "maria@gmail.com"},
			{"Joao", "91 33333", "joao@gmail.com"} 
			};
	
	public void janelanv() {
		janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Calendario");
		janela.setSize(400, 400);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		
		painel = new JPanel();
		painel.setOpaque(true);
		painel.setBackground(new Color(1, 4, 238));
		painel.setLayout(null);
		
		janela.add(painel);
		
		//Text area
		txt = new JLabel("Escreva a sua opinião: ");
		txt.setBounds(10, 6, 150, 25);
		
		area = new JTextArea();
		area.setBounds(10, 6, 150, 25);
		area.setLineWrap(true);
		area.setEditable(true);
		area.setWrapStyleWord(true);
		elev = new JScrollPane(area);
		elev.setBounds(10, 30, 100, 100);
		
		//JTable
		tabela = new JTable(contactos, colunas);
		elev1 = new JScrollPane(tabela);
		elev1.setBounds(10, 150, 375, 80);
		tabela.setEnabled(false);
		//Fazer um slider
		deslizar = new JSlider(JSlider.HORIZONTAL, 0, 40, 10);
		deslizar.setMinorTickSpacing(2);
		deslizar.setMajorTickSpacing(10);
		deslizar.setPaintTicks(true);
		deslizar.setPaintLabels(true);
		deslizar.setBounds(10, 300, 350, 30);
		
		data = new JDateChooser();
		data.setBounds(170, 30, 100, 25);
		jldata = new JLabel("data nascimento");
		jldata.setBounds(170, 8, 100, 20);
		
		painel.add(txt);
		painel.add(elev);
		painel.add(elev1);
		painel.add(deslizar);
		painel.add(jldata);
		painel.add(data);
		
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Nvcomp win = new Nvcomp();
		win.janelanv();
	}
}
