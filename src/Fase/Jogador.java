package Fase;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Jogador {

private Image jogador;
private ImageIcon referencia;
private int x = 650, y = 700;
private int xR = x, yR = y;
private int dx, dy;
private int xLimite, yLimite;
private int e;
private Image background;
private Rectangle hitbox;
private boolean rectangleBoolean = false;
private int velocidadeJogador = 8;

public Jogador(Image i) {
	
	referencia = new ImageIcon("imagemReferencia/jogador.png");
	jogador = referencia.getImage();
	hitbox = new Rectangle(xR - 2 , yR - 2, 33, 33);
	
	background = i;
	xLimite = background.getWidth(null) - 50;
	yLimite = background.getHeight(null) - 73;
	
}
public void atualização() {
	HitboxPrevisao();
	if(rectangleBoolean) {
	movimento();
	}
	LimiteMapa();

}

public void movimento(){
	
//movimento do personagem;
x += dx;
y += dy;

}
public void HitboxPrevisao() {//eu estou testando onde o personagem vai andar por isso x ou y soma com a aceleração dentro de xR ou yR;

xR = x + dx;
yR = y + dy;

hitbox.setLocation(xR, yR);

}

public void LimiteMapa() {
	
	if(x <= 0) {
		x = 0;
	}
	if(x >= xLimite) {
		x = xLimite;
	}
	if(y <= 0) {
		y = 0;
	}
	if(y >= yLimite) {
		y = yLimite;
	}

}

//teclado;
public void keyPressed(KeyEvent e) {
	
	this.e = e.getKeyCode();
	
	if(this.e == KeyEvent.VK_W) {
		dy = - velocidadeJogador;
	}
	if(this.e == KeyEvent.VK_S) {
		dy = velocidadeJogador;
	}
	if(this.e == KeyEvent.VK_A) {
		dx = - velocidadeJogador;
	}
	if(this.e == KeyEvent.VK_D) {
		dx = velocidadeJogador;
	}

	
}
public void keyReleased(KeyEvent e) {
	
	this.e = e.getKeyCode();
	
	if(this.e == KeyEvent.VK_W) {
		dy = 0;
	}
	if(this.e == KeyEvent.VK_S) {
		dy = 0;
	}
	if(this.e == KeyEvent.VK_A) {
		dx = 0;
	}
	if(this.e == KeyEvent.VK_D) {
		dx = 0;
	}
}

//retorno para o player
public void RectangleBoolean(boolean e) {
	rectangleBoolean = e;
}

//retornos para a classe fase;
public Image JogadorImage() {
	return jogador;
}

public Rectangle Previsao() {
	return hitbox;
}

public int GetX() {
	return x;
}

public int GetY() {
	return y;
}

}
