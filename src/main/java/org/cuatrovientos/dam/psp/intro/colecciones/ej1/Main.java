package org.cuatrovientos.dam.psp.intro.colecciones.ej1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		En el programa principal (Main), utiliza un ArrayList<Receta> para:
//
//			Añadir al menos 5 recetas a la lista.
//			Mostrar todas las recetas en pantalla.
//			Buscar recetas de un tipo concreto (ej: "Postre") e imprimirlas.
//			Eliminar una receta por nombre.
//			Mostrar la lista final después de la eliminación.
		
		Scanner scan= new Scanner(System.in);

		ArrayList<Receta> recetas = new ArrayList<>();
		Receta macarrones = new Receta("Macarrones", Duration.ofMinutes(35), Platos.Principal);
		Receta tartaQueso = new Receta("Tarta Queso", Duration.ofMinutes(2), Platos.Postre);
		Receta jamon = new Receta("Jamón", Duration.ofMinutes(2), Platos.Entrante);
		Receta queso = new Receta("Queso", Duration.ofMinutes(2), Platos.Entrante);

		recetas.add(macarrones);
		recetas.add(tartaQueso);
		recetas.add(jamon);
		recetas.add(queso);
		
		System.out.println("Las recetas que tenemos: ");
		for (int i=0;i<=recetas.size()-1;i++) {
			
			System.out.println(recetas.get(i).getNombre());
			
		}
		
		System.out.println("Buscar recetas: ");
		
		for (Receta r : recetas) {
		    if (r.getTiposPlatos() == Platos.Entrante) {
		        //System.out.println(r); con esto me saca el string si solo quiero el nombre lo siguiente
		    	System.out.println(r.getNombre());
		    }
		}
		
		
		//Eliminar una receta por nombre.
		
		System.out.println("Elimina una receta por el nombre");
		
		String nombreReceta= scan.nextLine();
		
		Receta recetaAEliminar = null;

		for (Receta r : recetas) {
		    if (r.getNombre().equalsIgnoreCase(nombreReceta)) {
		        recetaAEliminar = r;
		        break;
		    }
		}

		if (recetaAEliminar != null) {
		    recetas.remove(recetaAEliminar);
		    System.out.println("Receta eliminada.");
		} else {
		    System.out.println("NO tenemos esa receta");
		}
		
		
			
		
		//Mostrar la lista final después de la eliminación.
		System.out.println("Las recetas que quedan: ");
		
		for (Receta r: recetas) {
			
			System.out.println(r.getNombre());
		}
		

	}

}
