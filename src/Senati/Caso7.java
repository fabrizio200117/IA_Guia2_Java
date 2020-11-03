package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = scn.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = 0.03f * sueldo;
		else if (sueldo > 1500 && sueldo <=3000)
			impuesto = 0.08f * sueldo;
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		
		System.out.println("\nResultados");
		System.out.println("================");
		System.out.println("Impuesto es........: " + df.format(impuesto));
		
		
			 
	}


}
