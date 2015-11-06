/*
 * Autor: Jorge Garc�a Rojo
 * 
 * Ejemplo de uso de GitHub
 * 
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.program.*;


public class Ejercicio1 extends GraphicsProgram{

	public void run(){

		//cambio el tama�o de la ventana
		setSize(800,600);
		//llamo al m�todo que dibuja la piramide
		pintaPiramide();
	}
	public void pintaPiramide(){

		int numeroLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		
		//querido yo del martes;
		//te falta lo m�s facil que es girar la pir�mide
		//att: tu yo del viernes

		for (int j=0; j< numeroLadrillosBase; j++){
			for (int i=0; i< numeroLadrillosBase-j; i++){
				GRect ladrillo = new GRect (anchoLadrillo, altoLadrillo);
				add(ladrillo, anchoLadrillo *j/2 + anchoLadrillo * i, altoLadrillo * j);
				pause(20);
			}

		}
	}
}