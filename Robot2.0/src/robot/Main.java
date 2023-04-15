package robot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	private Robot robot;
	private static String comandos;
	private Tablero tablero;
	
private void leerArchivo() throws IOException {
		
		FileReader fr = null;
        BufferedReader br = null;

        fr = new FileReader ("robot.in"); 
        br = new BufferedReader(fr);
        
        String linea = br.readLine();
        
        String [] datos;
        datos = linea.split(" ");
        
        robot= new Robot(Integer.parseInt(datos[0]),Integer.parseInt(datos[1]), datos[2].charAt(0));
        tablero = new Tablero(Integer.parseInt(datos[3]),Integer.parseInt(datos[4]));
        
        comandos = br.readLine();
        
        br.close();
        
	}

private void leerComando(String comandos) {
	
	for (int i = 0; i < comandos.length(); i += 2) {
		
		if(comandos.charAt(i) == 'A') {
			
			robot.avanzar(Character.getNumericValue(comandos.charAt(i + 1)), tablero);;
		}
		
		else if(comandos.charAt(i) == 'R') {
			
			
		}
		
	}
}



public static String getComandos() {
	return comandos;
}

public static void main(String[] args) throws IOException {
	
	Main tablero1 = new Main();
	
	
	tablero1.leerArchivo();
	
	System.out.println(tablero1.robot);
	System.out.println(tablero1.getComandos());
	System.out.println(tablero1.tablero.getTamanioX() + " " + tablero1.tablero.getTamanioY());
	
	System.out.println(tablero1.robot.getPosicionX() + " " + tablero1.robot.getPosicionY());

	tablero1.leerComando(comandos);
	System.out.println(tablero1.robot.getPosicionX() + " " + tablero1.robot.getPosicionY());

}



}
