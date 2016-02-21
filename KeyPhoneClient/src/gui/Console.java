package gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Console extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8300359331353648197L;
	private JTextArea output;
	
	public Console(int width, int height) {
		output = new JTextArea();
		output.setPreferredSize(new Dimension(width, height));
		add(output);
	}
	
	public void updatePanel(String msg) {
		output.append(msg + '\n');
	}
}
