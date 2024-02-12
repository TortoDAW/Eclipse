package Ejercicio9;

public class Principal{
	public static void main(String[] args) {
		
		String[] lista = Fichero.obtenerCosas();
		
		System.out.println("Lista de cosas: ");
		for(int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+"º: "+lista[i]);
		}

		}
}
