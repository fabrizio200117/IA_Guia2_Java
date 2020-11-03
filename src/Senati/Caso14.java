package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Alumno: ");
		String alumno = scn.nextLine();
		System.out.print("Carrera [DS/RC/DG]: ");
		String carrera = scn.nextLine();
		
		System.out.print("Turno [M/T/N]: ");
		String turno = scn.nextLine();
		
		float monto = 0;
		String nombre_carrera = "Carrera Desconocido";
		switch (carrera) {
		    case "DS":
		    	monto = 1500; 
		    	nombre_carrera = "Desarrollo de Software";
		    	break;
		    case "RC":
		    	monto = 1400;
		    	nombre_carrera = "Redes y Conectividad";
		    	break;
		    case "DG":
		    	monto = 1300;
		    	nombre_carrera = "Diseño Grafico";
		    	break;
		    default:
		    	monto = 0;
		}


		float total_pagar = 0;
		float descuento = 0;
		
        String horario = "Desconocido";
        
		switch (turno) {
		    case "M":
		    	descuento = monto * 0.10f;
		    	total_pagar = monto - descuento;
		    	horario = "Mañana";
		    	break;
		    case "T":
		    	descuento = monto * 0.20f;
		    	total_pagar = monto - descuento;
		    	horario = "Tarde";
		    	break;
		    case "N":
		    	descuento = monto * 0.15f;
		    	total_pagar = monto - descuento;
		    	horario = "Noche";
		    	break;
		    default:
		    	descuento = 0; 
		    	  	
		}
		
		System.out.println("===============================================");
		System.out.println("Resultados");
		System.out.println("===============================================");
		System.out.println("Alumno.................: " + alumno);
		System.out.println("Carrera................: " + nombre_carrera);
		System.out.println("Turno..................: " + turno);
		System.out.println("Costo de la carrera....: " + monto);
		System.out.println("Descuento..................: " + descuento);
		System.out.println("Total a pagar..................: " + total_pagar);
		System.out.println("En $....................: " + df.format(total_pagar / (float) 3.33));

	}

}		