package Main;



import java.util.ArrayList;
import java.util.Comparator;

import Comparadores.ComparadorxDia;
import Comparadores.ComparadorxFanatismo;
import Comparadores.ComparadorxMes;
import Comparadores.ComparadorxNombre;
import Models.FechaFestiva;



public class Main {

	public static void main(String[] args) {

		// 1 - Instanciamos varias Fechas festivas //
		FechaFestiva fecha_1 = new FechaFestiva(25, 12, "Navidad", 0.94);
		FechaFestiva fecha_2 = new FechaFestiva(25, 5, "Revolucion de Mayo", 0.25);
		FechaFestiva fecha_3 = new FechaFestiva(18, 12, "Argentina Campeón del Mundo 2022", 0.99);
		FechaFestiva fecha_4 = new FechaFestiva(24, 6, "Cumpleaños de Messi", 1.00);
		FechaFestiva fecha_5 = new FechaFestiva(2, 6, "Cumpleaños de Aguero", 0.80);
		FechaFestiva fecha_6 = new FechaFestiva(9, 7, "Dia de la Independencia", 1.00);
		FechaFestiva fecha_7 = new FechaFestiva(14, 2, "San Valentin", 0.99);
		FechaFestiva fecha_8 = new FechaFestiva(14, 7, "Aniversario de la 16ª copa america", 1.00);
		FechaFestiva fecha_9 = new FechaFestiva(21, 9, "Dia del Estudiante", 0.58);
		FechaFestiva fecha_10 = new FechaFestiva(9, 12, "Murio Boca", 0.99);

		// Instanciamos una lista para las fechas
		ArrayList<FechaFestiva> fechas = new ArrayList<FechaFestiva>();

		// Agregamos las fechas a la lista
		fechas.add(fecha_1);
		fechas.add(fecha_2);
		fechas.add(fecha_3);
		fechas.add(fecha_4);
		fechas.add(fecha_5);
		fechas.add(fecha_6);
		fechas.add(fecha_7);
		fechas.add(fecha_8);
		fechas.add(fecha_9);
		fechas.add(fecha_10);

		// 2 - Mostar las fechas  //
		System.out.println("------------------------ MOSTAR LISTA FECHAS ------------------------");
		for (FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}

		// 3  Comparador por Nombre  //
		Comparator<FechaFestiva> comparadorPorNombre = new ComparadorxNombre();
		fechas.sort(comparadorPorNombre);

		System.out.println("------------------------ POR NOMBRE ------------------------");
		for (FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}
		// 4  Mostar por ordenamiento natural //
		fechas.sort(null);

		System.out.println("------------------------ ORDENAMIENTO NATURAL ------------------------");
		for (FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}
		// 5 Comparador por Día  //
		Comparator<FechaFestiva> comparadorPorDia = new ComparadorxDia();
		fechas.sort(comparadorPorDia);

		System.out.println("------------------------ POR DIA ------------------------");
		for (FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}
		// 6 Comparador por Fanatismo  //
		Comparator<FechaFestiva> comparadorPorFanatismo = new ComparadorxFanatismo();
		Comparator<FechaFestiva> comparadorPorFanatismoReversed = comparadorPorFanatismo.reversed();
		fechas.sort(comparadorPorFanatismoReversed);

		System.out.println("------------------------ POR FANATISMO ------------------------");
		for (FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}
		// 7 Comparador por Mes //
		Comparator<FechaFestiva> comparadorPorMes = new ComparadorxMes();
		fechas.sort(comparadorPorMes);

		System.out.println("------------------------ POR MES ------------------------");
		for (FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}
		// 8 Comparador por Mes y Día  //
		Comparator<FechaFestiva> comparadorPorMesYDia = comparadorPorMes.thenComparing(comparadorPorDia);
		fechas.sort(comparadorPorMesYDia);

		System.out.println("------------------------ POR MES Y DIA ------------------------");
		for (FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}

		// 9 Comparador por Fanatismo (creciente) y Nombre (decrecinete)  //
		Comparator<FechaFestiva> comparadorPorNombreReversed = comparadorPorNombre.reversed();
		Comparator<FechaFestiva> comparadorPorFanatismoYNombre = comparadorPorFanatismo.thenComparing(comparadorPorNombreReversed);
		fechas.sort(comparadorPorFanatismoYNombre);

		System.out.println("------------------------ POR FANATISMO Y NOMBRE ------------------------");
		for (FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}
	}

}