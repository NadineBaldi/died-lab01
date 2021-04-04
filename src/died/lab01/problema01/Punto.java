package died.lab01.problema01;

public class Punto {
	
	float x;
	float y;
	

	public float getX() {
		return x;
	}



	public void setX(float x) {
		this.x = x;
	}



	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}
	
	public Punto(float x, float y) { //constructor
		this.x = x;
		this.y = y;
	}
	
	
	public boolean equals(Object otroPunto) { 
		
		Punto p = (Punto) otroPunto;
		
		if ((this.getX() != p.getX()) || (this.getY() != p.getY())) {  //comparo las coordenadas
			return false;
		}
		
		if (getClass() != otroPunto.getClass()) { //veo si es instancia de la clase Punto
			return false;
		}
		
		return true;
	}

}
