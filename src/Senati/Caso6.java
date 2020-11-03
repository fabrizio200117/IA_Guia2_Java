package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = scn.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo > 2800)
			impuesto = 0.05f * sueldo;
		else 
			impuesto = 0.02f * sueldo;
		
		
		System.out.println("\nResultados");
		System.out.println("================");
		System.out.println("Impuesto es........: " + df.format(impuesto));
	}

}
