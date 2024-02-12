package P00;
import java.util.Scanner;

public class Main {

	public static Scanner patata = new Scanner(System.in);
	
	public static void main(String[] args) {
		int nAlumnos;
		
		nAlumnos = pedirInt("Inserta el numero de Alumnos: ");
		
		Alumno[] array = new Alumno[nAlumnos];
		
		for(int i = 0; i < array.length; i++) {
			Alumno alu = new Alumno();
			
			System.out.print("Nombre Alu" + (i+1) + ": ");
			alu.setNombre(patata.nextLine().trim());
			
			System.out.print("Apellidos Alu" + (i+1) + ": ");
			alu.setApellidos(patata.nextLine());
			
			System.out.print("NRE Alu" + (i+1) + ": ");
			alu.setNre(patata.nextLine().trim());
			
			System.out.print("Email Alu" + (i+1) + ": ");
			alu.setEmail(patata.nextLine().trim());
			
			System.out.print("Direccion Alu" + (i+1) + ": ");
			alu.setDireccion(patata.nextLine());
			
			System.out.println();
			
			array[i] = alu;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("-------Alumno n" + (i+1) + "------");
			array[i].info();
			System.out.println();
		}
			
	}
	public static int pedirInt(String enunciado) {
		int numero = 0;
		boolean check = false;
		
		do {
			System.out.print(enunciado);
			try {
				numero = Integer.parseInt(patata.nextLine().trim());
				check = true;
			}catch(Exception e) {
				System.out.println("Error: inserta un numero!");
			}
		}while(!check);
		return numero;
	}

}
