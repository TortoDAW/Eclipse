package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero3 {

	public static void main(String[] args) {
		
	Articulo[] lista = obtenerArticulos();
	
	System.out.println("Lista de articulos: ");
	for(int i = 0; i < lista.length; i++) {
		System.out.println("Nombre: "+lista[i].getNombre());
		System.out.println("Precio: "+lista[i].getPrecio()+"€");
		System.out.println("Descripcion: "+lista[i].getDescripcion());
	}

	}
	public static Articulo[] obtenerArticulos() {
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		try {
		      File myObj = new File("./Files/articulos.txt");
		      Scanner datos = new Scanner(myObj);
		      while (datos.hasNextLine()) {
		        String linea = datos.nextLine();
		        String[] campos = linea.split("@");
		        double precio = Double.parseDouble(campos[1]);
		        Articulo actual = new Articulo(campos[0], precio, campos[2]);
		        
		        lista.add(actual);
		      }
		      datos.close();
		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		Articulo[] array = new Articulo[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i);
		}
		return array;
	}

}
