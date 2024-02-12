import java.util.Scanner
public class EliminarPosicion {
	
	public static Scanner patata = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] numero;
		int posicion;
		int j = 0;
		
		System.out.println("Rellena un array con 10 numeros");
		
		do {
			numero = pedirInt();
		}while(!numerosPositivos(numero));
		
		System.out.print("Array inicial: ");
		
		for(int array : numero) {
			System.out.print(array+" ");
		}
		
		System.out.print("\nInserta la posicion del array que quieres eliminar: ");
			posicion = Integer.parseInt(patata.nextLine().trim());
		
		
		for(int i=1; i<11; i++) {
			if(numero[i] < numero[posicion]) {
				j++;
			}
		}
		
		numero[j] = -1;
		
		System.out.print("Array modificado: ");
		
		for(int array : numero) {
			System.out.print(array+" ");
		}
	}
	
	public static int[] pedirInt() {
		int array[] = new int[10];
		
		for(int i=0;i<array.length;) {
			
			System.out.print((i+1) + ". Numero: ");
			
			try {
				array[i] = Integer.parseInt(patata.nextLine().trim());
				i++;
			}catch(Exception e) {
				System.out.println("ERROR: has introducido una letra");
			}	
			
		}
		return array;
	}
	
	public static boolean numerosPositivos(int[] array) {
        for (int numero : array) {
            if (numero <= 0) {
                System.out.println("ERROR: Hay numeros menores que 1. Inténtalo de nuevo.");
                return false;
            }
        }
        return true;
	}
}
