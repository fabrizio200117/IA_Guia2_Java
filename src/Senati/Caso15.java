package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Cliente: ");
		String nombre = scn.nextLine();
		System.out.print("Producto [TB/LT/MN/IM]: ");
		String cod_producto = scn.nextLine();
		System.out.print("Cantidad: ");
		int cantidad = scn.nextInt();
		
		scn.nextLine(); // Reiniciar la lectura de String
		
		System.out.print("Forma de pago [C1/C2]: ");
		String cod_forma = scn.nextLine();
		
		float precio = 0;
		String nombre_producto = "Producto Desconocido";
		switch (cod_producto) {
		    case "TB":
		    	precio = 350; 
		    	nombre_producto = "Tablet de 1GB";
		    	break;
		    case "LT":
		    	precio = 2300;
		    	nombre_producto = "Laptop Core I5 8GB RAM";
		    	break;
		    case "MN":
		    	precio = 850;
		    	nombre_producto = "Monitor 45´";
		    	break;
		    case "IM":
		    	precio = 680;
		    	nombre_producto = "Impresora HP";
		    	break;
		    default:
		    	precio = 0;
		}
		    
		float importe = precio * cantidad;
		
		float valor = 0;
		String forma_pago = "Forma de pago desconocido";
		switch (cod_forma) {
		    case "C1":
		    	// valor = importe - importe * 0.05f;
		    	valor = importe * 0.95f;
		    	forma_pago = "Contado";
		    	break;
		    case "C2":
		    	// valor = importe + importe * 0.12f;
		    	valor = importe * 1.12f;
		    	forma_pago = "Credito";
		    	break;
		}
		
		
		System.out.println("\nResultados");
		System.out.println("===============================================");
		System.out.println("Cliente.................: " + nombre);
		System.out.println("Producto................: " + nombre_producto);
		System.out.println("Precio..................: " + precio);
		System.out.println("Cantidad................: " + cantidad);
		System.out.println("Importe.................: " + importe);
		System.out.println("Forma de pago...........: " + forma_pago);
		if (cod_forma.equals("C1")) {
			System.out.println("Descuento...........: " + df.format(importe - valor));
		    System.out.println("Total a pagar.......: " + valor);
		}
		else if (cod_forma.equals("C2")) {
			System.out.println("Incremento..........: " + df.format(valor - importe));
		    System.out.println("Total a pagar.......: " + valor);
		}

	}

}	

		

		    	
		    	
		
		
		
		    
		    
		    	
		    
		    	
		    	
		




