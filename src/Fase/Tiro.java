package Fase;

import java.awt.Image;

public class Tiro {

private int x, y;
private Image tiro;
private boolean visivel = false;
private int velocidade = 4;
private int xMax = 1400, yMax = 800;


public Tiro(int x, int y) {
	this.x = x;
	this.y = y;
	visivel = true;
}

public void Update(){
	
	x += velocidade;
	y += velocidade;
	
	if(x >= xMax) {
		visivel = false;
	}
	if(y >= yMax) {
		visivel = false;
	}
}

}
