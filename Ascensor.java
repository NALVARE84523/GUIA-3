package Clase;

public class Ascensor {

	private int totalPisos;
	private int totalSotanos;
	private int pisoActual;
	
		public void settotalPisos(int total) {
			this.totalPisos = total;			
		}
		public void settotalSotanos(int total) {
			this.totalSotanos = total;
			
		}
		public void setpisoActual(int total) {
			this.pisoActual = total;
		}
		public int gettotalPisos() {
			return this.totalPisos;
		}
		public int gettotalSotanos() {
			return this.totalSotanos;
		}
		public int getpisoActual() {
			return this.pisoActual;
		}
		public void subir() {
			
			
			if((this.totalPisos - this.pisoActual) > 0) {
				// this.pisoActual = this.pisoActual + 1;
				// this.pisoActual++;
				// 4.523
				this.pisoActual++;
				if(this.pisoActual == 0 ) {
					
					this.pisoActual++;
				
				}
				System.out.println("Estamos subiendo al piso " + this.pisoActual);
				
				
				
			}else {
				System.out.println("Ya no hay mas pisos");
			}
			
			// totalPisos = 4
			// pisoActual = -1
			// 6
			//Si la resta de totalPisos y pisoActual es mayor a 0 -> subir piso
		}
		
		// pisoActual = -2
		// totalSotanos = 2
		// pisoActual > totalSotanos * -1
		
		public void bajar() {
			if(this.pisoActual > this.totalSotanos * -1) {
				this.pisoActual--;
				if(this.pisoActual == 0) {
					
					this.pisoActual--;
				}
				if(this.pisoActual > 0) {
					System.out.println("Estamos bajando al piso " + this.pisoActual);
				}else {
					System.out.println("Estamos bajando al sotano " + (this.pisoActual * -1));
				}
				
			}else {
				System.out.println("Ya no se puede bajar mas");
			}
			
		}
		
	public int calcularPisos() {
		int suma = this.totalPisos + this.totalSotanos;
		
		return suma;
		
	}
		
		
}
