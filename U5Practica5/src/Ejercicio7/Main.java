package Ejercicio7;
/*
Escribe un método que se llame reemplazaPalabras() que recibe una cadena con un texto y otra con una serie de términos separados por comas que deben ser sustituidos por asteriscos. Devuelve el texto con el correspondiente cambio.
Se recomienda utilizar StringBuilder y el método split() de String para separar cada término a rastrear. Al encontrar una palabra a sustituir por asteriscos se deben respetar la longitud de cada término .
 */
public class Main {

	public static void main(String[] args) {
		String texto = "Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
		String palabras = "JVM,Java,Oracle";
		
		System.out.println("Texto: " + texto);
		String textoMod = reemplazaPalabras(texto, palabras);
		System.out.println("Texto Modificado: " + textoMod);

	}
	public static String reemplazaPalabras(String texto, String terminos) {
		String[] palabras = texto.split(" ");
		String[] reemplazar = terminos.split(",");
		
		for(int i = 0; i < palabras.length; i++) {
			for(String term : reemplazar) {
				if(palabras[i].equalsIgnoreCase(term)) {
					StringBuilder asteriscos = new StringBuilder();
					for(int j = 0; j < palabras[i].length(); j++) {
						asteriscos.append("*");
					}
					palabras[i] = asteriscos.toString();
				}
			}
		}
		return String.join(" ", palabras);
	}

}
