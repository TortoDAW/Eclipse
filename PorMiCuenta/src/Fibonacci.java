/*import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
	
		int numero;
		
		do {
			numero = pedirInt("Introduce un numero positivo: ");
		}while(numero<=0);
		
		int resultado = fibonacci(numero);
		
		System.out.println("La serie de fibonacci del numero "+ numero+" es: "+resultado);
		
	}
	public static int pedirInt(String enunciado) {
		Scanner patata = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print(enunciado);
		
		try {
			numero = Integer.parseInt(patata.nextLine().trim());
		}catch(Exception e){
			System.out.println("Error: valor introducido erroneo");
		}
		
		return numero;
	}
	public static int fibonacci(int numero) {
		
		int a = 0, b = 1, aux;
		
		for(int i = 1; i <= numero; i++) {
			aux = a;
			a = b + aux;
			b = aux;
		}
		
		return a;
	}
}
*/
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int numero;

        do {
            numero = pedirInt("Introduce un numero positivo: ");
        } while (numero <= 0);

        int[] resultado = fibonacci(numero);

        System.out.println("La serie de fibonacci del numero " + numero + " es: ");
        for (int respuesta : resultado) {
            System.out.print(respuesta + " ");
        }
    }

    public static int pedirInt(String enunciado) {
        Scanner patata = new Scanner(System.in);

        int numero = 0;

        System.out.print(enunciado);

        try {
            numero = Integer.parseInt(patata.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Error: valor introducido erróneo");
        }

        return numero;
    }

    public static int[] fibonacci(int numero) {
        int[] serieFibonacci = new int[numero+1];

        int a = 0, b = 1, aux;

        for (int i = 0; i <= numero; i++) {
            serieFibonacci[i] = a;

            aux = a;
            a = b + aux;
            b = aux;
        }

        return serieFibonacci;
    }
}
