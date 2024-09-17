package Comparadores;


import java.util.Comparator;

import Models.FechaFestiva;

public class ComparadorxNombre implements Comparator<FechaFestiva> {

	@Override
	public int compare(FechaFestiva fecha_1, FechaFestiva fecha_2) {
		return fecha_1.getNombre().compareToIgnoreCase(fecha_2.getNombre());
	}

}