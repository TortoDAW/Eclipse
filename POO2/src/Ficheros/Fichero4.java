package Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Titulo: ");
		String titulo = teclado.nextLine().trim();
		System.out.print("Duracion: ");
		int duracion = Integer.parseInt(teclado.nextLine().trim());
		System.out.print("Sinopsis: ");
		String sinopsis = teclado.nextLine().trim();
		System.out.print("Genero: ");
		String genero = teclado.nextLine().trim();
		
		Pelicula peli = new Pelicula(titulo, duracion, sinopsis, genero);
		
		boolean resultado = insertar(peli);
		
	}
	public static boolean insertar(Pelicula peli) {
		String nuevaLinea = peli.getTitulo() + "="+ peli.getDuracion() +"="+peli.getSinopsis()+"="+peli.getGenero();
		
		try {
			FileWriter myWriter = new FileWriter("./Files/peliculas.txt", true);
			myWriter.write("\n"+nuevaLinea);
			myWriter.close();
		} catch (IOException e) {
			return false;
	    }
		return true;
	}
}
