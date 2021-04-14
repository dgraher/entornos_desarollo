import java.util.*;

public class CalculoBecaSinRefactorizar {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		double d;
		char fN;
		char fL;
		double b;
		double a=0;

		//Solicitamos los datos, asegurandose de que son correctos ( si no lo fuese, los vuelve a solicitar)
		
		do {
			System.out.println("Introduzca la distancia en en Km al centro de trabajo");
			d = Double.parseDouble(teclado.nextLine());
		} while (d <= 0);
		
		do {
			System.out.println("¿Es familia numerosa (S/N)?");
			fN=teclado.nextLine().charAt(0);
		} while (fN != 'S' && fN != 'N');
		
		do {
			System.out.println("¿Está el centro de trabajo fuera de la localidad de Alcalá (S/N)?");
			fL=teclado.nextLine().charAt(0);
		} while (fL != 'N' && fL != 'S');

		//Calculamos la beca base
		
		if (d > 10) {
			b = 130;
		} else {
			if (d >= 5) {
				b = 100;
			} else {
				if (d >= 1.5) {
					b =60;
				} else {
					b = 0;
				}
			}
		}
		if (fN == 'S') {
			a= a+ 0.08;
		}
		if (fL == 'S') {
			a= a + 0.02;
		}
		
		b = b + a * b;
		System.out.println("Le corresponde una beca de " + b + " euros");
	}


	


}
