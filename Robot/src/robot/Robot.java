package robot;

public class Robot {
	
	private int posicionX;
	
	private int posicionY;
	
	private Character sentido;

	public Robot(int posicionX, int posicionY, Character sentido) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.sentido = sentido;
	}

	@Override
	public String toString() {
		return "Robot [posicionX=" + posicionX + ", posicionY=" + posicionY + ", sentido=" + sentido + "]";
	}
	
	
	

}
