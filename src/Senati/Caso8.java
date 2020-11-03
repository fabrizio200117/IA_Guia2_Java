package Senati;

import java.util.Scanner;

public class Caso8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese nota: ");
		int nota = scn.nextInt();
		String estado = "";
	    
		
		if (nota <= 7) {
			estado = "Sin palabras";
		}
		else if (nota <= 10) {
			estado = "Mala";
		}
		else if (nota <= 14) {
			estado = "Regular";
	    }
		else if (nota <= 17) {
			estado = "Notable";
	    }
		else if (nota <= 20) {
			estado = "Excelente";
	    }
		else 
			estado = "Nota no existe";



        if (nota >= 0 && nota <= 20)
        	System.out.println("Estado........: " + estado );
		
		
	}
		

}
