import java.util.Scanner;

public class Ejercicio1 {
	
	public static void leerNumero() {
		Scanner scanner = new Scanner(System.in);

        // Solicitar un numero
        System.out.println("Ingresa un número entero:");
        int numero = scanner.nextInt();
     // Ver si es par o impar y escribir resultado
        if (numero % 2 == 0) {
        	for(int i=numero;i>=0;i-=2) {
        		System.out.println(i);
        	}   
        } else {
        	for(int i=numero;i>=1;i-=2) {
        		System.out.println(i);
        	}   
        }
        scanner.close();
        
        
	}

	public static void main(String[] args) {
		leerNumero();
	}

}
