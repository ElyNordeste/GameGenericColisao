package Outros;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Fase.Jogador;

public class Teclado extends KeyAdapter {
	
	Jogador jogador;
	
	public Teclado(Jogador jogador) {
	
		this.jogador = jogador;
	}

	@Override 
	public void keyPressed(KeyEvent e) { 
	jogador.keyPressed(e); 
	}
		
	@Override 
	public void keyReleased(KeyEvent e) { 
	jogador.keyReleased(e); 
	}
		}
