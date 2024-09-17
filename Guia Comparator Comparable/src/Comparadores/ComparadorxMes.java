package Comparadores;


import java.util.Comparator;

import Models.FechaFestiva;

public class ComparadorxMes implements Comparator<FechaFestiva> {

	@Override
	public int compare(FechaFestiva fecha_1, FechaFestiva fecha_2) {
		return Integer.compare(fecha_1.getMes(), fecha_2.getMes());
	}

}