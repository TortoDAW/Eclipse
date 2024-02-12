package Ejercicio12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Marca: ");
		String marca = teclado.nextLine().trim();
		System.out.print("Kilometraje: ");
		int kilometraje = Integer.parseInt(teclado.nextLine().trim());
		System.out.print("Color: ");
		String color = teclado.nextLine().trim();
		System.out.print("Modelo: ");
		String modelo = teclado.nextLine().trim();
		
		Archivo coche = new Archivo(marca, kilometraje, color, modelo);
		
		boolean resultado = insertar(coche);
		
	}
	public static boolean insertar(Archivo coche) {
		String nuevaLinea = coche.getMarca() + ",,"+ coche.getKilometraje() +",,"+coche.getColor()+",,"+coche.getModelo();
		
		try {
			FileWriter myWriter = new FileWriter("./files/coche.txt", true);
			myWriter.write("\n"+nuevaLinea);
			myWriter.close();
		} catch (IOException e) {
			return false;
	    }
		return true;
	}
}