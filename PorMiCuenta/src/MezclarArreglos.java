//Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma: 1ºA,1ºB,2ºA,2ºB...
import java.util.Scanner;

public class MezclarArreglos {
	
	public static void main(String[] args) {
		
		int[] a, b, c;
		
		a = new int[10];
		b = new int[10];
		c = new int[20];
		
		crearArray("Inserte los numeros del 1º array", a);
		
		crearArray("Inserte los numeros del 2º array", b);
		
		//junto los dos arays en uno solo
		int j = 0;// definimos la variable j para almacenar los numeros en ella (array c)
		
		for(int i = 0; i < 10; i++) {
			
			c[j] = a[i];
			j++; // mete el primer numero del primer array
			
			c[j] = b[i];
			j++; // mete el primer numero del segundo array
			
		//llega al final y ahora mete los dos segundos numeros, etc
		}
		
		System.out.println("Array conjunto");	
			
		for(int i = 0; i < c.length; i++) {
			
			System.out.print(c[i]+" ");
			
		}
			
	}
	
	public static void crearArray(String enunciado, int[] array) {
		Scanner patata = new Scanner(System.in);
		
		System.out.println(enunciado);
		
		for(int i=0; i<array.length;) {
			
			System.out.print((i+1)+". Numero: ");
			
			try {
					
				array[i] = Integer.parseInt(patata.nextLine().trim());
					
				i++; //asi no pasa al siguiente lugar hasta que no de error
				
			} catch(Exception e) {
					
				System.out.println("Error: inserte un numero");
					
			}
			
		}
	}
	
}
	
		
	
