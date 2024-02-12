package Ejercicio4;
/*
Escribe un método que se llame obtenerNumeroVecesSubCadena2() que recibe dos cadenas y devuelva el número de veces
que la segunda cadena está contenida en el texto de la primera sin distinguir mayúsculas.

Se recomienda probar el texto del ejemplo y utilizar un bucle de búsqueda que utilice la versión adecuada de indexOf() con un contador.
 */
public class Main {

	public static void main(String[] args) {
		
		String texto = "Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días";
		
		String textoBuscado = "en";
		
		System.out.println("Cadena: " + texto);
		System.out.println("Subadena: \"" + textoBuscado + "\"");
		
		int resultado = obtenerNumeroVecesSubCadena2(texto.toLowerCase(), textoBuscado.toLowerCase());
		System.out.println("Conteo de numero de veces que aparece \"" + textoBuscado + "\" en la cadena sin tener en cuenta mayus y min: " + resultado);
		
	}
	public static int obtenerNumeroVecesSubCadena2(String texto, String textoBuscado) {
		int contador = 0;
		
		while(texto.indexOf(textoBuscado) > -1) {
			texto = texto.substring(texto.indexOf(textoBuscado) + textoBuscado.length(), texto.length());
			contador++;
		}
		
		return contador;
	}
}
