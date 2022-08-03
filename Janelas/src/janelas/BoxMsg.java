package janelas;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class BoxMsg extends Frame{
	private static final long serialVersionUID = 1L;
	private Label l = new Label();
	
	public void BoxMsg() {
		setLayout(new FlowLayout());
		setTitle("BoxMsg");
		setSize(100, 100);
		l.setBounds(50,  50, 50, 50);
		l.setText("Carregou no Botão");
		add(l);
	}
}
