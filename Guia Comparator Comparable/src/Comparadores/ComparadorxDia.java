package Comparadores;

import java.util.Comparator;

import Models.FechaFestiva;

public class ComparadorxDia implements Comparator<FechaFestiva> {

	@Override
	public int compare(FechaFestiva fecha_1, FechaFestiva fecha_2) {
		return Integer.compare(fecha_1.getDia(), fecha_2.getDia());
	}

}