import java.util.*;

public class CalculoBecaRefactorizada {

	private static final double LIMITE_MAXIMO = 10;
	private static final double LIMITE_MEDIO = 5;
	private static final double LIMITE_MINIMO = 1.5;
	private static final double MAXIMO_BECA = 130;
	private static final double MEDIA_BECA = 110;
	private static final double MINIMO_BECA = 60;
	private static final double INCREMENTO_FAMILIA_NUMEROSA = 0.08;
	private static final double INCREMENTO_FUERA_ALCALA = 0.02;
	public static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// Un comentario
		double distancia, beca, porcentajeAumento=0;
		char familiaNumerosa, fueraDeAlcala;
		
	
		/*
		 * Este metodo hace tal y tal
		 */
		distancia=solicitarDistancia();
		familiaNumerosa=solicitarFamiliaNumerosa();
		fueraDeAlcala=solicitarSiEsDeFuera();

		beca = calcularBecaBase(distancia);
		
		beca = aplicarAumento(familiaNumerosa, fueraDeAlcala, beca, porcentajeAumento);
		
		System.out.println("Le corresponde una beca de " + beca + " euros");
	}
	/**
	 * 
	 * @return un caracter 'S' o 'N' indicando si es o no fuera de la localidad
	 */
	private static char solicitarSiEsDeFuera() {
		char fueraDeAlcala;
		do {
			System.out.println("¿Está el centro de trabajo fuera de la localidad de Alcalá (S/N)?");
			fueraDeAlcala=teclado.nextLine().charAt(0);
		} while (fueraDeAlcala != 'N' && fueraDeAlcala != 'S');
		return fueraDeAlcala;
	}

	private static char solicitarFamiliaNumerosa() {
		char familiaNumerosa;
		do {
			System.out.println("¿Es familia numerosa (S/N)?");
			familiaNumerosa=teclado.nextLine().charAt(0);
		} while (familiaNumerosa != 'S' && familiaNumerosa != 'N');
		return familiaNumerosa;
	}

	private static double solicitarDistancia() {
		double distancia;
		do {
			System.out.println("Introduzca la distancia en en Km al centro de trabajo");
			distancia = Double.parseDouble(teclado.nextLine());
		} while (distancia <= 0);
		return distancia;
	}

	private static double aplicarAumento(char familiaNumerosa, char fueraDeAlcala, double beca,
			double porcentajeAumento) {
		if (familiaNumerosa == 'S') {
			porcentajeAumento= porcentajeAumento+ INCREMENTO_FAMILIA_NUMEROSA;
		}
		if (fueraDeAlcala == 'S') {
			porcentajeAumento= porcentajeAumento + INCREMENTO_FUERA_ALCALA;
		}
		
		beca = beca + porcentajeAumento * beca;
		return beca;
	}
	
	/**
	 * Hay cuatro valores posibles, 0.... 
	 * @param distancia distancia del domicilio al centro (debe ser positiva)
	 * @return la cuantía base de la beca
	 */
	private static double calcularBecaBase(double distancia) {
		double beca;
		
		if (distancia > LIMITE_MAXIMO) {
			beca = MAXIMO_BECA;
		} else {
			if (distancia >= LIMITE_MEDIO) {
				beca = MEDIA_BECA;
			} else {
				if (distancia >= LIMITE_MINIMO) {
					beca = MINIMO_BECA;
				} else {
					beca = 0;
				}
			}
		}
		return beca;
	}

}
