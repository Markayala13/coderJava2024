package coderHouseJavaClase01;

public class EscribirSobreBuenasPracticas {
	
	public static void main (String [] args) {
		
		/*
		 * Ejercicios sobre Buenas Prácticas

    Escribir un código que declare variables siguiendo las convenciones de nomenclatura (camelCase).
    Agregar comentarios explicativos a un fragmento de código que declare y utilice variables.
    Refactorizar un código para eliminar variables innecesarias.
    Organizar un código en métodos para mejorar su legibilidad.
    Utilizar nombres descriptivos para las variables en un pequeño programa.

		 */
		
		string resolverTareasDeJava = 'of course';
		
		/* En este fragmento se verifica si un numero esta entre 1 y 10 si es asi
		 * s imprime true de lo contrario se imprime false
		 */
		
		
        int numero = 6;
		
		if(numero > 0 && numero <= 10) {
			//System.out.print("true");
		}else {
			//System.out.print("false");
		}
		
		/*
		 * int ancho = 5;
		 * int altura = 10;
        int area = ancho * altura; // Variable innecesaria

        System.out.println("El área del rectángulo es: " + area);
        
		 */
		
		/*
		 * int ancho = 5;
        int altura = 10;

        System.out.println("El área del rectángulo es: " + (ancho * altura)); // Cálculo directo
		 * 
		 */
        
		double baseDelTriangulo = 5.0; // Nombre descriptivo para la base
        double alturaDelTriangulo = 10.0; // Nombre descriptivo para la altura
        
        double areaDelTriangulo = (baseDelTriangulo * alturaDelTriangulo) / 2; // Cálculo del área
        
       // System.out.println("El área del triángulo es: " + areaDelTriangulo);
        
	}

}
