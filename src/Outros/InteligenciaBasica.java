package Outros;

import java.util.Random;

import Fase.Inimigo;
import Fase.Jogador;

public class InteligenciaBasica {

private int contadorDecisao = 0;
private int r;
private int x;
private int y;
private int xJ, yJ;
private int xI, yI;
private Jogador jogador;
Inimigo inimigo;
boolean a = true;

Random random = new Random();

public InteligenciaBasica(Jogador jogador) {
	
this.jogador = jogador;
xJ = jogador.GetX();
yJ = jogador.GetY();

}

public void Update() {
	LocalizacaoJogador();
	BuscarJogador();
}

private void LocalizacaoJogador() {
	this.xJ = jogador.GetX();
	this.yJ = jogador.GetY();
}

public void MovimentoAleatorio(int e) {

contadorDecisao++;

if(contadorDecisao >= e) {
	
contadorDecisao = 0;

r = random.nextInt(5);

if(r == 0) {
	
	x = random.nextInt(6);

}else
if(r == 1) {
	
	x = -random.nextInt(6);
	
}else
if(r == 2 ) {
	
	y = random.nextInt(6);

}else
if(r == 3) {
	
	y = -random.nextInt(6);
	
}else
if(r == 4) {
	
	x = 0;
	y = 0;
	
}

}

}

private void BuscarJogador() {
	BuscaX();

}
private void BuscaX() {
if(xI > 0) {
	x = 5;
}else
if(xI < 300) {
	x = -5;
} 
if(xI >= 300){ 
x = 0; 
a = false;}
}
public boolean a() {
	return a;
}
public int GetX() {
	return x;
}
public int GetY() {
	return y;
}
}
