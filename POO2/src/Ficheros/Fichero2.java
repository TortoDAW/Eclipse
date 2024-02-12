package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero2 {

	public static void main(String[] args) {
		
	String[] lista = obtenerCosas();
	
	System.out.println("Lista de cosas: ");
	for(int i = 0; i < lista.length; i++) {
		System.out.println((i+1)+"º: "+lista[i]);
	}

	}
	public static String[] obtenerCosas() {
		ArrayList<String> lista = new ArrayList<String>();
		try {
		      File myObj = new File("./Files/cosas.txt");
		      Scanner datos = new Scanner(myObj);
		      while (datos.hasNextLine()) {
		        String linea = datos.nextLine();
		        lista.add(linea);
		      }
		      datos.close();
		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		String[] array = new String[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i);
		}
		return array;
	}

}
