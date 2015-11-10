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
		
		int altoPiramide = numeroLadrillosBase * altoLadrillo;
		int basePiramide = numeroLadrillosBase * anchoLadrillo;
		//terminado y probado con varios tama�os de ladrillo

		for (int j=0; j< numeroLadrillosBase; j++){
			for (int i=0; i< numeroLadrillosBase-j; i++){
				GRect ladrillo = new GRect (anchoLadrillo, altoLadrillo);
				
				add(ladrillo, 
						getWidth()/2 - basePiramide/2 + anchoLadrillo *j/2 + anchoLadrillo * i,
						getHeight() - altoLadrillo - altoLadrillo * j);
				pause(20);
			}

		}
	}
}