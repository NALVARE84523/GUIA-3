import clases.pen;
import java.util.Scanner;


public class Pendulo {

	public static void main(String[] args) {
// Clase nombre = new Clase();
		
		/*
		do{
		
		
		
		}while(CONDICION);
		
		while(CONDICION){
		
		
		}
		
		
		*/
		int flag = 0;
		do {
		
			Scanner leer = new Scanner(System.in);
			double l, g = 0;
			l = Double.parseDouble(leer.nextLine());
			g = Double.parseDouble(leer.nextLine());
			
			
			pen pen1 = new pen();
			pen1.setLongitud(l);
			pen1.setAceleracionGravitacional(g);
			pen1.calcularUno();
			System.out.println("Si desea salir, digite 1, de lo contrario digite 0");
			flag = Integer.parseInt(leer.nextLine());
		}while(flag != 0);

}
}