package Models;

public class FechaFestiva {

	//Atributos//
	
	private int dia;
	private int mes;
	private String nombre;
	private double fanatismo;
	
	// CONSTRUCTOR
	public FechaFestiva(int dia, int mes, String nombre, double fanatismo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.nombre = nombre;
		this.fanatismo = fanatismo;
	}

    //  GETTERS Y SETTERS
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getFanatismo() {
		return fanatismo;
	}


	public void setFanatismo(double fanatismo) {
		this.fanatismo = fanatismo;
	}

	// to String
	@Override
	public String toString() {
		return "FechaFestiva [dia=" + dia + ", mes=" + mes + ", nombre=" + nombre + ", fanatismo=" + fanatismo + "]";
	}
	
	
     // metodo particular 
	public int getDiasTotales() {
		return (this.mes - 1) * 30 + this.dia;
		
	}
	
		public int comparator(FechaFestiva otraFecha) {
			
			int resultado = 0;
			if (this.getDiasTotales() > otraFecha.getDiasTotales()) {
				resultado = 1;
			} else if (this.getDiasTotales() < otraFecha.getDiasTotales()) {
				resultado = -1;
			}
						
			return resultado;
		}

	}
	
	
	
	
	
	
	

