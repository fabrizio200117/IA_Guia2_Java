package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		float bono = 0,desct = 0, meta = 0 ;
		
		System.out.print("Trabajador: ");
		String nombre = scn.nextLine();
		
		System.out.print("Horas trabajador: ");
		float horas = scn.nextFloat();
		
		System.out.print("Tarifa por horas: ");
		float tarifa = scn.nextFloat();
		
		System.out.print("Numero de minutos por tardanza: ");
		float tar = scn.nextFloat();
		
		float importe = horas * tarifa;
		
		if(horas > 60)
			bono = importe* 0.13f;
		else
			bono = importe * 0.04f;
		
		
		if(tar > 15)
			desct = importe * 0.03f;
			
		meta = horas/70 * 100;
		
		System.out.println("=====================");
		System.out.println("R E S U L T A D O S");
		System.out.println("=====================");
		System.out.println("Trabajador: " + nombre);
		System.out.println("Horas trabajadas: " + df.format(horas));
		System.out.println("Tarifa por horas " + df.format(tarifa));
		System.out.println("Importe: " + df.format(importe));
		System.out.println("Bono: " + df.format(bono));
		System.out.println("Descuento: " + df.format(desct));
		System.out.println("Meta alcanzada: " + df.format(meta));
		
	}
}