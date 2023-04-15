package robot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Tablero {
	
	private int [][] tablero;
	private int tamanioX;
	private int tamanioY;
	

	public Tablero(int tamanioX,int tamanioY) {
		super();
		tablero = new int[tamanioY][tamanioX];
		this.tamanioX = tamanioX;
		this.tamanioY = tamanioY;
	}
	
	public Tablero() {
		
	}

	public int getTamanioX() {
		return tamanioX;
	}

	public void setTamanioX(int tamanioX) {
		this.tamanioX = tamanioX;
	}

	public int getTamanioY() {
		return tamanioY;
	}

	public void setTamanioY(int tamanioY) {
		this.tamanioY = tamanioY;
	}
	
	
	
	
	
	
	
	
}
	
	
	

	
