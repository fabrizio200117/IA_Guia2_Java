package Senati;

import java.util.Scanner;

public class Caso13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1 = 0, num2 = 1;
		
		System.out.print("Primer numero: ");
		num1 = scn.nextInt();
		System.out.print("Segundo numero: ");
		num2 = scn.nextInt();
		System.out.print("Operacion [1-6]: ");
		int operacion = scn.nextInt();
		
		String calculo = "Desconocido";
		float respuesta = 0;
	
		switch (operacion) {
		    case 1:
		    	respuesta =  num1 + num2;
		    	calculo = "Suma";
		    	break;
		    case 2:
		    	respuesta =  num1 - num2;
		    	calculo = "Resta";
		    	break;
		    case 3:
		    	respuesta =  num1 * num2;
		    	calculo = "Producto";
		    	break;
		    case 4:
		    	if (num2 > 0)
		    	respuesta =  num1 / num2;
		    	calculo = "No es posible hallar la division entero";
		    	break;
		    case 5:
		    	if (num2 > 0)
		    	respuesta = num1 - num2;
		    	calculo = "No es posible hallar el resto entero";
		    	break;
		    case 6:
		    	respuesta = (float)(num1 + num2)/ 2;
		    	calculo = "Promedio";
		    	break;
		    default:
		    	calculo = "Desconocido";
		}
		
		System.out.println("==============");    	
	    System.out.println("Resultados");
		System.out.println("==============");
		System.out.println("Numero 1........: " + num1);
		System.out.println("Numero 2...........: " + num2);
		System.out.println("Operacion..........: " + calculo);
		System.out.println("Resultado......: " + respuesta);
		
				    	
		
		
	}
	
}
