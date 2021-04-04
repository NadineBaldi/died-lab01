package died.lab01.problema03;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class Registro {
	
	private String ciudad;
	private Temperatura[] historico;
	private int capmax = 10; //inicializo con 10 por el ejemplo
	
	//constructores
	
	public Registro() {
		this.ciudad = "-";
		this.historico = new Temperatura[capmax];
	}
	
	public Registro(String ciudad) {
		this.ciudad = ciudad; 
		this.historico = new Temperatura[capmax];
	}
	
	//m�todos
	

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void imprimir() {
		
		System.out.println("Temperaturas registradas en: " + this.getCiudad());
		
		for (int i=0; i<historico.length; i++) {
			System.out.println(i + " " + historico[i]);
		}
	}
	
	public void agregar(Temperatura t) {
		
		int i;
		
		for (i=0; i<historico.length; i++) {
			if (historico[i]==null) {
				break;
			}
		}
		
		if (i != historico.length) { //compruebo si no est� lleno
			historico[i] = t;
		}
	}
	
	public Double MediaAsCelcius() {
		
		double sumaCelcius = 0.0;
		int tama�oMaximo=0;
		
		for (int i=0; i<historico.length; i++) {
			
			if(historico[i]!=null) { 
				if(historico[i].getEscala().equals(Escala.CELCIUS)) {
					sumaCelcius = sumaCelcius + historico[i].getGrados();
				} else {
					sumaCelcius = sumaCelcius + historico[i].asCelcius();
				}
				
				tama�oMaximo = i;
				
			} else {
				tama�oMaximo = i;
			}
		}
		
		return sumaCelcius/tama�oMaximo;
		
	}
	
	public Double MediaAsFahrenheit() {
		
		double sumaF = 0.0;
		int tama�oMaximo=0;
		
		for (int i=0; i<historico.length; i++) {
			
			if(historico[i]!=null) { 
				if(historico[i].getEscala().equals(Escala.FAHRENHEIT)) {
					sumaF = sumaF + historico[i].getGrados();
				} else {
					sumaF = sumaF + historico[i].asFahrenheit();
				}
				
				tama�oMaximo = i;
				
			} else {
				tama�oMaximo = i;
			}
		}
		
		return sumaF/tama�oMaximo;
		
	}

	public Temperatura maximo() {
		
		Temperatura aux = historico[0];
		
		for(int i=0; i<historico.length; i++) {
			
			if (historico[i].getGrados() > aux.getGrados()) {
					aux = historico[i];
				}
			
		}
		
		return aux;
	}
	

}
