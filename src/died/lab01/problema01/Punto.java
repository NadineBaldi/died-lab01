package died.lab01.problema01;

public class Punto {
	float x;
	float y;
	
	//constructor
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	

	//métodos
	
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
	
	public boolean equals(Object otroPunto) {
		
		Punto p = (Punto)otroPunto;
		
		if(getClass() == otroPunto.getClass() ) {
			
			if ((p.getX() == this.getX()) && (p.getY() == this.getY())) {
				
				return true;
			} else 
				return false;
			
		} else 
			return false;

	}

}
