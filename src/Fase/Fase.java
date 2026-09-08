package Fase;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import Outros.InteligenciaBasica;
import Outros.Teclado;

public class Fase extends JPanel implements ActionListener{

	
//variaveis;
	
	private Image background;
	private ImageIcon referencia;
	private Teclado teclado;
	private Timer timer = new Timer (30,this);
	private Jogador jogador;
	private Inimigo[] inimigo = new Inimigo[5];
	private Colisao colisao;
	private Paredes paredes;
	private InteligenciaBasica ia;
	
	public Fase() {
	
	referencia = new ImageIcon("ImagemReferencia/Backgroud.png");
	background = referencia.getImage();
	
	//objetos;
	paredes = new Paredes();
	jogador = new Jogador(background);
	ia = new InteligenciaBasica(jogador);
	inimigo[0] = new Inimigo(0, 100, background, ia, jogador);
	inimigo[1] = new Inimigo(680, 192, background, ia, jogador);
	inimigo[2] = new Inimigo(395, 200, background, ia, jogador);
	inimigo[3] = new Inimigo(250, 400, background, ia, jogador);
	inimigo[4] = new Inimigo(800, 500, background, ia, jogador);
	teclado = new Teclado (jogador);
	colisao = new Colisao(jogador, inimigo, paredes);
	
	//essencial para o correto funcionamento;
	addKeyListener(teclado);
	setFocusable(true);
	timer.start();
	
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, this);
		
		g.drawImage(jogador.JogadorImage(), jogador.GetX(), jogador.GetY(), this);	
		
		//inimigos;
		g.drawImage(inimigo[0].InimigoImage(), inimigo[0].GetX(), inimigo[0].GetY(), this);
		g.drawImage(inimigo[1].InimigoImage(), inimigo[1].GetX(), inimigo[1].GetY(), this);
		g.drawImage(inimigo[2].InimigoImage(), inimigo[2].GetX(), inimigo[2].GetY(), this);
		g.drawImage(inimigo[3].InimigoImage(), inimigo[3].GetX(), inimigo[3].GetY(), this);
		g.drawImage(inimigo[4].InimigoImage(), inimigo[4].GetX(), inimigo[4].GetY(), this);
		
		//paredes da safe zone;
		g.drawImage(paredes.IP4(), 712, 600, this);
		g.drawImage(paredes.IP4(), 470, 600, this);
		g.drawImage(paredes.IP3(), 470, 630, this);
		g.drawImage(paredes.IP3(), 830, 630, this);
		
		//paredes do cenario;
		g.drawImage(paredes.IP1(), 200, 200, this);
		g.drawImage(paredes.IP1(), 350, 50, this);
		g.drawImage(paredes.IP4(), 450, 300, this);
		g.drawImage(paredes.IP4(), 232, 500, this);
		g.drawImage(paredes.IP1(), 950, 270, this);
		g.drawImage(paredes.IP1(), 600, 100, this);
		g.drawImage(paredes.IP2(), 632, 250, this);
		g.drawImage(paredes.IP4(), 150, 650, this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		jogador.atualização();
		inimigo[0].Atualizacao();
		inimigo[1].Atualizacao();
		inimigo[2].Atualizacao();
		inimigo[3].Atualizacao();
		inimigo[4].Atualizacao();
		colisao.Update();
		repaint();
		
	}

}
