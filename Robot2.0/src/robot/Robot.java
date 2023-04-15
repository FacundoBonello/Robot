package robot;

public class Robot {
	
	private int columnaX;
	
	private int filaY;
	
	private Character sentido;
	
	

	public Robot(int posicionX, int posicionY, Character sentido) {
		super();
		this.columnaX = posicionX;
		this.filaY = posicionY;
		this.sentido = sentido;
	}
	
      protected void avanzar(int casilla, Tablero tablero) {
		
		switch (this.getSentido()) {
		case  'N':
			
			
			int nuevaPosicion = this.getPosicionY() + casilla;
			
			if(nuevaPosicion <= tablero.getTamanioY()) {
			this.setPosicionY(nuevaPosicion);
			}
			
			break;
			
        case  'E':
			
			this.setPosicionX(this.getPosicionX() + casilla);
			
			break;
			
        case  'S':
			
			this.setPosicionY(this.getPosicionY() - casilla);
			
			break;
			
        case  'O':
	
	        this.setPosicionX(this.getPosicionX() - casilla);
	
	    break;

		
	}
		
	}
	
	


	public int getPosicionX() {
		return columnaX;
	}




	public void setPosicionX(int posicionX) {
		this.columnaX = posicionX;
	}




	public int getPosicionY() {
		return filaY;
	}




	public void setPosicionY(int posicionY) {
		this.filaY = posicionY;
	}




	public Character getSentido() {
		return sentido;
	}




	public void setSentido(Character sentido) {
		this.sentido = sentido;
	}




	@Override
	public String toString() {
		return "Robot [posicionX=" + columnaX + ", posicionY=" + filaY + ", sentido=" + sentido + "]";
	}



	
	
	
	

}
