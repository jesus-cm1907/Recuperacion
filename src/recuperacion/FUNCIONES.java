package recuperacion;

public class FUNCIONES {

	public FUNCIONES() {
	}

	/**
	 * FUNCION QUE AL INTRODUCIR UNA CADENA NOS DEVUELVA CUANTAS VOCALES CONTIENE.
	 * 
	 */
	public int Entornos1(String palabra) {

		int contador = 0;

		for (int i = 0; i < palabra.length(); i++) {

			if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i')
					|| (palabra.charAt(i) == 'o' || (palabra.charAt(i) == 'u'))) {
				contador++;

			}
		}
		return contador;

	}

	/**
	 * 	FUNCION QUE DADA DOS CADENAS NOS DEVUELVA CUAL TIENE MAS CONSONANTES
	 */
	public String Entornos2(String palabra1, String palabra2) {

		
		int contadorConsonantes1 = 0;
		int contadorConsonantes2 = 0;
		String result = null;

		contadorConsonantes1 = contarConsonantes(palabra1);
		contadorConsonantes2 = contarConsonantes(palabra2);

		if (contadorConsonantes1 > contadorConsonantes2) {

			result = palabra1;

		} else if (contadorConsonantes1 < contadorConsonantes2) {

			result = palabra2;

		}

		return result;

	}
	private int contarConsonantes(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			
			if ((cadena.charAt(i) != 'a') && (cadena.charAt(i) != 'e') && (cadena.charAt(i) != 'o')
					&& (cadena.charAt(i) != 'i') && (cadena.charAt(i) != 'u')) {
				contador++;
			}
			
		}
		return contador;
	}

	/**
	 * FUNCION QUE DADA UNA LISTA DE NUMEROS,DEVUELVA LA SUMA DE TODOS LOS QUE SEAN
	 * 	 * MENORES A TU EDAD PERO MAYORES QUE LA MITAD DE TU EDAD
	 */

	public int funcion3(int[] numerosintroducidos) {

		int miEdad = 19;
		int sumatorio = 0;

		for (int i = 0; i < numerosintroducidos.length; i++) {

			if (numerosintroducidos[i] >= (miEdad/2) && numerosintroducidos[i] <= miEdad) {
				sumatorio += numerosintroducidos[i];
			}

		}
		return sumatorio;
	}

	/**
	 * FUNCION QUE DADA UNA LISTA DE NOTAS  ,DEVUELVA UNA CADENA INDICANDO SI LA 
	 * NOTA MEDIA  HA SIDO INSUFICIENTE(<5),SUFICIENTE(>=5 y <6) BIEN (>=6 y
	 * >7),NOTABLE(>=7 y <9) o SOBRESALIENTE(>=9 y 10)-
	 * 
	 */
	public String funcion4(int[] counter) {

		float sum = 0;
		double media;
		String resultado = null;

		for (int x = 0; x < counter.length; x++) {

			sum += counter[x];
			
		}

		media = sum / counter.length;

		if (media < 5) {
			resultado = "Insuficiente";
		} else if (media <= 5 && media < 6) {
			resultado = "Suficiente";
		} else if (media >= 6 && media < 7) {
			resultado = "Bien";

		} else if (media >= 7 && media < 9) {
			resultado = "Notabale";

		} else if (media >= 9 && media == 10) {
			resultado = "Sobresaliente";
		}
		return resultado;
	}

	/**
	 * FUNCION QUE DADO DOS NUMEROS Y UN CARACTER HAGA LO SIGUIENTE 
	 * (+)SUMA=NUMERO1 + NUMERO2. 
	 * (-)RESTA=NUMERO1-NUMERO2.
	 * (*)MULTIPLICACION NUMERO1 * NUMERO2.
	 * 
	 */
	public int funcion5(String caracter, int numero1, int numero2) {

		int valor = 0;

		if (caracter == "+") {
			valor = numero1 + numero2;

		} else if (caracter == "-") {
			valor = numero1 - numero2;

		} else if (caracter == "*") {

			valor = numero1 * numero2;

		} 
		return valor;
	}

}
 
 










