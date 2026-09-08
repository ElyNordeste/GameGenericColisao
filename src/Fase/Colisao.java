package Fase;

public class Colisao {

	private Jogador jogador;
	private Inimigo[] inimigo = new Inimigo[5];
	private Paredes paredes;
	
	public Colisao(Jogador jogador, Inimigo[] inimigo, Paredes paredes) {
		
		this.jogador = jogador;
		
		this.inimigo[0] = inimigo[0];
		this.inimigo[1] = inimigo[1];
		this.inimigo[2] = inimigo[2];
		this.inimigo[3] = inimigo[3];
		this.inimigo[4] = inimigo[4];
		
		this.paredes = paredes;
		
		
	}
	public void Update(){
		
		AutorizaAndar();
		ColisaoPersonagemInimigo();
		ColisaoSafeZone();
		Parede01();
		Parede02();
		Parede03();
		Parede04();
		Parede05();
		Parede06();
		Parede07();
		Parede08();
		
	}
	
private void AutorizaAndar() {

	jogador.RectangleBoolean(true);
	inimigo[0].RectangleBoolean(true);
	inimigo[1].RectangleBoolean(true);
	inimigo[2].RectangleBoolean(true);
	inimigo[3].RectangleBoolean(true);
	inimigo[4].RectangleBoolean(true);
	
}
	
private void ColisaoPersonagemInimigo() {
		
	for(int i = 0; i < inimigo.length; i++) {
		if(jogador.Previsao().intersects(inimigo[i].getRec())){
		
			jogador.RectangleBoolean(false);
			inimigo[i].RectangleBoolean(false);
		
		}
		}
		
	}
	
private void ColisaoSafeZone() {
		
		if(paredes.SafeZone().intersects(inimigo[0].getRec())){
			
			inimigo[0].RectangleBoolean(false);
			
		}
		if(paredes.SafeZone().intersects(inimigo[1].getRec())){
				
			inimigo[1].RectangleBoolean(false);
				
		}
		if(paredes.SafeZone().intersects(inimigo[2].getRec())){
				
			inimigo[2].RectangleBoolean(false);
				
		}
		if(paredes.SafeZone().intersects(inimigo[3].getRec())){
				
		inimigo[3].RectangleBoolean(false);
				
		}
		if(paredes.SafeZone().intersects(inimigo[4].getRec())){
			
			inimigo[4].RectangleBoolean(false);
					
			}
	}
	
private void Parede01() {
	if(paredes.parede01().intersects(jogador.Previsao())) {
		jogador.RectangleBoolean(false);
	}
	for(int i = 0; i < inimigo.length; i++) {
	if(paredes.parede01().intersects(inimigo[i].getRec())) {
		inimigo[i].RectangleBoolean(false);
	}
	}
}

private void Parede02() {
	if(paredes.parede02().intersects(jogador.Previsao())) {
		jogador.RectangleBoolean(false);
	}
	for(int i = 0; i < inimigo.length; i++) {
	if(paredes.parede02().intersects(inimigo[i].getRec())) {
		inimigo[i].RectangleBoolean(false);
	}
	}
}

private void Parede03() {
	if(paredes.parede03().intersects(jogador.Previsao())) {
		jogador.RectangleBoolean(false);
	}
	for(int i = 0; i < inimigo.length; i++) {
	if(paredes.parede03().intersects(inimigo[i].getRec())) {
		inimigo[i].RectangleBoolean(false);
	}
	}
}

private void Parede04() {
	if(paredes.parede04().intersects(jogador.Previsao())) {
		jogador.RectangleBoolean(false);
	}
	for(int i = 0; i < inimigo.length; i++) {
	if(paredes.parede04().intersects(inimigo[i].getRec())) {
		inimigo[i].RectangleBoolean(false);
	}
	}
}

private void Parede05() {
	if(paredes.parede05().intersects(jogador.Previsao())) {
		jogador.RectangleBoolean(false);
	}
	for(int i = 0; i < inimigo.length; i++) {
	if(paredes.parede05().intersects(inimigo[i].getRec())) {
		inimigo[i].RectangleBoolean(false);
	}
	}
}

private void Parede06() {
	if(paredes.parede06().intersects(jogador.Previsao())) {
		jogador.RectangleBoolean(false);
	}
	for(int i = 0; i < inimigo.length; i++) {
	if(paredes.parede06().intersects(inimigo[i].getRec())) {
		inimigo[i].RectangleBoolean(false);
	}
	}
}

private void Parede07() {
	if(paredes.parede07().intersects(jogador.Previsao())) {
		jogador.RectangleBoolean(false);
	}
	for(int i = 0; i < inimigo.length; i++) {
	if(paredes.parede07().intersects(inimigo[i].getRec())) {
		inimigo[i].RectangleBoolean(false);
	}
	}
}

private void Parede08() {
	if(paredes.parede08().intersects(jogador.Previsao())) {
		jogador.RectangleBoolean(false);
	}
	for(int i = 0; i < inimigo.length; i++) {
	if(paredes.parede08().intersects(inimigo[i].getRec())) {
		inimigo[i].RectangleBoolean(false);
	}
	}
}
	/*public void ColisaoSafeZone() {
		if(paredes.SafeZone().intersects(jogador.Previsao())) {
			jogador.RectangleBoolean(false);
		}else {
			jogador.RectangleBoolean(true);
		}
	}*/
	
}
