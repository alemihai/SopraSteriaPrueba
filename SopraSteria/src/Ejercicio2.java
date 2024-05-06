import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio2 {
	
	public static void leerPersonas() {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		double mayores18=0;
		double menores18=0;
		double mascMayores18=0;
		double femMenores18=0;
		double mujeres=0;
		
		// Leer los datos del archivo de texto
		try (BufferedReader br = new BufferedReader(new FileReader("listaPersonas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null && personas.size() < 50) { // Leer hasta 50 personas
                String[] partes = linea.split(",");
                int edad = Integer.parseInt(partes[0]);
                char sexo = partes[1].charAt(0);
                personas.add(new Persona(sexo, edad)); // Añadir las personas al arraylist
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		// Recorrer el array y guardar los datos en variables
        for (Persona persona : personas) {
            if(persona.getEdad()>=18) {
            	mayores18++;
            	if(persona.getSexo()=='M') {
            		mascMayores18++;
            	}else {
            		mujeres++;
            	}
            }else {
            	menores18++;
            	if(persona.getSexo()=='F') {
            		femMenores18++;
            		mujeres++;
            	}
            }
        }
        System.out.println("Información de las personas,");
		System.out.println("Personas mayores de 18 años:");
        System.out.println(mayores18);
        System.out.println("Personas menores de 18 años:");
        System.out.println(menores18);
        System.out.println("Personas masculinas mayores de 18 años:");
        System.out.println(mascMayores18);
        System.out.println("Personas femeninas menores de 18 años:");
        System.out.println(femMenores18);
        System.out.println("Porcentaje que representan las personas mayores de 18:");
        System.out.println((mayores18/50)*100 + "%");
        System.out.println("Porcentaje que representan las mujeres:");
        System.out.println((mujeres/50)*100 + "%");
        
	}

	public static void main(String[] args) {
		leerPersonas();

	}

}
