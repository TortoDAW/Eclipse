package Ejercicio11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Archivo[] lista = obtenerCoches();
	
	for(int i = 0; i < lista.length; i++) {
		System.out.println("Marca: "+lista[i].getMarca());
		System.out.println("Km: "+lista[i].getKilometraje()+"km");
		System.out.println("Color: "+lista[i].getColor());
		System.out.println("Modelo: "+lista[i].getModelo());
		System.out.println();
	}

	}
	public static Archivo[] obtenerCoches() {
		ArrayList<Archivo> lista = new ArrayList<Archivo>();
		try {
		      File myObj = new File("./files/coche.txt");
		      Scanner datos = new Scanner(myObj);
		      while (datos.hasNextLine()) {
		        String linea = datos.nextLine();
		        String[] campos = linea.split(",,");
		        int kilometraje = Integer.parseInt(campos[1]);
		        Archivo actual = new Archivo(campos[0], kilometraje, campos[2], campos[3]);
		        
		        lista.add(actual);
		      }
		      datos.close();
		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		Archivo[] array = new Archivo[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i);
		}
		return array;
	}

}