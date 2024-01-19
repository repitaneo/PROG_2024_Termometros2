package termometros2;

import java.util.Arrays;

public class Termometro {

	
	private float temperaturas[];
	private int donde;
	
	
	public Termometro() {
		
		temperaturas = new float[7];
		donde = 0;
	}


	@Override
	public String toString() {
		return "Termometro [" + Arrays.toString(temperaturas) + " - " + donde + "]";
	}


	
	
	public void add(float valor) {
		
		temperaturas[donde] = valor;
		donde++;
		
		if(donde == temperaturas.length) {
			donde = 0;
		}
	}
	
	
	
	public int buscarUltimo(float valor) {

		int posicion = -1;
		for (int i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i]==valor) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	
	
	public int buscarPrimero(float valor) {
	
		int posicion = -1;
		
		int i = 0;
		boolean encontrado = false;
		while((i<temperaturas.length)&&(!encontrado)) {
			
			if(temperaturas[i]==valor) {
				
				posicion = i;
				encontrado = true;
			}
			i++;
		}
		return posicion;
	}
	
	
	
}
