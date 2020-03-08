import Clase.Ascensor;
import java.util.Scanner;

public class taller4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Presione 1 para subir
		 Presione 2 para bajar
		 Presione 3 para mostrar la cantidad de pisos
		 Presione 4 para salir
		 
		 System.out.println(" Presione 1 para subir \n Presione 2 para bajar")
		 
		 
		 Sintaxis de Switch case
		 
		 switch(var){
		 	case 1:
		 		
				ascensor1.subir();

		 	break;
		 	
		 	case 2:
		 		accion2;
		 	
		 	break;
		 	
		 	case 3:
		 		accion3;
		 	break;
		 	
		 	default:
		 		accion4;
		 		
		 	break;
		 
		 
		 
		 }
		 * 
		 * 
		 */
		int flag = 0;
		int opcion = 0;
		
		Ascensor ascensor1 = new Ascensor();
		
		ascensor1.setpisoActual(2);
		ascensor1.settotalPisos(4);
		ascensor1.settotalSotanos(2);
		
		do {
			System.out.println(" Presione 1 para subir \n Presione 2 para bajar \n Presione 3 para mostrar la cantidad de pisos \n Presione 4 para salir");
		Scanner leer = new Scanner(System.in);
		opcion = leer.nextInt();
		switch(opcion) {
		case 1:
			
			ascensor1.subir();
			
			break;
			
		case 2:
			
			ascensor1.bajar();
			
			break;
			
		case 3:
			
			System.out.println(ascensor1.calcularPisos());
			
			break;
			
		default:
		
			flag = 5;
			
			break;
		}
			
		}while(flag == 0);
		

	}
	
}
