package robot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Tablero {
	
	private int [][] tablero;
	private int tamanioX;
	private int tamanioY;
	private Robot robot;
	private String comandos;

	public Tablero(int tamanioX,int tamanioY) {
		super();
		tablero = new int[tamanioX][tamanioY];
		this.tamanioX = tamanioX;
		this.tamanioY = tamanioY;
	}
	
	public Tablero() {
		
	}
	
	private void leerArchivo() throws IOException {
		
		FileReader fr = null;
        BufferedReader br = null;

        fr = new FileReader ("robot.in"); 
        br = new BufferedReader(fr);
        
        String linea = br.readLine();
        
        String [] datos;
        datos = linea.split(" ");
        
        robot= new Robot(Integer.parseInt(datos[0]),Integer.parseInt(datos[1]), datos[2].charAt(0));
        Tablero tablero = new Tablero(Integer.parseInt(datos[3]),Integer.parseInt(datos[4]));
        
        comandos = br.readLine();
        
        br.close();
        
	}
	
	private void leerComando(String comandos) {
		
		for (int i = 0; i < comandos.length(); i += 2) {
			
			if(comandos.charAt(i) == 'A') {
				
				this.avanzar(comandos.charAt(i + 1));
			}
			
			else if(comandos.charAt(i) == 'R') {
				
				
			}
			
		}
	}
	
	private void avanzar(int casilla) {
		
		switch (this.robot.getSentido()) {
		case  'N':
			
			robot.setPosicionY(robot.getPosicionY() + casilla);
			
			break;
			
        case  'E':
			
			robot.setPosicionX(robot.getPosicionX() + casilla);
			
			break;
			
        case  'S':
			
			robot.setPosicionY(robot.getPosicionY() - casilla);
			
			break;
			
        case  'O':
	
	        robot.setPosicionX(robot.getPosicionX() - casilla);
	
	    break;

		
	}
		
	}
	
	private void rotar(int cantRotacion) {
		
		
		
	}
	
	
	private String getComandos() {
		return comandos;
	}

	public static void main(String[] args) throws IOException {
		
		Tablero tablero1 = new Tablero();
		
		
		tablero1.leerArchivo();
		
		System.out.println(tablero1.robot);
		System.out.println(tablero1.getComandos());

}
	
}
