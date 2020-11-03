package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese precio: ");
		float precio = scn.nextFloat();
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = scn.nextInt();
		
		float total = precio * cantidad;
		
		float descuento = 0;
		
		if (cantidad > 8)
			descuento = 0.1f * total;
		
		float neto = total - descuento;
		
		System.out.println("\nResultados");
		System.out.println("================");
		System.out.println("Total es........: " + df.format(total));
		System.out.println("Descuento es....: " + df.format(descuento));
		System.out.println("Neto es.........: " + df.format(neto));





		
			
		
		

		
	}
	

}
