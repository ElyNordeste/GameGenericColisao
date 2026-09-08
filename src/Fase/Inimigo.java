package Fase;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Outros.InteligenciaBasica;

public class Inimigo {

private Image inimigo;
private ImageIcon referencia;
private int x = 0, y = 0;
private int xR = x, yR = y;
private Rectangle rectangle;
private boolean rectangleBoolean = true;
private InteligenciaBasica ia;
private Image limiteMapa;
private int xLimite, yLimite;
Jogador jogador;
int xJ, yJ;

public Inimigo(int x, int y, Image e, InteligenciaBasica ia, Jogador jogador) {
	
	this.ia = ia;
	
	this.x = x;
	this.y = y;
	
	this.jogador = jogador;
	xJ = jogador.GetX();
	yJ = jogador.GetY();
	
	referencia = new ImageIcon("imagemReferencia/inimigo.png");
	inimigo = referencia.getImage();
	rectangle = new Rectangle(xR, yR, 32, 32);
	
	limiteMapa = e;
	xLimite = limiteMapa.getWidth(null) - 50;
	yLimite = limiteMapa.getHeight(null) - 73;
	
	
}
public void Atualizacao() {
	
	ia.MovimentoAleatorio(10);
	//ia.Update();
	HitboxPrevisao();
	if(rectangleBoolean) {
	Movimento();
	}
	LimiteMapa();
}

public void Movimento() {
	x += ia.GetX();
	y += ia.GetY();
}

public void HitboxPrevisao() {
	
	xR = x + ia.GetX();
	yR = y + ia.GetY();
	
	rectangle.setLocation(xR, yR);
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

public void RectangleBoolean(boolean e) {
	rectangleBoolean = e;
}

//retorno para classe da fase;
public Image InimigoImage() {
	return inimigo;
}

public Rectangle getRec() {
	return rectangle;
}

public int GetX() {
	return x;
}

public int GetY() {
	return y;
}

}
