package coderHouseJavaClase01;

public class ejerciciosDeOperadoresRelacionados {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 *Ejercicios sobre Operadores Relacionales

    Comparar dos enteros y mostrar si el primero es mayor que el segundo.
    Verificar si un número es par usando el operador %.
    Comparar dos String para ver si son iguales.
    Crear una condición que verifique si un estudiante está aprobado (nota >= 6).
    Utilizar operadores lógicos para verificar si un número está entre 1 y 10.

		 */
		
		int a = 35;
		int b = 50;
		
		boolean comparacion = a > b;
		
		boolean par = (a % 2 == 0);
		
		String text1 = "Como esta?";
		String text2 = "How are you?";
		
		boolean text3 = text1.equals(text2);
		
		
		int nota = 3;
		if(nota >= 6) {
			//System.out.print("aprobado");
		}else {
			
			//System.out.print("reprobado");
		}
		
		int numero = 6;
		
		if(numero > 0 && numero <= 10) {
			System.out.print("true");
		}else {
			System.out.print("false");
		}
		
		
		
	}

}
