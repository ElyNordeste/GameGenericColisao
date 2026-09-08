package Janela;

import javax.swing.JFrame;

import Fase.Fase;

public class Janela extends JFrame {
	Fase fase;
	public Janela() {
		
		fase = new Fase();
		add (fase);
		setTitle("Tiro infinito");
		setSize(1360,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
		
	}
	
public static void main(String[] args) {
	new Janela();
}

}
