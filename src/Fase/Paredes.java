package Fase;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Paredes {

	private Image[] paredes = new Image[4];
	private int[] largura = new int[4];
	private int[] altura = new int[4];
	private ImageIcon referencia = new ImageIcon();
	private Rectangle[] rectangle = new Rectangle[12];
	
public Paredes() {

	referencia = new ImageIcon("ImagemReferencia/parede_media.png");
	paredes[0] = referencia.getImage();
	referencia = new ImageIcon("ImagemReferencia/parede_media2.png");
	paredes[1] = referencia.getImage();
	referencia = new ImageIcon("ImagemReferencia/parede_pequena.png");
	paredes[2] = referencia.getImage();
	referencia = new ImageIcon("ImagemReferencia/parede_pequena2.png");
	paredes[3] = referencia.getImage();
	
	//p1

	largura[0] = paredes[0].getWidth(null);
	altura[0] = paredes[0].getHeight(null);
	
	//p2
	largura[1] = paredes[1].getWidth(null);
	altura[1] = paredes[1].getHeight(null);
	
	//p3
	largura[2] = paredes[2].getWidth(null);
	altura[2] = paredes[2].getHeight(null);

	//p4
	largura[3] = paredes[3].getWidth(null);
	altura[3] = paredes[3].getHeight(null);
	
	//safe zone;
	rectangle[0] = new Rectangle(470, 595, 400, 200);
	
	//paredes;
	rectangle[1] = new Rectangle(194, 194, largura[0] + 9, altura[0] + 9); //verificado;
	rectangle[2] = new Rectangle(350, 50, largura[0], altura [0]);
	rectangle[3] = new Rectangle(450, 300, largura[3], altura[3]);
	rectangle[4] = new Rectangle(232, 500, largura[3], altura[3]);
	rectangle[5] = new Rectangle(950, 270, largura[0], altura[0]);
	rectangle[6] = new Rectangle(600, 100, largura[0], altura[0]);
	rectangle[7] = new Rectangle(632, 250, largura[1], altura[1]);//problema de colisao
	rectangle[8] = new Rectangle(150, 650, largura[3], altura[3]);
}

//largura e altura das paredes
public int LarguraP1() {
	return largura[0];
}
public int LarguraP2() {
	return largura[1];
}
public int LarguraP3() {
	return largura[2];
}
public int LarguraP4() {
	return largura[3];
}
public int AlturaP1() {
	return altura[0];
}
public int AlturaP2() {
	return altura[1];
}
public int AlturaP3() {
	return altura[2];
}
public int AlturaP4() {
	return altura[3];
}

//imagens das paredes
public Image IP1() {
	return paredes[0];
}
public Image IP2() {
	return paredes[1];
}
public Image IP3() {
	return paredes[2];
}
public Image IP4() {
	return paredes[3];
}
//retorno das hitbox's;
public Rectangle SafeZone() {
	return rectangle[0];
}
public Rectangle parede01() {
	return rectangle[1];
}
public Rectangle parede02() {
	return rectangle[2];
}
public Rectangle parede03() {
	return rectangle[3];
}
public Rectangle parede04() {
	return rectangle[4];
}
public Rectangle parede05() {
	return rectangle[5];
}
public Rectangle parede06() {
	return rectangle[6];
}
public Rectangle parede07() {
	return rectangle[7];
}
public Rectangle parede08() {
	return rectangle[8];
}
}
