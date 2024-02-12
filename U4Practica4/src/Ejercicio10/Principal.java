package Ejercicio10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Cosa: ");
		String texto = teclado.nextLine().trim();
		
		Fichero cosas = new Fichero(texto);
		
		boolean resultado = insertar(cosas);
		
		if(resultado == true) {
			System.out.print("Cosa añadida exitosamente!");
		}else {
			System.out.print("Cosa no añadida!");
		}
		
	}
	public static boolean insertar(Fichero cosas) {
		String nuevaLinea = cosas.getTitulo();
		
		try {
			FileWriter myWriter = new FileWriter("./files/Cositas.txt", true);
			myWriter.write("\n"+nuevaLinea);
			myWriter.close();
		} catch (IOException e) {
			return false;
	    }
		return true;
	}
}
