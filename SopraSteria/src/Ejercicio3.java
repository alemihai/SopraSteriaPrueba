import java.util.Scanner;

public class Ejercicio3 {

	public static void calcularSueldo() {
		Scanner scanner = new Scanner(System.in);
		double tarifaExtra=0;
		double horasExtra=0;
		double sueldo=0;
		
        // Solicitar horas y tarifa
        System.out.println("Ingresa el numero de horas trabajadas:");
        int horas = scanner.nextInt();
        System.out.println("Ingresa la tarifa:");
        int tarifa = scanner.nextInt();
        
        // Calcular sueldo en funcion de las horas trabajadas y la tarifa
        if(horas>40) {
        	tarifaExtra = tarifa*1.5;
        	horasExtra=horas-40;
        	sueldo=(40*tarifa)+(horasExtra*tarifaExtra);
        }else {
        	sueldo=horas*tarifa;
        }
        
        System.out.println(sueldo+"€");
        scanner.close();
	}
	
	public static void main(String[] args) {
		calcularSueldo();
	}

}
