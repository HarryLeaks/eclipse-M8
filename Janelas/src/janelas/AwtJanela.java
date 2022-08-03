package janelas;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Button;

public class AwtJanela extends Frame{
	private static final long serialVersionUID = 1L;
	private Button b = new Button("Botão");
	
	public void AwtJanela() {
		setLayout(new FlowLayout());
		setTitle("Janela");
		setSize(500, 300);
		b.setBounds(50, 50, 50, 50);
		add(b);
		
		HandlerClass handler = new HandlerClass();
		b.addActionListener(handler);
	}
	
	public class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getActionCommand() == "Botão") {
				BoxMsg box = new BoxMsg();
				box.setVisible(true);
				box.BoxMsg();
			}
		}
	}
	
	public static void main(String[] args) {
		AwtJanela gui = new AwtJanela();
		gui.setVisible(true);	
		gui.AwtJanela();
	}
}
