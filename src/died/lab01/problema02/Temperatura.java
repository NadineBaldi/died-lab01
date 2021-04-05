package died.lab01.problema02;


public class Temperatura {

	private Double grados;
	private Escala escala;
	
	//constructores
	
	public Temperatura() {
		this.setGrados(0.0);
		this.setEscala(Escala.CELCIUS);
	}
	
	public Temperatura(Double grados, Escala escala) {
		this.grados = grados;
		this.escala = escala;
	}
	
	//métodos
	
	public String toString() {
		
		if (this.getEscala().equals(Escala.FAHRENHEIT)) {
			return (this.getGrados() + "F");
		}
		
		if (this.getEscala().equals(Escala.CELCIUS)) {
			return (this.getGrados() + "C");
		}
		return null;
		
	}
	
	public Double asCelcius() {
		
		if (this.getEscala().equals(Escala.CELCIUS)) {
			return this.getGrados();
		} else {
			double aux;
			aux = ((this.getGrados()-32)*5/9);
			return aux;
		}
	}
	
public Double asFahrenheit() {
		
		if (this.getEscala().equals(Escala.FAHRENHEIT)) {
			return this.getGrados();
		} else {
			double aux;
			aux = ((this.getGrados()*9/5)+32);
			return aux;
		}
	}

public Double aumentar(Temperatura temperatura) {
	
	if (temperatura.getGrados() > 0.0) {
		
		if (this.getEscala().equals(temperatura.getEscala())) {
			
			Double aux;
			aux  = this.getGrados()+temperatura.getGrados();
			
			this.setGrados(aux);
			
			return this.getGrados();
			
		} else {
			
			if (temperatura.getEscala().equals(Escala.CELCIUS)) {
				double aux2;
				aux2 = this.getGrados()+temperatura.asFahrenheit();
				
				this.setGrados(aux2);
				return this.getGrados();
				
			} else {
				double aux3, aux4;
				aux3 = temperatura.asCelcius();
				aux4 = this.getGrados()+aux3;
				
				this.setGrados(aux4);
				return this.getGrados();
			}
			
		}
		
	}
	
	return 0.0;
	
}

public Double disminuir(Temperatura temperatura) {
	
	if (temperatura.getGrados() > 0.0) {
		
		if (this.getEscala().equals(temperatura.getEscala())) {
			
			Double aux;
			aux  = this.getGrados()-temperatura.getGrados();
			
			this.setGrados(aux);
			return this.getGrados(); 
			
		} else {
			
			if (temperatura.getEscala().equals(Escala.CELCIUS)) {
				double aux1, aux2;
				aux1 = temperatura.asFahrenheit();
				aux2 = this.getGrados()-aux1;
				
				this.setGrados(aux2);
				return this.getGrados(); 
				
			} else {
				double aux3, aux4;
				aux3 = temperatura.asCelcius();
				aux4 = this.getGrados()-aux3;
				
				this.setGrados(aux4);
				return this.getGrados(); 
			}
			
		}
		
	}
	
	return 0.0;
	
}
	
	

	public Double getGrados() {
		return grados;
	}

	public void setGrados(Double grados) {
		this.grados = grados;
	}

	public Escala getEscala() {
		return escala;
	}

	public void setEscala(Escala escala) {
		this.escala = escala;
	}

}